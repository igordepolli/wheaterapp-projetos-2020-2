package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogCollection;
import java.util.List;

public class XMLLog extends Log {
    
    public XMLLog(List<LogCollection> logCollectionList) {
        this.logCollectionList = logCollectionList;
    }
    
    @Override
    public void write() throws Exception {
        for (LogCollection log : logCollectionList) {
            System.out.println("XML: " + log.getWeatherData() + log.getAction());
        }
    }

}
