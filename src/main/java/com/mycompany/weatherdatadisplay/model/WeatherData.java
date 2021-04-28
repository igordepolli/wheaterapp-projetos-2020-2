package com.mycompany.weatherdatadisplay.model;

import java.util.Date;
import java.util.Objects;

public class WeatherData {

    private final CustomDate registrationDate;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
        registrationDate = new CustomDate();
    }

    public CustomDate getRegistrationDate() {
        return registrationDate;
    }

    public void setCustomDate(Date date) {
        this.registrationDate.setDate(date);
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
        if (!Objects.equals(this.registrationDate, other.registrationDate)) {
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
