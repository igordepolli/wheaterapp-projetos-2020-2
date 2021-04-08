package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.view.LastWeatherDateView;
import java.util.List;

public class LastWeatherDatePresenter implements IObserver {

    private LastWeatherDateView view;

    public LastWeatherDatePresenter() {
        view = new LastWeatherDateView();
        view.setLocation(20, 260);
        view.setVisible(true);
    }
     
    @Override
    public void update(List<WeatherData> weathers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LastWeatherDateView getView() {
        return view;
    }
    
}
