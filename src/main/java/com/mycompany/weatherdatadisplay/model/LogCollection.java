package com.mycompany.weatherdatadisplay.model;

public class LogCollection {
    
    private String action;
    private WeatherData weatherData;
    
    public LogCollection() {
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    
}
