package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import com.mycompany.weatherdatadisplay.view.WeatherDataInputView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class WeatherDataInputPresenter {

    private static WeatherDataInputPresenter instance = null;
    private final WeatherDataInputView view;

    private WeatherDataInputPresenter() {
        view = new WeatherDataInputView();
        view.setLocation(20, 20);
        view.setVisible(true);
        initListeners();
    }

    public static WeatherDataInputPresenter getInstance() {
        if (instance == null) {
            instance = new WeatherDataInputPresenter();
        }
        return instance;
    }

    private void initListeners() {
        view.getBtInclude().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addWeatherData();
                    JOptionPane.showMessageDialog(view, "Dados de tempo inseridos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                } finally {
                    cleanFields();
                }
            }
        });

        view.getBtCancel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanFields();
            }
        });
    }

    private void addWeatherData() throws Exception {
        Log log = LogsPresenter.getInstanceLog();
        
        if (log == null) {
            throw new Exception("Por favor, configure um log primeiro!");
        }
        
        if (checkFieldsIsEmpty()) {
            throw new Exception("TODOS os campos devem ser preenchidos!");
        }
        
        WeatherDataCollection weatherDataCollection = WeatherDataCollection.getInstance();
        WeatherData weatherData = new WeatherData();

        weatherData.setCustomDate(DateUtil.stringToDate(view.getTfDate().getText()));
        weatherData.setHumidity(Double.parseDouble(view.getTfHumidity().getText()));
        weatherData.setPressure(Double.parseDouble(view.getTfPressure().getText()));
        weatherData.setTemperature(Double.parseDouble(view.getTfTemperature().getText()));
        
        weatherDataCollection.addWeatherData(weatherData);
        log.addElementInLog(weatherData, "Included");
    }

    private void cleanFields() {
        view.getTfDate().setText("");
        view.getTfHumidity().setText("");
        view.getTfPressure().setText("");
        view.getTfTemperature().setText("");
    }
    
    private boolean checkFieldsIsEmpty() {
        return view.getTfDate().getText().replaceAll("\\s", "").equals("")
                && view.getTfHumidity().getText().equals("") 
                && view.getTfPressure().getText().equals("")
                && view.getTfTemperature().getText().equals("");
    }

    public WeatherDataInputView getView() {
        return view;
    }
}
