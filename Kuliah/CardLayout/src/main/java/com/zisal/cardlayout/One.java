/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * One.java
 *
 * Created on Mar 2, 2012, 8:25:50 PM
 */
package com.zisal.cardlayout;

import java.awt.CardLayout;

/**
 *
 * @author fauzi
 */
public class One extends javax.swing.JFrame {

    /** Creates new form One */
    public One() {
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        satu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dua = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tiga = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelTombol = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setLayout(new java.awt.CardLayout());

        satu.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("satu");

        javax.swing.GroupLayout satuLayout = new javax.swing.GroupLayout(satu);
        satu.setLayout(satuLayout);
        satuLayout.setHorizontalGroup(
            satuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(satuLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        satuLayout.setVerticalGroup(
            satuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(satuLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        panelUtama.add(satu, "SATU");

        dua.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setText("dua");

        javax.swing.GroupLayout duaLayout = new javax.swing.GroupLayout(dua);
        dua.setLayout(duaLayout);
        duaLayout.setHorizontalGroup(
            duaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(duaLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        duaLayout.setVerticalGroup(
            duaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(duaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        panelUtama.add(dua, "DUA");

        tiga.setBackground(new java.awt.Color(255, 255, 102));

        jLabel3.setText("tiga");

        javax.swing.GroupLayout tigaLayout = new javax.swing.GroupLayout(tiga);
        tiga.setLayout(tigaLayout);
        tigaLayout.setHorizontalGroup(
            tigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(tigaLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        tigaLayout.setVerticalGroup(
            tigaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
            .addGroup(tigaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        panelUtama.add(tiga, "TIGA");

        getContentPane().add(panelUtama, java.awt.BorderLayout.CENTER);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelTombol.add(jButton1);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelTombol.add(jButton2);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelTombol.add(jButton3);

        getContentPane().add(panelTombol, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl=(CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "SATU");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                CardLayout cl=(CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "DUA");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                CardLayout cl=(CardLayout) panelUtama.getLayout();
        cl.show(panelUtama, "TIGA");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new One().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelTombol;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel satu;
    private javax.swing.JPanel tiga;
    // End of variables declaration//GEN-END:variables
}
