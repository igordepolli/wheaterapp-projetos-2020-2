package com.mycompany.weatherdatadisplay.model.average;

import com.mycompany.weatherdatadisplay.model.WeatherData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Monthly extends Averaging {

    public Monthly() {
    }

    @Override
    public List<List<List<WeatherData>>> modifyCollection() {
        List<List<List<WeatherData>>> listOfDays = new ArrayList<>();
        List<List<WeatherData>> weatherListGroupedByYear = weatherListGroupedByYear();
        for (List<WeatherData> list : weatherListGroupedByYear) {
            Map<Integer, List<WeatherData>> weatherListGroupedByDay = list.stream().collect(Collectors.groupingBy(w -> w.getCustomDate().getMonthOfYear()));
            List<List<WeatherData>> newList = new ArrayList<>(weatherListGroupedByDay.values());
            listOfDays.add(newList);
        }
        return listOfDays;
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
