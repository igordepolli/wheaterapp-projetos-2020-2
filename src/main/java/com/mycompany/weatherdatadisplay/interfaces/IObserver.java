package com.mycompany.weatherdatadisplay.interfaces;

import com.mycompany.weatherdatadisplay.model.WeatherData;
import java.util.List;

public interface IObserver {

    public void update(List<WeatherData> weathers);

}
