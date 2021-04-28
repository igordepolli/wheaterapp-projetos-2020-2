package com.mycompany.weatherdatadisplay.model.average;

import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Averaging {

    protected WeatherDataCollection weatherDataCollection;

    public abstract List<List<List<WeatherData>>> modifyCollection();

    public abstract Double getAverageTemperature();

    public abstract Double getAverageHumidity();

    public abstract Double getAveragePressure();

    protected final List<List<WeatherData>> weatherListGroupedByYear() {
        Map<Integer, List<WeatherData>> weatherListGrouped = weatherDataCollection.getWeathers().stream().collect(Collectors.groupingBy(w -> w.getRegistrationDate().getYear()));
        List<List<WeatherData>> newList = new ArrayList<>(weatherListGrouped.values());

        return newList;
    }

    protected final Double temperatureAverage(List<List<List<WeatherData>>> listWeatherDate) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listWeatherDateAnnual : listWeatherDate) {
            sumAll += annualAverageTemperature(listWeatherDateAnnual);
        }
        return sumAll / listWeatherDate.size();
    }

    private Double annualAverageTemperature(List<List<WeatherData>> listWeatherDateAnnual) {
        Double sumYearly = 0.0;
        for (List<WeatherData> listWeatherDate : listWeatherDateAnnual) {
            sumYearly += courseAverageTemperature(listWeatherDate);
        }
        return sumYearly / listWeatherDateAnnual.size();
    }

    private Double courseAverageTemperature(List<WeatherData> listWeatherDateCourse) {
        Double sumCourse = 0.0;
        for (WeatherData weatherData : listWeatherDateCourse) {
            sumCourse += weatherData.getTemperature();
        }
        return sumCourse / listWeatherDateCourse.size();
    }

    protected final Double humidityAverage(List<List<List<WeatherData>>> listWeatherDate) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listWeatherDateAnnual : listWeatherDate) {
            sumAll += annualAverageHumidity(listWeatherDateAnnual);
        }
        return sumAll / listWeatherDate.size();
    }

    private Double annualAverageHumidity(List<List<WeatherData>> listWeatherDateAnnual) {
        Double sumYearly = 0.0;
        for (List<WeatherData> listWeatherDate : listWeatherDateAnnual) {
            sumYearly += courseAverageHumidity(listWeatherDate);
        }
        return sumYearly / listWeatherDateAnnual.size();
    }

    private Double courseAverageHumidity(List<WeatherData> listWeatherDateCourse) {
        Double sumCourse = 0.0;
        for (WeatherData weatherData : listWeatherDateCourse) {
            sumCourse += weatherData.getHumidity();
        }
        return sumCourse / listWeatherDateCourse.size();
    }

    protected final Double pressureAverage(List<List<List<WeatherData>>> listWeatherDate) {
        Double sumAll = 0.0;
        for (List<List<WeatherData>> listWeatherDateAnnual : listWeatherDate) {
            sumAll += annualAveragePressure(listWeatherDateAnnual);
        }
        return sumAll / listWeatherDate.size();
    }

    private Double annualAveragePressure(List<List<WeatherData>> listWeatherDateAnnual) {
        Double sumYearly = 0.0;
        for (List<WeatherData> listWeatherDate : listWeatherDateAnnual) {
            sumYearly += courseAveragePressure(listWeatherDate);
        }
        return sumYearly / listWeatherDateAnnual.size();
    }

    private Double courseAveragePressure(List<WeatherData> listWeatherDateCourse) {
        Double sumCourse = 0.0;
        for (WeatherData weatherData : listWeatherDateCourse) {
            sumCourse += weatherData.getPressure();
        }
        return sumCourse / listWeatherDateCourse.size();
    }

}
