package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.utils.DateManipulation;
import com.mycompany.weatherdatadisplay.view.WeatherDataInputView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;

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
                try {
                    addWeatherData();
                    JOptionPane.showMessageDialog(view, "Dados de tempo inseridos com sucesso!");
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(view, "Ocorreu algum erro!");
                } finally {
                    cleanFields();
                }
            }
        });
    }
    
    public static WeatherDataInputPresenter getInstance() {
        if (instance == null) {
            instance = new WeatherDataInputPresenter();
        }
        return instance;
    }
    
    private void addWeatherData() throws ParseException {
        WeatherDataCollection weatherDataCollection = WeatherDataCollection.getInstance();
        WeatherData weatherData = new WeatherData();
        
        weatherData.setDate(DateManipulation.stringToDate(view.getTfDate().getText()));
        weatherData.setHumidity(Double.parseDouble(view.getTfHumidity().getText()));
        weatherData.setPressure(Double.parseDouble(view.getTfPressure().getText()));
        weatherData.setTemperature(Double.parseDouble(view.getTfTemperature().getText()));
        
        weatherDataCollection.addWeatherData(weatherData);
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
