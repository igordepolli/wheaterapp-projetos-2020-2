/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherdatadisplay.view;

import javax.swing.JLabel;

/**
 *
 * @author igor
 */
public class LastWeatherDateView extends javax.swing.JInternalFrame {

    /**
     * Creates new form LastWeatherDateView
     */
    public LastWeatherDateView() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTemperature = new javax.swing.JLabel();
        lbHumidity = new javax.swing.JLabel();
        lbPressure = new javax.swing.JLabel();

        setTitle("Última atualização de tempo");

        jLabel5.setText("Data");

        jLabel6.setText("Temperatura");

        jLabel7.setText("Humidade");

        jLabel8.setText("Pressão");

        lbDate.setText("DD/MM/AAAA");

        lbTemperature.setText("TEMPERATURA");

        lbHumidity.setText("HUMIDADE");

        lbPressure.setText("PRESSÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDate)
                    .addComponent(lbTemperature)
                    .addComponent(lbHumidity)
                    .addComponent(lbPressure))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbHumidity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbPressure))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbHumidity;
    private javax.swing.JLabel lbPressure;
    private javax.swing.JLabel lbTemperature;
    // End of variables declaration//GEN-END:variables

    public JLabel getLbDate() {
        return lbDate;
    }

    public JLabel getLbHumidity() {
        return lbHumidity;
    }

    public JLabel getLbPressure() {
        return lbPressure;
    }

    public JLabel getLbTemperature() {
        return lbTemperature;
    }

}
