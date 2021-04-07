/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherdatadisplay.view;

/**
 *
 * @author igor
 */
public class MainScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        ifWeatherData = new javax.swing.JInternalFrame();
        tfDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTemperature = new javax.swing.JTextField();
        tfHumidity = new javax.swing.JTextField();
        tfPressure = new javax.swing.JTextField();
        btInclude = new javax.swing.JButton();
        ifLastUpdate = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btCloseLastUpdate = new javax.swing.JButton();
        lbDateLastUpdate = new javax.swing.JLabel();
        lbTemperatureLastUpdate = new javax.swing.JLabel();
        lbHumidityLastUpdate = new javax.swing.JLabel();
        lbPressureLastUpdate = new javax.swing.JLabel();
        ifRecords = new javax.swing.JInternalFrame();
        btCloseRecords = new javax.swing.JButton();
        btRemoveRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRecords = new javax.swing.JTable();
        ifAverageData = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btCloseAverageData = new javax.swing.JButton();
        lbTemperatureAverageData = new javax.swing.JLabel();
        lbHumidityAverageData = new javax.swing.JLabel();
        lbPressureAverageData = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbNumberOfRecordsAverageData = new javax.swing.JLabel();
        cbCourseAverageData = new javax.swing.JComboBox<>();
        ifSystemSetup = new javax.swing.JInternalFrame();
        jLabel14 = new javax.swing.JLabel();
        cbLogSystemSetup = new javax.swing.JComboBox<>();
        btSaveSystemSetup = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setTitle("Weather Data Display");
        setToolTipText("");

        ifWeatherData.setTitle("Dados do tempo");
        ifWeatherData.setVisible(true);

        tfDate.setToolTipText("example");

        jLabel1.setText("Data");

        jLabel2.setText("Temperatura");

        jLabel3.setText("Humidade");

        jLabel4.setText("Pressão");

        tfTemperature.setToolTipText("");

        btInclude.setText("Incluir");

        javax.swing.GroupLayout ifWeatherDataLayout = new javax.swing.GroupLayout(ifWeatherData.getContentPane());
        ifWeatherData.getContentPane().setLayout(ifWeatherDataLayout);
        ifWeatherDataLayout.setHorizontalGroup(
            ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifWeatherDataLayout.createSequentialGroup()
                .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ifWeatherDataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btInclude))
                    .addGroup(ifWeatherDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTemperature)
                            .addComponent(tfDate)
                            .addComponent(tfHumidity, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(tfPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        ifWeatherDataLayout.setVerticalGroup(
            ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifWeatherDataLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifWeatherDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btInclude)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ifLastUpdate.setTitle("Última atualização do tempo");
        ifLastUpdate.setVisible(true);

        jLabel5.setText("Data");

        jLabel6.setText("Temperatura");

        jLabel7.setText("Humidade");

        jLabel8.setText("Pressão");

        btCloseLastUpdate.setText("Fechar");

        lbDateLastUpdate.setText("DD/MM/AAAA");

        lbTemperatureLastUpdate.setText("TEMPERATURA");

        lbHumidityLastUpdate.setText("HUMIDADE");

        lbPressureLastUpdate.setText("PRESSÃO");

        javax.swing.GroupLayout ifLastUpdateLayout = new javax.swing.GroupLayout(ifLastUpdate.getContentPane());
        ifLastUpdate.getContentPane().setLayout(ifLastUpdateLayout);
        ifLastUpdateLayout.setHorizontalGroup(
            ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifLastUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDateLastUpdate)
                    .addComponent(lbTemperatureLastUpdate)
                    .addComponent(lbHumidityLastUpdate)
                    .addComponent(lbPressureLastUpdate))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifLastUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCloseLastUpdate)
                .addContainerGap())
        );
        ifLastUpdateLayout.setVerticalGroup(
            ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifLastUpdateLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbDateLastUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTemperatureLastUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbHumidityLastUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifLastUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbPressureLastUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCloseLastUpdate)
                .addContainerGap())
        );

        ifRecords.setTitle("Registros");
        ifRecords.setVisible(true);

        btCloseRecords.setText("Fechar");

        btRemoveRecords.setText("Remover");

        tbRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbRecords);

        javax.swing.GroupLayout ifRecordsLayout = new javax.swing.GroupLayout(ifRecords.getContentPane());
        ifRecords.getContentPane().setLayout(ifRecordsLayout);
        ifRecordsLayout.setHorizontalGroup(
            ifRecordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifRecordsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btRemoveRecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCloseRecords)
                .addGap(14, 14, 14))
            .addGroup(ifRecordsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ifRecordsLayout.setVerticalGroup(
            ifRecordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifRecordsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ifRecordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCloseRecords)
                    .addComponent(btRemoveRecords))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        ifAverageData.setTitle("Dados medios");
        ifAverageData.setVisible(true);

        jLabel9.setText("Período");

        jLabel10.setText("Temperatura");

        jLabel11.setText("Humidade");

        jLabel12.setText("Pressão");

        btCloseAverageData.setText("Fechar");

        lbTemperatureAverageData.setText("TEMPERATURA");

        lbHumidityAverageData.setText("HUMIDADE");

        lbPressureAverageData.setText("PRESSÃO");

        jLabel13.setText("Número de registros ");

        lbNumberOfRecordsAverageData.setText("NRO REGISTROS");

        cbCourseAverageData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diário", "Semanal", "Mensal" }));
        cbCourseAverageData.setSelectedIndex(-1);

        javax.swing.GroupLayout ifAverageDataLayout = new javax.swing.GroupLayout(ifAverageData.getContentPane());
        ifAverageData.getContentPane().setLayout(ifAverageDataLayout);
        ifAverageDataLayout.setHorizontalGroup(
            ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifAverageDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCloseAverageData)
                .addContainerGap())
            .addGroup(ifAverageDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifAverageDataLayout.createSequentialGroup()
                        .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTemperatureAverageData)
                            .addComponent(lbHumidityAverageData)
                            .addComponent(lbPressureAverageData)
                            .addComponent(cbCourseAverageData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(ifAverageDataLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNumberOfRecordsAverageData)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        ifAverageDataLayout.setVerticalGroup(
            ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifAverageDataLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbCourseAverageData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbTemperatureAverageData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbHumidityAverageData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbPressureAverageData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ifAverageDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbNumberOfRecordsAverageData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btCloseAverageData)
                .addContainerGap())
        );

        ifSystemSetup.setTitle("Configuração do sistema");
        ifSystemSetup.setVisible(true);

        jLabel14.setText("Log");

        cbLogSystemSetup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JSON", "XML" }));
        cbLogSystemSetup.setSelectedIndex(-1);

        btSaveSystemSetup.setText("Salvar");

        javax.swing.GroupLayout ifSystemSetupLayout = new javax.swing.GroupLayout(ifSystemSetup.getContentPane());
        ifSystemSetup.getContentPane().setLayout(ifSystemSetupLayout);
        ifSystemSetupLayout.setHorizontalGroup(
            ifSystemSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifSystemSetupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ifSystemSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ifSystemSetupLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLogSystemSetup, 0, 195, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ifSystemSetupLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSaveSystemSetup)))
                .addContainerGap())
        );
        ifSystemSetupLayout.setVerticalGroup(
            ifSystemSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifSystemSetupLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ifSystemSetupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbLogSystemSetup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSaveSystemSetup))
        );

        jMenu1.setText("Configurar");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ifWeatherData)
                    .addComponent(ifLastUpdate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ifRecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ifAverageData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ifSystemSetup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ifWeatherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifAverageData)
                    .addComponent(ifSystemSetup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ifRecords)
                    .addComponent(ifLastUpdate))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCloseAverageData;
    private javax.swing.JButton btCloseLastUpdate;
    private javax.swing.JButton btCloseRecords;
    private javax.swing.JButton btInclude;
    private javax.swing.JButton btRemoveRecords;
    private javax.swing.JButton btSaveSystemSetup;
    private javax.swing.JComboBox<String> cbCourseAverageData;
    private javax.swing.JComboBox<String> cbLogSystemSetup;
    private javax.swing.JInternalFrame ifAverageData;
    private javax.swing.JInternalFrame ifLastUpdate;
    private javax.swing.JInternalFrame ifRecords;
    private javax.swing.JInternalFrame ifSystemSetup;
    private javax.swing.JInternalFrame ifWeatherData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDateLastUpdate;
    private javax.swing.JLabel lbHumidityAverageData;
    private javax.swing.JLabel lbHumidityLastUpdate;
    private javax.swing.JLabel lbNumberOfRecordsAverageData;
    private javax.swing.JLabel lbPressureAverageData;
    private javax.swing.JLabel lbPressureLastUpdate;
    private javax.swing.JLabel lbTemperatureAverageData;
    private javax.swing.JLabel lbTemperatureLastUpdate;
    private javax.swing.JTable tbRecords;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfHumidity;
    private javax.swing.JTextField tfPressure;
    private javax.swing.JTextField tfTemperature;
    // End of variables declaration//GEN-END:variables
}