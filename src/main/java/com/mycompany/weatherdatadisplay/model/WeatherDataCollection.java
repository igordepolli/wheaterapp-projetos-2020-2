package com.mycompany.weatherdatadisplay.model;

import java.util.ArrayList;
import java.util.Collections;

public class WeatherDataCollection implements ISubject {

    private final ArrayList<IObserver> observers;
    private final ArrayList<WeatherData> weathers;
    
    public WeatherDataCollection() {
        observers = new ArrayList<>();
        weathers = new ArrayList<>();
    }
    
    public void addWeatherData(WeatherData weatherData) {
        weathers.add(weatherData);
        notifyObservers();
    }
    
    public void removeWeatherData(WeatherData weatherData) {
        weathers.remove(weatherData);
        notifyObservers();
    }
    
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(Collections.unmodifiableList(weathers));
        });
    }
    
}