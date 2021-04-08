package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.view.LastWeatherDateView;
import java.util.List;

public class LastWeatherDatePresenter implements IObserver {

    private static LastWeatherDatePresenter instance = null;
    private LastWeatherDateView view;

    private LastWeatherDatePresenter() {
        view = new LastWeatherDateView();
        view.setLocation(20, 260);
        view.setVisible(true);
    }
    
    public static LastWeatherDatePresenter getInstance() {
        if (instance == null) {
            instance = new LastWeatherDatePresenter();
        }
        return instance;
    }
     
    @Override
    public void update(List<WeatherData> weathers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LastWeatherDateView getView() {
        return view;
    }
    
}
