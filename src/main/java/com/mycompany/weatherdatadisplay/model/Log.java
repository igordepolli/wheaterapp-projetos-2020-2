package com.mycompany.weatherdatadisplay.model;

import java.util.List;

public abstract class Log {
    
    protected List<LogCollection> logCollectionList;
   
    public abstract void write(String message);

    public final void addElementInLog(WeatherData weatherData, String action) {
        LogCollection logCollection = new LogCollection();
        logCollection.setWeatherData(weatherData);
        logCollection.setAction(action);
        
        logCollectionList.add(logCollection);
    }
}
