package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogElement;
import com.mycompany.weatherdatadisplay.model.LogElementCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLLog extends Log {

    private Document document;
    private File file;

    public XMLLog(LogElementCollection logElements) {
        this.logElements = logElements;
    }

    @Override
    public void write() throws Exception {
        createDocument();
        fillDocument();
        saveDocument();
    }

    private void createDocument() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        document = documentBuilder.newDocument();
        Element weatherDataDisplay = document.createElement("WeatherDataDisplay");
        document.appendChild(weatherDataDisplay);
    }

    private void putLogCollection(LogElement logCollection) throws Exception {
        Node weatherDataDisplay = document.getFirstChild();

        Element element = document.createElement("Elemento");
        weatherDataDisplay.appendChild(element);

        Attr action = document.createAttribute("Ação");
        action.setValue(logCollection.getAction());
        element.setAttributeNode(action);

        Attr date = document.createAttribute("Data");
        date.setValue(DateUtil.dateToString(logCollection.getWeatherData().getCustomDate().getDate()));
        element.setAttributeNode(date);

        Attr temperature = document.createAttribute("Temperatura");
        temperature.setValue(logCollection.getWeatherData().getTemperature().toString());
        element.setAttributeNode(temperature);

        Attr humidity = document.createAttribute("Humidade");
        humidity.setValue(logCollection.getWeatherData().getHumidity().toString());
        element.setAttributeNode(humidity);

        Attr pressure = document.createAttribute("Pressão");
        pressure.setValue(logCollection.getWeatherData().getPressure().toString());
        element.setAttributeNode(pressure);
    }

    private void fillDocument() throws Exception {
        for (LogElement logCollection : logElements.getLogElements()) {
            putLogCollection(logCollection);
        }
    }

    private void writeDocument() throws Exception {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        
        Transformer transformer = tFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource source = new DOMSource(document);
        
        StreamResult result = new StreamResult(new File("xmlog.xml"));

        transformer.transform(source, result);
    }

    private void saveDocument() throws Exception {
        writeDocument();
    }
}
