package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.simple.JSONObject;

public class JSONLog extends Log {

    private FileWriter file;
    
    public JSONLog(List<LogCollection> logCollectionList) {
        this.logCollectionList = logCollectionList;
    }

    @Override
    public void write() throws Exception {
        generateJSONFile();
        fillJSON();
        closeFile();
    }

    public void fillJSON() throws Exception {
        for (LogCollection log : logCollectionList) {
            JSONObject obj = new JSONObject();
            obj.put("Humidade", log.getWeatherData().getHumidity());
            obj.put("Temperatura", log.getWeatherData().getTemperature());
            obj.put("Ação", log.getAction());
            obj.put("Pressão", log.getWeatherData().getPressure());
            obj.put("Data", DateUtil.dateToString(log.getWeatherData().getCustomDate().getDate()));
            file.write(obj.toJSONString());
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
