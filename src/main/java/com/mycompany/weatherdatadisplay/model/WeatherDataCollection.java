package com.mycompany.weatherdatadisplay.model;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;
import java.util.ArrayList;
import java.util.Collections;

public class WeatherDataCollection extends Subject {

    private static WeatherDataCollection instance = null;
    private final ArrayList<WeatherData> weathers;

    private WeatherDataCollection() {
        observers = new ArrayList<>();
        weathers = new ArrayList<>();
    }

    public static WeatherDataCollection getInstance() {
        if (instance == null) {
            instance = new WeatherDataCollection();
        }
        return instance;
    }

    public void addWeatherData(WeatherData weatherData) {
        weathers.add(weatherData);
        notifyObservers();
    }

    public void removeWeatherData(WeatherData weatherData) {
        weathers.remove(weatherData);
        notifyObservers();
    }

    public boolean weathersIsEmpty() {
        return weathers.isEmpty();
    }

    @Override
    protected void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(Collections.unmodifiableList(weathers));
        });
    }

    public ArrayList<IObserver> getObservers() {
        return observers;
    }

    public ArrayList<WeatherData> getWeathers() {
        return weathers;
    }

}
