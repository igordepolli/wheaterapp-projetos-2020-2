package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.io.FileWriter;
import org.json.simple.JSONObject;

public class JSONLog implements ILog {

    private FileWriter file;

    public JSONLog() throws Exception {
        createFile();
    }

    @Override
    public void write(LogElement logElement) throws Exception {
        fillAndWriteJSON(logElement);
        file.flush();
    }

    @SuppressWarnings("unchecked")
    private void fillAndWriteJSON(LogElement logElement) throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("Humidade", logElement.getWeatherData().getHumidity() + "%");
        obj.put("Temperatura", logElement.getWeatherData().getTemperature() + "º C");
        obj.put("Ação", logElement.getAction());
        obj.put("Pressão", logElement.getWeatherData().getPressure() + " mb");
        obj.put("Data", DateUtil.dateToString(logElement.getWeatherData().getRegistrationDate().getDate()));
        
        file.write("Elemento: " + obj.toJSONString());
        file.write("\n");
    }
    
    private void createFile() throws Exception {
        file = new FileWriter("jsonlog.json");
    }

}
