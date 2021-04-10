package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;
import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.WeatherData;
import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.utils.DateUtil;
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
        view.setLocation(440, 260);
        view.setVisible(true);
        constructTableModel();
        initListeners();
    }

    public static RecordsPresenter getInstance() {
        if (instance == null) {
            instance = new RecordsPresenter();
        }
        return instance;
    }

    private void initListeners() {
        view.getBtRemoveRecords().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCollectionIsEmpty();
                    removeItemList();
                    JOptionPane.showMessageDialog(view, "Clima removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
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

    private void removeItemList() throws Exception {
        LogsPresenter logPresenter = LogsPresenter.getInstance();
        
        List<WeatherData> auxList = new ArrayList<>(collectionWeatherData.getWeathers());
        for (int i = 0; i < auxList.size(); i++) {
            if (view.getTbRecords().getSelectedRow() == i) {
                collectionWeatherData.removeWeatherData(auxList.get(i));
                logPresenter.addElementInLog(auxList.get(i), "Removido");
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
    
    private boolean checkCollectionIsEmpty() throws Exception {
        if (collectionWeatherData.getWeathers().isEmpty()) {
            throw new Exception("Não é possível remover de uma lista vazia!");
        }
        
        return false;
    }

    @Override
    public void update(List<WeatherData> weathers) {
        clearTable();
        for (WeatherData weatherData : weathers) {
            tbWeatherDatas.addRow(new Object[]{
                DateUtil.dateToString(weatherData.getCustomDate().getDate()),
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
