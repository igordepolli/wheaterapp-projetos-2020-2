package com.mycompany.weatherdatadisplay.model;

import java.util.Date;

public class WeatherData {
    
    private Date date;
    private Double temperature;
    private Double humidity;
    private Double pressure;
    
    public void setMeasurements(Date date, Double temperature, Double humidity, Double pressure) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public Date getDate() {
        return date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }
    
}
