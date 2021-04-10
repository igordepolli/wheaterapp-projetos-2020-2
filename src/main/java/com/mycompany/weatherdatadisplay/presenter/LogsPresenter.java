package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.logs.JSONLog;
import com.mycompany.weatherdatadisplay.model.logs.XMLLog;
import com.mycompany.weatherdatadisplay.view.LogsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LogsPresenter {

    private static LogsPresenter instance = null;
    private final LogsView view;
    private static Log log;

    private LogsPresenter() {
        view = new LogsView();
        view.setLocation(950, 20);
        view.setVisible(true);
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

            }
        });
    }

    private void defineInstanceOfSelectedItem() {
        int indexItem = view.getCbLog().getSelectedIndex();

        switch (indexItem) {
            case 0:
                log = new JSONLog();
                break;
            case 1:
                log = new XMLLog();
                break;
        }
    }
    
    public static Log getInstanceLog() {
        return log;
    }

    public LogsView getView() {
        return view;
    }

}
