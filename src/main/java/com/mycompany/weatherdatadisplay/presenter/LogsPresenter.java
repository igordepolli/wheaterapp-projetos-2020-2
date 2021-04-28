package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.logs.JSONLog;
import com.mycompany.weatherdatadisplay.model.logs.XMLLog;
import com.mycompany.weatherdatadisplay.view.LogsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import com.mycompany.weatherdatadisplay.model.logs.ManagerLog;

public class LogsPresenter {

    private static LogsPresenter instance = null;
    private final LogsView view;
    private ManagerLog log;

    private LogsPresenter(ManagerLog log) {
        this.log = log;
        view = new LogsView();
        view.setLocation(950, 20);
        view.setVisible(true);
        initListeners();
    }

    public static LogsPresenter getInstance(ManagerLog log) {
        if (instance == null) {
            instance = new LogsPresenter(log);
        }
        return instance;
    }

    private void initListeners() {
        view.getCbLog().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    defineInstanceOfSelectedItem();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        view.getBtSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    defineInstanceOfSelectedItem();
                    JOptionPane.showMessageDialog(view, "Log configurado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void defineInstanceOfSelectedItem() throws Exception {
        int indexItem = view.getCbLog().getSelectedIndex();

        switch (indexItem) {
            case 0:
                log.setLog(new JSONLog());
                break;
            case 1:
                log.setLog(new XMLLog());
                break;
        }
    }

    public LogsView getView() {
        return view;
    }

}
