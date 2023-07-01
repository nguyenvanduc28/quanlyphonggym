/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyphonggym.UI.AdminUI;

import quanlyphonggym.UI.AdminUI.QuanLyGoiTapUI.QuanLyGoiTapPanel;
import quanlyphonggym.UI.AdminUI.QuanLyHoiVienUI.QuanLyHoiVienPanel;
import quanlyphonggym.UI.AdminUI.QuanLyNhanVienUI.QuanLyNhanVienPanel;

import java.awt.*;
import java.sql.SQLException;

/**
 *
 * @author nguyenduc
 */
public class AdminHomeUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeUI
     */
    public AdminHomeUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonTrangChu = new javax.swing.JButton();
        jButtonPhongTap = new javax.swing.JButton();
        jButtonNhanVien = new javax.swing.JButton();
        jButtonHoiVien = new javax.swing.JButton();
        jButtonGoiTap = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ PHÒNG GYM");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonTrangChu.setBackground(new java.awt.Color(255, 255, 204));
        jButtonTrangChu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jButtonTrangChu.setForeground(new java.awt.Color(102, 102, 255));
        jButtonTrangChu.setText("TRANG CHỦ");
        jButtonTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrangChuActionPerformed(evt);
            }
        });

        jButtonPhongTap.setBackground(new java.awt.Color(204, 255, 204));
        jButtonPhongTap.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jButtonPhongTap.setText("QUẢN LÝ PHÒNG TẬP");
        jButtonPhongTap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPhongTapActionPerformed(evt);
            }
        });

        jButtonNhanVien.setBackground(new java.awt.Color(204, 255, 204));
        jButtonNhanVien.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jButtonNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        jButtonNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonNhanVienActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonHoiVien.setBackground(new java.awt.Color(204, 255, 204));
        jButtonHoiVien.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jButtonHoiVien.setText("QUẢN LÝ HỘI VIÊN");
        jButtonHoiVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonHoiVienActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonGoiTap.setBackground(new java.awt.Color(204, 255, 204));
        jButtonGoiTap.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jButtonGoiTap.setText("QUẢN LÝ GÓI TẬP");
        jButtonGoiTap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonGoiTapActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonHoiVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGoiTap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPhongTap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonPhongTap, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHoiVien, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGoiTap, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 398, Short.MAX_VALUE))
        );

        ParentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ParentPanelLayout = new javax.swing.GroupLayout(ParentPanel);
        ParentPanel.setLayout(ParentPanelLayout);
        ParentPanelLayout.setHorizontalGroup(
            ParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        ParentPanelLayout.setVerticalGroup(
            ParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrangChuActionPerformed
        // TODO add your handling code here:
//        HomePanel homePanel = new HomePanel();
//        ParentPanel.removeAll();
//        ParentPanel.setLayout(new BorderLayout());
//        ParentPanel.add(homePanel);
//        ParentPanel.validate();
//        ParentPanel.repaint();
    }//GEN-LAST:event_jButtonTrangChuActionPerformed

    private void jButtonPhongTapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPhongTapActionPerformed
        // TODO add your handling code here:
//        NhanKhauHomeView nhanKhauHomeView = new NhanKhauHomeView();
//        ParentPanel.removeAll();
//        ParentPanel.setLayout(new BorderLayout());
//        ParentPanel.add(nhanKhauHomeView);
//        ParentPanel.validate();
//        ParentPanel.repaint();
    }//GEN-LAST:event_jButtonPhongTapActionPerformed

    private void jButtonNhanVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonNhanVienActionPerformed
        // TODO add your handling code here:
        QuanLyNhanVienPanel quanLyNhanVienPanel = new QuanLyNhanVienPanel();
        ParentPanel.removeAll();
        ParentPanel.setLayout(new BorderLayout());
        ParentPanel.add(quanLyNhanVienPanel);
        ParentPanel.validate();
        ParentPanel.repaint();
    }//GEN-LAST:event_jButtonNhanVienActionPerformed

    private void jButtonHoiVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonHoiVienActionPerformed
        // TODO add your handling code here:
        QuanLyHoiVienPanel quanLyHoiVienPanel = new QuanLyHoiVienPanel();
        ParentPanel.removeAll();
        ParentPanel.setLayout(new BorderLayout());
        ParentPanel.add(quanLyHoiVienPanel);
        ParentPanel.validate();
        ParentPanel.repaint();
    }//GEN-LAST:event_jButtonHoiVienActionPerformed

    private void jButtonGoiTapActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonGoiTapActionPerformed
        // TODO add your handling code here:
        QuanLyGoiTapPanel quanLyGoiTapPanel = new QuanLyGoiTapPanel();
        ParentPanel.removeAll();
        ParentPanel.setLayout(new BorderLayout());
        ParentPanel.add(quanLyGoiTapPanel);
        ParentPanel.validate();
        ParentPanel.repaint();
    }//GEN-LAST:event_jButtonGoiTapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JButton jButtonGoiTap;
    private javax.swing.JButton jButtonHoiVien;
    private javax.swing.JButton jButtonNhanVien;
    private javax.swing.JButton jButtonPhongTap;
    private javax.swing.JButton jButtonTrangChu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
