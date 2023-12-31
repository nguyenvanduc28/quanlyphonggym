/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlyphonggym.UI.AdminUI.QuanLyNhanVienUI;

import quanlyphonggym.Bean.NhanVienBean;
import quanlyphonggym.Controllers.AdminCtrl.QuanLyNhanVienCtrl.NhanVienCtrl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.EventObject;
import java.util.List;

/**
 *
 * @author nguyenduc
 */
public class QuanLyNhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyNhanVienPanel
     */
    public QuanLyNhanVienPanel() throws SQLException, ClassNotFoundException {
        initComponents();
        loadData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();
        jButtonThemNhanVien = new javax.swing.JButton();
        jButtonSuaNhanVien = new javax.swing.JButton();
        jButtonXoaNhanVien = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Nhân viên", "Mã nhân viên", "Họ tên", "Ngày sinh", "Giới tính","Địa chỉ", "Số điện thoại", "Chức vụ"
            }
        ));
        danhSachNhanVien = (DefaultTableModel) jTableNhanVien.getModel();
        TableCellEditor nonEditableCellEditor = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachNhanVien.getColumnCount(); column++) {
            TableColumn tableColumn = jTableNhanVien.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor);
        }
        jTableNhanVien.setToolTipText("");
        jTableNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableNhanVien.setFocusable(false);
        jTableNhanVien.setRowHeight(30);
        jTableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jTableNhanVienMouseClicked(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseEntered(evt);
            }
        });
        jTableNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableNhanVienKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhanVien);

        jButtonThemNhanVien.setBackground(new java.awt.Color(255, 255, 153));
        jButtonThemNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonThemNhanVien.setText("Thêm Nhân Viên");
        jButtonThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonThemNhanVienActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonSuaNhanVien.setBackground(new java.awt.Color(255, 255, 153));
        jButtonSuaNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonSuaNhanVien.setText("Sửa Nhân Viên");
        jButtonSuaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonSuaNhanVienActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonXoaNhanVien.setBackground(new java.awt.Color(255, 255, 153));
        jButtonXoaNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButtonXoaNhanVien.setText("Xóa Nhân Viên");
        jButtonXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSuaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThemNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButtonXoaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSuaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonXoaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void loadData() throws SQLException, ClassNotFoundException {
        if (danhSachNhanVien.getRowCount()>0) danhSachNhanVien.setRowCount(0);
        NhanVienCtrl nhanVienCtrl = new NhanVienCtrl();
        List<NhanVienBean> nhanVienBeans = nhanVienCtrl.getAllNhanVien();
        for (int i = 0; i<nhanVienBeans.size(); i++) {

            int idNhanVien = nhanVienBeans.get(i).getNhanVien().getId();
            String maNhanVien = nhanVienBeans.get(i).getNhanVien().getMaNhanVien();
            String hoTen = nhanVienBeans.get(i).getNhanVien().getHoTen();
            String ngaySinh = nhanVienBeans.get(i).getNhanVien().getNgaySinh();
            String gioiTinh = nhanVienBeans.get(i).getNhanVien().getGioiTinh();
            String diaChi = nhanVienBeans.get(i).getNhanVien().getDiaChi();
            String soDienThoai = nhanVienBeans.get(i).getNhanVien().getSoDienThoai();
            String chucVu = nhanVienBeans.get(i).getRole().getTenRole();

            Object[] row = {idNhanVien, maNhanVien, hoTen, ngaySinh, gioiTinh, diaChi, soDienThoai, chucVu};
            danhSachNhanVien.addRow(row);
        }
    }
    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jTableNhanVienMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()==2) {
            int row = jTableNhanVien.getSelectedRow();
            int IdNhanVien = (int) jTableNhanVien.getValueAt(row, 0);
            String PT = (String) jTableNhanVien.getValueAt(row, 7);
            boolean isPT = false;
            if (PT.equals("PT")) isPT = true;
            ThongTinNhanVienJframe thongTinNhanVienJframe = new ThongTinNhanVienJframe (IdNhanVien, isPT);
            thongTinNhanVienJframe.setVisible(true);
        }
    }//GEN-LAST:event_jTableNhanVienMouseClicked

    private void jTableNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNhanVienMouseEntered

    private void jButtonThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonThemNhanVienActionPerformed
        // TODO add your handling code here:
        ThemSuaNhanVienJframe themSuaNhanVienJframe = new ThemSuaNhanVienJframe();
        themSuaNhanVienJframe.setVisible(true);
    }//GEN-LAST:event_jButtonThemNhanVienActionPerformed

    private void jButtonSuaNhanVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException, ParseException {//GEN-FIRST:event_jButtonSuaNhanVienActionPerformed
        // TODO add your handling code here:
        int row = jTableNhanVien.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Hãy chọn nhân viên");
            return;
        }
        int idNhanVien = (int) danhSachNhanVien.getValueAt(row, 0);
        ThemSuaNhanVienJframe themSuaNhanVienJframe = new ThemSuaNhanVienJframe(idNhanVien);
        themSuaNhanVienJframe.setVisible(true);
    }//GEN-LAST:event_jButtonSuaNhanVienActionPerformed

    private void jButtonXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaNhanVienActionPerformed
        // TODO add your handling code here:
//        TamTruView tamTruView = new TamTruView();
//        tamTruView.setVisible(true);
    }//GEN-LAST:event_jButtonXoaNhanVienActionPerformed

    private void jTableNhanVienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableNhanVienKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNhanVienKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSuaNhanVien;
    private javax.swing.JButton jButtonThemNhanVien;
    private javax.swing.JButton jButtonXoaNhanVien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNhanVien;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel danhSachNhanVien;
}
