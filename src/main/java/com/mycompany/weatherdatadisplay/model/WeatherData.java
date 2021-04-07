package com.mycompany.weatherdatadisplay.model;

import java.util.ArrayList;
import java.util.Date;

public class WeatherData implements Observed {
    
    private ArrayList<Observer> observers;
    private Date date;
    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(date, temperature, humidity, pressure);
        }
    }
    
    public void setMeasurements(Date d, Double t, Double h, Double p) {
        this.date = d;
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        notifyObservers();
    }

}
