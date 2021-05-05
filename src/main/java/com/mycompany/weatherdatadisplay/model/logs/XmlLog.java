package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.io.File;
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

public class XmlLog implements ILog {

    private Document document;

    public XmlLog() throws Exception {
        createFile();
    }

    @Override
    public void write(LogElement logElement) throws Exception {
        createAppends(logElement);
        writeDocument();
    }

    private void createFile() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        document = documentBuilder.newDocument();
        Element weatherDataDisplay = document.createElement("WeatherDataDisplay");
        document.appendChild(weatherDataDisplay);
    }

    private void createAppends(LogElement logElement) throws Exception {
        Node weatherDataDisplay = document.getFirstChild();

        Element element = document.createElement("Elemento");
        weatherDataDisplay.appendChild(element);

        Attr action = document.createAttribute("Ação");
        action.setValue(logElement.getAction());
        element.setAttributeNode(action);

        Attr date = document.createAttribute("Data");
        date.setValue(DateUtil.dateToString(logElement.getWeatherData().getRegistrationDate().getDate()));
        element.setAttributeNode(date);

        Attr temperature = document.createAttribute("Temperatura");
        temperature.setValue(logElement.getWeatherData().getTemperature().toString() + "º C");
        element.setAttributeNode(temperature);

        Attr humidity = document.createAttribute("Humidade");
        humidity.setValue(logElement.getWeatherData().getHumidity().toString() + "%");
        element.setAttributeNode(humidity);

        Attr pressure = document.createAttribute("Pressão");
        pressure.setValue(logElement.getWeatherData().getPressure().toString() + " mb");
        element.setAttributeNode(pressure);
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
    
}
