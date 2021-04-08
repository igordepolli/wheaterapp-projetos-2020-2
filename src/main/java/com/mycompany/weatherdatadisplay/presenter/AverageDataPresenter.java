package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.view.AverageDataView;
import java.util.List;

public class AverageDataPresenter implements IObserver {

    private final AverageDataView view;

    public AverageDataPresenter() {
        view = new AverageDataView();
        view.setLocation(440, 20);
        view.setVisible(true);
    }
    
    @Override
    public void update(List<WeatherData> weathers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public AverageDataView getView() {
        return view;
    }
    
}
