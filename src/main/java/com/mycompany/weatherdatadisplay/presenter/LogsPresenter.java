package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.view.LogsView;

public class LogsPresenter {

    private final LogsView view;

    public LogsPresenter() {
        view = new LogsView();
        view.setVisible(true);
    }
    
    public LogsView getView() {
        return view;
    }
    
}
