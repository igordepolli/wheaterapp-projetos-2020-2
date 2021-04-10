package com.mycompany.weatherdatadisplay.model.average;

import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Averaging {

    public abstract List<List<List<WeatherData>>> modifyCollection();

    public abstract Double getAverageTemperature();

    public abstract Double getAverageHumidity();

    public abstract Double getAveragePressure();

    protected final List<List<WeatherData>> weatherListGroupedByYear() {
        WeatherDataCollection weatherDataCollection = WeatherDataCollection.getInstance();
        Map<Integer, List<WeatherData>> weatherListGrouped = weatherDataCollection.getWeathers().stream().collect(Collectors.groupingBy(w -> w.getCustomDate().getYear()));
        List<List<WeatherData>> newList = new ArrayList<>(weatherListGrouped.values());

        return newList;
    }

    protected final Double temperatureAverage(List<List<List<WeatherData>>> listYear) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listDate : listYear) {
            Double sumYearly = 0.0;
            Double averageYearly = 0.0;
            for (List<WeatherData> listWeatherDate : listDate) {
                Double sumDate = 0.0;
                Double averageDate = 0.0;
                for (WeatherData weatherData : listWeatherDate) {
                    sumDate += weatherData.getTemperature();
                }
                averageDate = sumDate / listWeatherDate.size();
                sumYearly += averageDate;
            }
            averageYearly = sumYearly / listDate.size();
            sumAll += averageYearly;
        }
        return sumAll / listYear.size();
    }

    protected final Double humidityAverage(List<List<List<WeatherData>>> listYear) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listDate : listYear) {
            Double sumYearly = 0.0;
            Double averageYearly = 0.0;
            for (List<WeatherData> listWeatherDate : listDate) {
                Double sumDate = 0.0;
                Double averageDate = 0.0;
                for (WeatherData weatherData : listWeatherDate) {
                    sumDate += weatherData.getHumidity();
                }
                averageDate = sumDate / listWeatherDate.size();
                sumYearly += averageDate;
            }
            averageYearly = sumYearly / listDate.size();
            sumAll += averageYearly;
        }
        return sumAll / listYear.size();
    }

    protected final Double pressureAverage(List<List<List<WeatherData>>> listYear) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listDate : listYear) {
            Double sumYearly = 0.0;
            Double averageYearly = 0.0;
            for (List<WeatherData> listWeatherDate : listDate) {
                Double sumDate = 0.0;
                Double averageDate = 0.0;
                for (WeatherData weatherData : listWeatherDate) {
                    sumDate += weatherData.getPressure();
                }
                averageDate = sumDate / listWeatherDate.size();
                sumYearly += averageDate;
            }
            averageYearly = sumYearly / listDate.size();
            sumAll += averageYearly;
        }
        return sumAll / listYear.size();
    }

}
