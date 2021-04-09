package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.view.LogsView;

public class LogsPresenter {

    private static LogsPresenter instance = null;
    private final LogsView view;

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

    }

    public LogsView getView() {
        return view;
    }

}
