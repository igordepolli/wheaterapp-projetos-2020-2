package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.Log;
import com.mycompany.weatherdatadisplay.model.LogElementCollection;
import com.mycompany.weatherdatadisplay.model.logs.JSONLog;
import com.mycompany.weatherdatadisplay.model.logs.XMLLog;
import com.mycompany.weatherdatadisplay.view.LogsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class LogsPresenter {

    private static LogsPresenter instance = null;
    private final LogElementCollection logElements;
    private final LogsView view;
    private static Log log;

    private LogsPresenter(LogElementCollection logElements) {
        view = new LogsView();
        view.setLocation(950, 20);
        view.setVisible(true);
        this.logElements = logElements;
        initListeners();
    }

    public static LogsPresenter getInstance(LogElementCollection logElements) {
        if (instance == null) {
            instance = new LogsPresenter(logElements);
        }
        return instance;
    }

    private void initListeners() {
        view.getCbLog().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                defineInstanceOfSelectedItem();
            }
        });

        view.getBtSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCollectionIsEmpty();
                    log.write();
                    JOptionPane.showMessageDialog(view, "Log gerado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void defineInstanceOfSelectedItem() {
        int indexItem = view.getCbLog().getSelectedIndex();

        switch (indexItem) {
            case 0:
                log = new JSONLog(logElements);
                break;
            case 1:
                log = new XMLLog(logElements);
                break;
        }
    }

    private void checkCollectionIsEmpty() throws Exception {
        if (logElements.logElementsIsEmpty()) {
            throw new Exception("Insira/Remove ao menos um elemento para gerar o log!");
        }
    }

    public LogsView getView() {
        return view;
    }

}
