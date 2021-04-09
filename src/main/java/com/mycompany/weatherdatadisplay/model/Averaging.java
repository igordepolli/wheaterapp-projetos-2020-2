package com.mycompany.weatherdatadisplay.model;

import java.util.List;

public abstract class Averaging {

    protected abstract List<List<WeatherData>> modifyCollection();

    protected final Double temperatureAverage(List<List<WeatherData>> weathers) {
        Double sumAll = 0.0;
        for (List<WeatherData> weatherDataList : weathers) {
            Double sumByDay = 0.0;
            Double averageDaily = 0.0;
            for (WeatherData weatherData : weatherDataList) {
                sumByDay += weatherData.getTemperature();
            }
            averageDaily = sumByDay / weatherDataList.size();
            sumAll += averageDaily;
        }
        return sumAll / weathers.size();
    }

    protected final Double humidityAverage(List<List<WeatherData>> weathers) {
        Double sumAll = 0.0;
        for (List<WeatherData> weatherDataList : weathers) {
            Double sumByDay = 0.0;
            Double averageDaily = 0.0;
            for (WeatherData weatherData : weatherDataList) {
                sumByDay += weatherData.getHumidity();
            }
            averageDaily = sumByDay / weatherDataList.size();
            sumAll += averageDaily;
        }
        return sumAll / weathers.size();
    }

    protected final Double pressureAverage(List<List<WeatherData>> weathers) {
        Double sumAll = 0.0;
        for (List<WeatherData> weatherDataList : weathers) {
            Double sumByDay = 0.0;
            Double averageDaily = 0.0;
            for (WeatherData weatherData : weatherDataList) {
                sumByDay += weatherData.getPressure();
            }
            averageDaily = sumByDay / weatherDataList.size();
            sumAll += averageDaily;
        }
        return sumAll / weathers.size();
    }
    
    public abstract Double getAverageTemperature();
    
    public abstract Double getAverageHumidity();
    
    public abstract Double getAveragePressure();

}
