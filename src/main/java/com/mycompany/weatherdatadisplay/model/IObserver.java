package com.mycompany.weatherdatadisplay.model;

import java.util.List;

public interface IObserver {
    
    public void update(List<WeatherData> weathers);
    
}
