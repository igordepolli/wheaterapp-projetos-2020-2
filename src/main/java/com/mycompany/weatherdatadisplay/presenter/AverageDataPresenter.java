package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;
import com.mycompany.weatherdatadisplay.model.average.Averaging;
import com.mycompany.weatherdatadisplay.model.average.Daily;
import com.mycompany.weatherdatadisplay.model.average.Monthly;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.model.average.Weekly;
import com.mycompany.weatherdatadisplay.view.AverageDataView;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class AverageDataPresenter implements IObserver {

    private static AverageDataPresenter instance = null;
    private final AverageDataView view;
    private final WeatherDataCollection weatherDataCollection;
    private Averaging selectedItem;

    private AverageDataPresenter(WeatherDataCollection weatherDataCollection) {
        view = new AverageDataView();
        view.setLocation(440, 20);
        view.setVisible(true);
        this.weatherDataCollection = weatherDataCollection;
        defineInstanceOfSelectedItem();
        initListeners();
    }

    public static AverageDataPresenter getInstance(WeatherDataCollection weatherDataCollection) {
        if (instance == null) {
            instance = new AverageDataPresenter(weatherDataCollection);
        }
        return instance;
    }

    private void initListeners() {
        view.getCbCourse().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                defineInstanceOfSelectedItem();
                updateLabels();
            }
        });
    }

    private void defineInstanceOfSelectedItem() {
        int indexItem = view.getCbCourse().getSelectedIndex();

        switch (indexItem) {
            case 0:
                selectedItem = new Daily(weatherDataCollection);
                break;
            case 1:
                selectedItem = new Weekly(weatherDataCollection);
                break;
            case 2:
                selectedItem = new Monthly(weatherDataCollection);
                break;
        }
    }

    private void updateLabels() {
        view.getLbTemperature().setText(selectedItem.getAverageTemperature().toString() + " ?? C");
        view.getLbHumidity().setText(selectedItem.getAverageHumidity().toString() + "%");
        view.getLbPressure().setText(selectedItem.getAveragePressure().toString() + " mb");
    }

    private void restartLabels() {
        view.getLbTemperature().setText("TEMPERATURA");
        view.getLbHumidity().setText("HUMIDADE");
        view.getLbPressure().setText("PRESS??O");
        view.getLbNumberOfRecords().setText("NRO DE REGISTROS");
    }

    @Override
    public void update(List<WeatherData> weathers) {
        if (weathers.isEmpty()) {
            restartLabels();
        } else {
            view.getLbTemperature().setText(selectedItem.getAverageTemperature().toString() + "?? C");
            view.getLbHumidity().setText(selectedItem.getAverageHumidity().toString() + "%");
            view.getLbPressure().setText(selectedItem.getAveragePressure().toString() + " mb");
            view.getLbNumberOfRecords().setText(String.valueOf((weathers.size())));
        }
    }

    public AverageDataView getView() {
        return view;
    }

}
