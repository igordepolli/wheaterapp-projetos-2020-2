package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.IObserver;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.utils.DateManipulation;
import com.mycompany.weatherdatadisplay.view.RecordsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class RecordsPresenter implements IObserver {

    private static RecordsPresenter instance = null;
    private final RecordsView view;
    private DefaultTableModel tbWeatherDatas;
    private final WeatherDataCollection collectionWeatherData;

    private RecordsPresenter() {
        view = new RecordsView();
        collectionWeatherData = WeatherDataCollection.getInstance();
        view.setLocation(440, 320);
        view.setVisible(true);
        constructTableModel();
        initListeners();
    }

    private void initListeners() {
        view.getBtRemoveRecords().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeItemList();
                JOptionPane.showMessageDialog(view, "Clima removido com sucesso!");
            }
        });
    }

    public static RecordsPresenter getInstance() {
        if (instance == null) {
            instance = new RecordsPresenter();
        }
        return instance;
    }

    private void constructTableModel() {
        tbWeatherDatas = new DefaultTableModel(
                new Object[][][][]{},
                new String[]{"Data", "Temperatura", "Humidade", "Pressão"}
        );

        view.getTbRecords().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbWeatherDatas.setNumRows(0);
        view.getTbRecords().setModel(tbWeatherDatas);
    }

    private void removeItemList() {
        List<WeatherData> auxList = new ArrayList<>(collectionWeatherData.getWeathers());
        for (int i = 0; i < auxList.size(); i++) {
            if (view.getTbRecords().getSelectedRow() == i) {
                collectionWeatherData.removeWeatherData(auxList.get(i));
            }
        }
    }

    private void clearTable() {
        if (tbWeatherDatas.getRowCount() > 0) {
            for (int i = tbWeatherDatas.getRowCount() - 1; i > -1; i--) {
                tbWeatherDatas.removeRow(i);
            }
        }
    }

    @Override
    public void update(List<WeatherData> weathers) {
        clearTable();
        for (WeatherData weatherData : weathers) {
            tbWeatherDatas.addRow(new Object[]{
                DateManipulation.dateToString(weatherData.getDate()),
                weatherData.getTemperature(),
                weatherData.getHumidity(),
                weatherData.getPressure()
            });
        }
    }

    public RecordsView getView() {
        return view;
    }

}
