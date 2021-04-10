package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogCollection;
import java.util.List;

public class JSONLog extends Log {
    
    public JSONLog(List<LogCollection> logCollectionList) {
        this.logCollectionList = logCollectionList;
    }
    
    @Override
    public void write() {
        for (LogCollection log : logCollectionList) {
            System.out.println("JSON: " + log.getWeatherData() + log.getAction());
        }
    }

}
