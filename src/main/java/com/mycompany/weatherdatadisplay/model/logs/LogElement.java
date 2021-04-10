package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.WeatherData;

public class LogElement {

    private String action;
    private WeatherData weatherData;

    public LogElement() {
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
