/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlyphonggym.UI.AdminUI.QuanLyPhongTapUI;

import quanlyphonggym.Controllers.AdminCtrl.QuanLyPhongTapCtrl.CRUDPhongTapCtrl;
import quanlyphonggym.Controllers.AdminCtrl.QuanLyPhongTapCtrl.PhongTapCtrl;
import quanlyphonggym.Models.PhongTap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.sql.SQLException;
import java.util.EventObject;
import java.util.List;

/**
 *
 * @author nguyenduc
 */
public class QuanLyPhongTapPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyPhongTapPanel
     */
    public QuanLyPhongTapPanel() throws SQLException, ClassNotFoundException {
        initComponents();
        loadData();
    }

    public static void loadData() throws SQLException, ClassNotFoundException {
        jButtonLuu.setEnabled(true);
        jButtonLuu.setBackground(new Color(255, 255, 255));
        if (danhSachPhongTap.getRowCount()>0) danhSachPhongTap.setRowCount(0);
        PhongTapCtrl phongTapCtrl = new PhongTapCtrl();
        List<PhongTap> phongTaps = phongTapCtrl.getAllPhongTap();
        for (int i = 0; i<phongTaps.size(); i++) {
            int id = phongTaps.get(i).getId();
            String maP= phongTaps.get(i).getMaPhong();
            String tenP = phongTaps.get(i).getTenPhong();

            Object[] row = {id, maP, tenP};
            danhSachPhongTap.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePhongTap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextIdPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTenPhong = new javax.swing.JTextField();
        jButtonChinhSua = new javax.swing.JButton();
        jButtonLuu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTablePhongTap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
                new String [] {
                        "ID Phòng tập", "Mã phòng", "Tên phòng"
                }
        ));
        danhSachPhongTap = (DefaultTableModel) jTablePhongTap.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachPhongTap.getColumnCount(); column++) {
            TableColumn tableColumn = jTablePhongTap.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTablePhongTap.setRowHeight(30);
        jTablePhongTap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jTablePhongTapMouseClicked(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        jScrollPane1.setViewportView(jTablePhongTap);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách phòng tập:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("ID Phòng tập");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Mã Phòng:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Tên Phòng:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTenPhong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMaPhong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButtonChinhSua.setBackground(new java.awt.Color(255, 255, 153));
        jButtonChinhSua.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonChinhSua.setText("Chỉnh sửa");
        jButtonChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChinhSuaActionPerformed(evt);
            }
        });

        jButtonLuu.setBackground(new java.awt.Color(255, 255, 153));
        jButtonLuu.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonLuu.setText("Lưu");
        jButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonLuuActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonChinhSua)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChinhSuaActionPerformed
        // TODO add your handling code here:
        jTextMaPhong.setEditable(true);
        jTextMaPhong.requestFocus();
        jTextTenPhong.setEditable(true);

        jButtonLuu.setEnabled(true);
        jButtonLuu.setBackground(new Color(255, 255, 242));

    }//GEN-LAST:event_jButtonChinhSuaActionPerformed

    private void jButtonLuuActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonLuuActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(null, "Xác nhận Lưu?", "Hủy", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            PhongTap phongTap = new PhongTap();
            phongTap.setId(Integer.parseInt(jTextIdPhong.getText()));
            phongTap.setTenPhong(jTextTenPhong.getText());
            phongTap.setMaPhong(jTextMaPhong.getText());

            CRUDPhongTapCtrl crudPhongTapCtrl = new CRUDPhongTapCtrl();
            if (crudPhongTapCtrl.updatePhongTap(phongTap)) {
                jButtonLuu.setEnabled(false);
                jButtonLuu.setBackground(new Color(255, 255, 255));
                loadData();
            }
        }
    }//GEN-LAST:event_jButtonLuuActionPerformed

    private void jTablePhongTapMouseClicked(java.awt.event.MouseEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jTablePhongTapMouseClicked
        // TODO add your handling code here:
        int row = jTablePhongTap.getSelectedRow();
        int id = (int) danhSachPhongTap.getValueAt(row, 0);
        String maPhong = (String) danhSachPhongTap.getValueAt(row, 1);
        String ten = (String) danhSachPhongTap.getValueAt(row, 2);

        jTextIdPhong.setText(String.valueOf(id));
        jTextMaPhong.setText(maPhong);
        jTextTenPhong.setText(ten);

        if (evt.getClickCount() == 2) {
            ThongTinChiTietPhongTapJframe thongTinChiTietPhongTapJframe = new ThongTinChiTietPhongTapJframe(id);
            thongTinChiTietPhongTapJframe.setVisible(true);
        }
    }//GEN-LAST:event_jTablePhongTapMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThemPhongTapJframe themPhongTapJframe = new ThemPhongTapJframe();
        themPhongTapJframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChinhSua;
    private static javax.swing.JButton jButtonLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePhongTap;
    private javax.swing.JTextField jTextIdPhong;
    private javax.swing.JTextField jTextMaPhong;
    private javax.swing.JTextField jTextTenPhong;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel danhSachPhongTap;
}
