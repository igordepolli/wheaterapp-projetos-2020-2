package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogElement;
import com.mycompany.weatherdatadisplay.model.LogElementCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class JSONLog extends Log {

    private FileWriter file;

    public JSONLog(LogElementCollection logElements) {
        this.logElements = logElements;
    }

    @Override
    public void write() throws Exception {
        generateJSONFile();
        fillAndWriteJSON();
        closeFile();
    }

    @SuppressWarnings("unchecked")
    private void fillAndWriteJSON() throws Exception {
        for (LogElement log : logElements.getLogElements()) {
            JSONObject obj = new JSONObject();
            obj.put("Humidade", log.getWeatherData().getHumidity());
            obj.put("Temperatura", log.getWeatherData().getTemperature());
            obj.put("Ação", log.getAction());
            obj.put("Pressão", log.getWeatherData().getPressure());
            obj.put("Data", DateUtil.dateToString(log.getWeatherData().getCustomDate().getDate()));
            file.write("Elemento: " + obj.toJSONString());
            file.write("\n");
        }
    }

    private void generateJSONFile() throws IOException {
        file = new FileWriter("jsonlog.json");
    }

    private void closeFile() throws Exception {
        file.flush();
        file.close();
    }

}
