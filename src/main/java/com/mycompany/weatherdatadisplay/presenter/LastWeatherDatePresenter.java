package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
import com.mycompany.weatherdatadisplay.view.LastWeatherDateView;
import java.util.List;

public class LastWeatherDatePresenter implements IObserver {

    private static LastWeatherDatePresenter instance = null;
    private final LastWeatherDateView view;

    private LastWeatherDatePresenter() {
        view = new LastWeatherDateView();
        view.setLocation(20, 260);
        view.setVisible(true);
    }

    public static LastWeatherDatePresenter getInstance() {
        if (instance == null) {
            instance = new LastWeatherDatePresenter();
        }
        return instance;
    }

    private void restartLabels() {
        view.getLbDate().setText("DD/MM/AAAA");
        view.getLbTemperature().setText("TEMPERATURA");
        view.getLbHumidity().setText("HUMIDADE");
        view.getLbPressure().setText("PRESSÃO");
    }

    @Override
    public void update(List<WeatherData> weathers) {
        if (weathers.isEmpty()) {
            restartLabels();
        } else {
            WeatherData last = weathers.get(weathers.size() - 1);

            view.getLbDate().setText(DateUtil.dateToString(last.getCustomDate().getDate()));
            view.getLbHumidity().setText(last.getHumidity().toString());
            view.getLbPressure().setText(last.getPressure().toString());
            view.getLbTemperature().setText(last.getTemperature().toString());
        }
    }

    public LastWeatherDateView getView() {
        return view;
    }

}
