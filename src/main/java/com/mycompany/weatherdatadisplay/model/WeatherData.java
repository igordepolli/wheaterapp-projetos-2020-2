package com.mycompany.weatherdatadisplay.model;

import java.util.Date;
import java.util.Objects;

public class WeatherData {

    private Date date;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
    }

    public WeatherData(Date date, Double temperature, Double humidity, Double pressure) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherData{" + "date=" + date + ", temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeatherData other = (WeatherData) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.temperature, other.temperature)) {
            return false;
        }
        if (!Objects.equals(this.humidity, other.humidity)) {
            return false;
        }
        if (!Objects.equals(this.pressure, other.pressure)) {
            return false;
        }
        return true;
    }

}
