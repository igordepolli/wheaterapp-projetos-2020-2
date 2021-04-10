package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogCollection;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.logs.JSONLog;
import com.mycompany.weatherdatadisplay.model.logs.XMLLog;
import com.mycompany.weatherdatadisplay.view.LogsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LogsPresenter {

    private static LogsPresenter instance = null;
    protected List<LogCollection> logCollectionList;
    private final LogsView view;
    private static Log log;

    private LogsPresenter() {
        view = new LogsView();
        view.setLocation(950, 20);
        view.setVisible(true);
        logCollectionList = new ArrayList<>();
        initListeners();
    }

    public static LogsPresenter getInstance() {
        if (instance == null) {
            instance = new LogsPresenter();
        }
        return instance;
    }

    private void initListeners() {
        view.getCbLog().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                defineInstanceOfSelectedItem();
            }
        });

        view.getBtSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCollectionIsEmpty();
                    log.write();
                    JOptionPane.showMessageDialog(view, "Log gerado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void defineInstanceOfSelectedItem() {
        int indexItem = view.getCbLog().getSelectedIndex();

        switch (indexItem) {
            case 0:
                log = new JSONLog(logCollectionList);
                break;
            case 1:
                log = new XMLLog(logCollectionList);
                break;
        }
    }
    
    public final void addElementInLog(WeatherData weatherData, String action) {
        LogCollection logCollection = new LogCollection();
        logCollection.setWeatherData(weatherData);
        logCollection.setAction(action);
        
        logCollectionList.add(logCollection);
    }
    
    private void checkCollectionIsEmpty() throws Exception {
        if (logCollectionList.isEmpty()) {
            throw new Exception("Insira/Remove ao menos um elemento para gerar o log!");
        }
    }
    
    public static void checkLogHasBeenInstantiated() throws Exception {
        if (log == null) {
            throw new Exception("Por favor, configure um log primeiro!");
        }
    }

    public LogsView getView() {
        return view;
    }

}
