package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.view.RecordsView;
import java.util.List;

public class RecordsPresenter implements IObserver {

    private RecordsView view;

    public RecordsPresenter() {
        view = new RecordsView();
        view.setLocation(440, 320);
        view.setVisible(true);
    }
    
    @Override
    public void update(List<WeatherData> weathers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RecordsView getView() {
        return view;
    }
    
}