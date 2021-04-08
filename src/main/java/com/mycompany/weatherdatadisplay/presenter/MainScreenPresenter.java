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
    private final WeatherDataCollection collectionWeatherData;

    public MainScreenPresenter() {
        view = new MainScreenView();
        collectionWeatherData = WeatherDataCollection.getInstance();
        internalsFrames = new ArrayList<>();
        view.setSize(1400, 600);
        registerAllObservers();
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
        AverageDataPresenter display_2 = AverageDataPresenter.getInstance();
        LastWeatherDatePresenter display_3 = LastWeatherDatePresenter.getInstance();
        RecordsPresenter display_4 = RecordsPresenter.getInstance();
        
        internalsFrames.addAll(Arrays.asList(display_1.getView(), display_2.getView(), display_3.getView(), display_4.getView()));
    }

    private void registerAllObservers() {
        AverageDataPresenter observer_1 = AverageDataPresenter.getInstance();
        LastWeatherDatePresenter observer_2 = LastWeatherDatePresenter.getInstance();
        RecordsPresenter observer_3 = RecordsPresenter.getInstance();
        
        collectionWeatherData.registerObserver(observer_1);
        collectionWeatherData.registerObserver(observer_2);
        collectionWeatherData.registerObserver(observer_3);
    }

    public MainScreenView getView() {
        return view;
    }
}
