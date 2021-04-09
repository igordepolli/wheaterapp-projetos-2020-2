package com.mycompany.weatherdatadisplay.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Daily extends Averaging {

    public Daily() {
    }

    @Override
    protected List<List<WeatherData>> modifyCollection() {
        WeatherDataCollection weatherDataCollection = WeatherDataCollection.getInstance();
        Map<Date, List<WeatherData>> weatherListGrouped = weatherDataCollection.getWeathers().stream().collect(Collectors.groupingBy(w -> w.getDate()));
        List<List<WeatherData>> newList = new ArrayList<>(weatherListGrouped.values());

        return newList;
    }

    @Override
    public Double getAverageTemperature() {
        return temperatureAverage(modifyCollection());
    }

    @Override
    public Double getAverageHumidity() {
        return humidityAverage(modifyCollection());
    }

    @Override
    public Double getAveragePressure() {
        return pressureAverage(modifyCollection());
    }

}
