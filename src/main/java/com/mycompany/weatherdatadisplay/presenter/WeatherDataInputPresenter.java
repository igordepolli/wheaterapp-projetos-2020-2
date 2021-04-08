package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.view.WeatherDataInputView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherDataInputPresenter {
    
    private static WeatherDataInputPresenter instance = null;
    private final WeatherDataInputView view;

    private WeatherDataInputPresenter() {
        view = new WeatherDataInputView();
        view.setLocation(20, 20);
        view.setVisible(true);
        
        view.getBtInclude().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                cleanFields();
            }
        });
    }
    
    public static WeatherDataInputPresenter getInstance() {
        if (instance == null) {
            instance = new WeatherDataInputPresenter();
        }
        return instance;
    }
    
    private void addWeatherData() {
        
    }
    
    private void cleanFields() {
        view.getTfDate().setText("");
        view.getTfHumidity().setText("");
        view.getTfPressure().setText("");
        view.getTfTemperature().setText("");
    }
        
    public WeatherDataInputView getView() {
        return view;
    }
}
