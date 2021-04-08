package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.view.MainScreenView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JInternalFrame;

public class MainScreenPresenter {
    
    private final MainScreenView view;
    private final List<JInternalFrame> internalsFrames;
    private final WeatherDataCollection collection;
    
    public MainScreenPresenter() {
        view = new MainScreenView();
        collection = WeatherDataCollection.getInstance();
        internalsFrames = new ArrayList<>();
        view.setSize(1400, 600);
        fillInternalsFrames();
        openViews();
    }
    
    private void openViews() {
        internalsFrames.forEach(internalFrame -> {
            view.add(internalFrame);
        });
    }
    
    private void fillInternalsFrames() {
        WeatherDataInputPresenter display_1 = WeatherDataInputPresenter.getInstance();
        AverageDataPresenter display_2 = new AverageDataPresenter();
        LastWeatherDatePresenter display_3 = new LastWeatherDatePresenter();
        RecordsPresenter display_4 = new RecordsPresenter();
        internalsFrames.addAll(Arrays.asList(display_1.getView(), display_2.getView(), display_3.getView(), display_4.getView()));
    }
    
    public MainScreenView getView() {
        return view;
    }
}
