package com.mycompany.weatherdatadisplay.presenter;

import com.mycompany.weatherdatadisplay.model.WeatherDataCollection;
import com.mycompany.weatherdatadisplay.model.average.Averaging;
import com.mycompany.weatherdatadisplay.model.average.Daily;
import com.mycompany.weatherdatadisplay.model.average.Monthly;
import com.mycompany.weatherdatadisplay.model.average.Weekly;
import com.mycompany.weatherdatadisplay.model.graphics.Component;
import com.mycompany.weatherdatadisplay.model.graphics.builder.BarChartBuilder;
import com.mycompany.weatherdatadisplay.model.graphics.builder.ChartDirector;
import com.mycompany.weatherdatadisplay.model.graphics.builder.ColumnChartBuilder;
import com.mycompany.weatherdatadisplay.model.graphics.decorator.Caption;
import com.mycompany.weatherdatadisplay.model.graphics.decorator.Label;
import com.mycompany.weatherdatadisplay.model.graphics.decorator.Title;
import com.mycompany.weatherdatadisplay.model.graphics.decorator.XDescription;
import com.mycompany.weatherdatadisplay.model.graphics.decorator.YDescription;
import com.mycompany.weatherdatadisplay.view.ChartView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;

public class ChartPresenter {
    
    private final ChartView view;
    private Component chart;
    private ChartDirector director;
    private final WeatherDataCollection collectionWeatherData;
    private Averaging selectedCourse;
    private DefaultCategoryDataset defaultDataset;

    public ChartPresenter(WeatherDataCollection collectionWeatherData) throws Exception {
        this.collectionWeatherData = collectionWeatherData;
        view = new ChartView();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        initListeners();
        
        defineDefaultCourse();
        generateDataset();
        generateChartDefault();
        constructChart();
    }
    
    private void initListeners() {
        view.getCbChart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    chartListener();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getCbCourse().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    defineInstanceOfSelectedItem();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getChbCaptions().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    captionListener();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getChbLabelData().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    labelDataListener();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getChbAxisTitle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {   
                    axisTitleListener();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getChbTitle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    titleListener();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                view.dispose();
            }
        });
    }
    
    private void generateDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(selectedCourse.getAverageTemperature(), "Temperatura", "");
        dataset.addValue(selectedCourse.getAverageHumidity(), "Humidade", "");
        dataset.addValue(selectedCourse.getAveragePressure(), "Pressão", "");
        
        defaultDataset = dataset;
    }
    
    private void generateChartDefault() {
        director = new ChartDirector(new BarChartBuilder(defaultDataset));
        chart = director.buildGraphic();
        view.getChbCaptions().setSelected(true);
    }
    
    private void constructChart() throws Exception {
        ChartPanel chartPanel = new ChartPanel(chart.construct());
        view.getChartPanel().setLayout(new BorderLayout());
        view.getChartPanel().removeAll();
        view.getChartPanel().add(chartPanel);
        view.repaint();
        view.revalidate();
        view.setVisible(true);
    }
    
    private void defineDefaultCourse() {
        selectedCourse = new Daily(collectionWeatherData);
    }
    
    private void chartListener() throws Exception {
        int indexItem = view.getCbChart().getSelectedIndex();
        
        switch (indexItem) {
            case 0:
                director = new ChartDirector(new BarChartBuilder(defaultDataset));
                chart = director.buildGraphic();
                break;
            case 1:
                director = new ChartDirector(new ColumnChartBuilder(defaultDataset));
                chart = director.buildGraphic();
                break;
        }
        constructChart();
    }
    
    private void defineInstanceOfSelectedItem() throws Exception {
        int indexItem = view.getCbCourse().getSelectedIndex();

        switch (indexItem) {
            case 0:
                selectedCourse = new Daily(collectionWeatherData);
                generateDataset();
                chartListener();
                break;
            case 1:
                selectedCourse = new Weekly(collectionWeatherData);
                generateDataset();
                chartListener();
                break;
            case 2:
                selectedCourse = new Monthly(collectionWeatherData);
                generateDataset();
                chartListener();
                break;
        }
    }
    
    private void captionListener() throws Exception {
        if (view.getChbCaptions().isSelected()) {
            chart = new Caption(true, chart);
        } else {
            chart = new Caption(false, chart);
        }
        constructChart();
    }
    
    private void labelDataListener() throws Exception {
        if (view.getChbLabelData().isSelected()) {
            chart = new Label(true, chart);
        } else {
            chart = new Label(false, chart);
        }
        constructChart();
    }
    
    private void axisTitleListener() throws Exception {
        if (view.getChbAxisTitle().isSelected()) {
            String xDescription = JOptionPane.showInputDialog(view, "Digite o título do eixo x");
            String yDescription = JOptionPane.showInputDialog(view, "Digite o título do eixo y");
            
            chart = new XDescription(xDescription, chart);
            chart = new YDescription(yDescription, chart);
        } else {
            chart = new XDescription("", chart);
            chart = new YDescription("", chart);
        }
        constructChart();
    }
    
    private void titleListener() throws Exception {
        if (view.getChbTitle().isSelected()) {
            String title = JOptionPane.showInputDialog(view, "Digite o título do gráfico");
            chart = new Title(title, chart);
        } else {
            chart = new Title("", chart);
        }
        constructChart();
    }
}
