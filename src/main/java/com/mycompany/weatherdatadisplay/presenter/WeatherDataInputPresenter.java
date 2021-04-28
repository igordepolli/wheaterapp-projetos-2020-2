package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.logs.LogElement;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import com.mycompany.weatherdatadisplay.view.WeatherDataInputView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import com.mycompany.weatherdatadisplay.model.logs.ManagerLog;

public class WeatherDataInputPresenter {

    private static WeatherDataInputPresenter instance = null;
    private final WeatherDataInputView view;
    private final WeatherDataCollection collectionWeatherData;
    private final ManagerLog log;

    private WeatherDataInputPresenter(WeatherDataCollection collectionWeatherData, ManagerLog log) {
        view = new WeatherDataInputView();
        view.setLocation(20, 20);
        view.setVisible(true);
        this.collectionWeatherData = collectionWeatherData;
        this.log = log;
        initListeners();
    }

    public static WeatherDataInputPresenter getInstance(WeatherDataCollection collectionWeatherData, ManagerLog log) {
        if (instance == null) {
            instance = new WeatherDataInputPresenter(collectionWeatherData, log);
        }

        return instance;
    }

    private void initListeners() {
        view.getBtInclude().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkFieldsIsEmpty();
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
        WeatherData weatherData = new WeatherData();
        weatherData.setCustomDate(DateUtil.stringToDate(view.getTfDate().getText()));
        weatherData.setHumidity(Double.parseDouble(view.getTfHumidity().getText()));
        weatherData.setPressure(Double.parseDouble(view.getTfPressure().getText()));
        weatherData.setTemperature(Double.parseDouble(view.getTfTemperature().getText()));
        collectionWeatherData.addWeatherData(weatherData);

        LogElement logElement = new LogElement();
        logElement.setAction("Incluído");
        logElement.setWeatherData(weatherData);
        log.write(logElement);
    }

    private void cleanFields() {
        view.getTfDate().setText("");
        view.getTfHumidity().setText("");
        view.getTfPressure().setText("");
        view.getTfTemperature().setText("");
    }

    private boolean fieldsIsEmpty() {
        return view.getTfDate().getText().replaceAll("\\s", "").equals("//")
                || view.getTfHumidity().getText().equals("")
                || view.getTfPressure().getText().equals("")
                || view.getTfTemperature().getText().equals("");
    }

    private void checkFieldsIsEmpty() throws Exception {
        if (fieldsIsEmpty()) {
            throw new Exception("TODOS os campos devem ser preenchidos!");
        }
    }

    public WeatherDataInputView getView() {
        return view;
    }
}
