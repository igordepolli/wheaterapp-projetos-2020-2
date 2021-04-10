package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.LogElementCollection;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.view.MainScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JInternalFrame;

public class MainScreenPresenter {

    private static MainScreenPresenter instance = null;
    private final MainScreenView view;
    private final List<JInternalFrame> internalsFrames;
    private final WeatherDataCollection collectionWeatherData;
    private final LogElementCollection logElements;

    private MainScreenPresenter() {
        view = new MainScreenView();
        collectionWeatherData = WeatherDataCollection.getInstance();
        logElements = LogElementCollection.getInstance();
        internalsFrames = new ArrayList<>();
        view.setSize(1400, 600);
        registerAllObservers();
        fillInternalsFrames();
        openViews();
        initListeners();
    }

    public static MainScreenPresenter getInstance() {
        if (instance == null) {
            instance = new MainScreenPresenter();
        }
        return instance;
    }

    private void initListeners() {
        view.getMiGenerateLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogsPresenter display_5 = LogsPresenter.getInstance(logElements);
                view.add(display_5.getView());
            }
        });
    }

    private void openViews() {
        internalsFrames.forEach(internalFrame -> {
            view.add(internalFrame);
        });
    }

    private void fillInternalsFrames() {
        WeatherDataInputPresenter display_1 = WeatherDataInputPresenter.getInstance(collectionWeatherData, logElements);
        AverageDataPresenter display_2 = AverageDataPresenter.getInstance();
        LastWeatherDatePresenter display_3 = LastWeatherDatePresenter.getInstance();
        RecordsPresenter display_4 = RecordsPresenter.getInstance(collectionWeatherData, logElements);

        internalsFrames.addAll(Arrays.asList(display_1.getView(), display_2.getView(), display_3.getView(), display_4.getView()));
    }

    private void registerAllObservers() {
        AverageDataPresenter observer_1 = AverageDataPresenter.getInstance();
        LastWeatherDatePresenter observer_2 = LastWeatherDatePresenter.getInstance();
        RecordsPresenter observer_3 = RecordsPresenter.getInstance(collectionWeatherData, logElements);

        collectionWeatherData.registerObserver(observer_1);
        collectionWeatherData.registerObserver(observer_2);
        collectionWeatherData.registerObserver(observer_3);
    }

    public MainScreenView getView() {
        return view;
    }
}
