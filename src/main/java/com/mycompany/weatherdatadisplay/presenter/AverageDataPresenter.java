package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;
import com.mycompany.weatherdatadisplay.model.Averaging;
import com.mycompany.weatherdatadisplay.model.Daily;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.view.AverageDataView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AverageDataPresenter implements IObserver {

    private static AverageDataPresenter instance = null;
    private final AverageDataView view;
    private Averaging selectedItem;

    private AverageDataPresenter() {
        view = new AverageDataView();
        view.setLocation(440, 20);
        view.setVisible(true);
        defineInstanceOfSelectedItem();
        initListeners();
    }

    public static AverageDataPresenter getInstance() {
        if (instance == null) {
            instance = new AverageDataPresenter();
        }
        return instance;
    }

    private void initListeners() {
        view.getCbCourse().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                defineInstanceOfSelectedItem();
            }
        });
    }
    
    private void defineInstanceOfSelectedItem() {
        int indexItem = view.getCbCourse().getSelectedIndex();
        
        switch(indexItem) {
            case 0:
                selectedItem = new Daily();
        }
    }

    @Override
    public void update(List<WeatherData> weathers) {
        view.getLbTemperature().setText(selectedItem.getAverageTemperature().toString());
    }

    public AverageDataView getView() {
        return view;
    }

}
