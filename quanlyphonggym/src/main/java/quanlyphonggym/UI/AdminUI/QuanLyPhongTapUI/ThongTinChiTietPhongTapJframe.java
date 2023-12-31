/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyphonggym.UI.AdminUI.QuanLyPhongTapUI;

import quanlyphonggym.Bean.PhongTapBean;
import quanlyphonggym.Controllers.AdminCtrl.QuanLyPhongTapCtrl.CDNhanVienPhongTapCtrl;
import quanlyphonggym.Controllers.AdminCtrl.QuanLyPhongTapCtrl.CDThietBiPhongTapCtrl;
import quanlyphonggym.Controllers.AdminCtrl.QuanLyPhongTapCtrl.PhongTapCtrl;
import quanlyphonggym.UI.AdminUI.QuanLyGoiTapUI.PhanHoiJframe;
import quanlyphonggym.UI.AdminUI.QuanLyNhanVienUI.ThemSuaNhanVienJframe;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.EventObject;

/**
 *
 * @author nguyenduc
 */
public class ThongTinChiTietPhongTapJframe extends javax.swing.JFrame {

    private static int idPhong;
    private static DefaultTableModel danhSachPhanHoi;
    private static DefaultTableModel danhSachThietBi;
    private static DefaultTableModel danhSachNhanVien;

    /**
     * Creates new form ThongTinChiTietPhongTapJframe
     */

    public ThongTinChiTietPhongTapJframe(int idPhong) throws SQLException, ClassNotFoundException {
        this.idPhong = idPhong;
        initComponents();
        setLocationRelativeTo(null);
        loadData();
        jTextIdPhong.setEditable(false);
        jTextTenPhong.setEditable(false);
        jTextMaPhong.setEditable(false);
    }

    public static void loadData() throws SQLException, ClassNotFoundException {
        PhongTapCtrl phongTapCtrl = new PhongTapCtrl();
        PhongTapBean phongTapBean = phongTapCtrl.getPhongTapById(idPhong);

        //phongtap
        jTextIdPhong.setText(String.valueOf(phongTapBean.getPhongTap().getId()));
        jTextMaPhong.setText(phongTapBean.getPhongTap().getMaPhong());
        jTextTenPhong.setText(phongTapBean.getPhongTap().getTenPhong());

        //phanhoi
        if (danhSachPhanHoi.getRowCount()>0) danhSachPhanHoi.setRowCount(0);
        for (int i = 0; i<phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().size(); i++) {
            int id = phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaHoiVien().getId();
            int idNhanVien = phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaHoiVien().getIdNhanVien();
            String yKienHoiVien = phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaHoiVien().getNoiDung();
            String traLoi = null;
            String check = "Chưa trả lời";
            String ngayPhanHoi = phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaHoiVien().getNgayPhanHoi();

            if (phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaHoiVien().getIsDaPhanHoiLai()) {
                traLoi = phongTapBean.getDanhSachPhanHoiVeNhanVienCuaPhong().get(i).getPhanHoiCuaAdmin().getNoiDung();
                check = "đã trả lời";
            }

            Object[] row = {id, idNhanVien, yKienHoiVien, traLoi, check, ngayPhanHoi};
            danhSachPhanHoi.addRow(row);
        }

        // nhanvien
        if (danhSachNhanVien.getRowCount()>0) danhSachNhanVien.setRowCount(0);
        for (int i = 0; i<phongTapBean.getDanhSachNhanVien().size();i++) {
//            "ID", "Mã nhân viên", "Họ tên", "Giới tính", "Số điện thoại"
            int id = phongTapBean.getDanhSachNhanVien().get(i).getId();
            String maNv = phongTapBean.getDanhSachNhanVien().get(i).getMaNhanVien();
            String hoTen = phongTapBean.getDanhSachNhanVien().get(i).getHoTen();
            String gioiTing = phongTapBean.getDanhSachNhanVien().get(i).getGioiTinh();
            String sDT = phongTapBean.getDanhSachNhanVien().get(i).getSoDienThoai();
            Object[] row = {id, maNv, hoTen, gioiTing, sDT};

            danhSachNhanVien.addRow(row);
        }

        // thietBi
        if (danhSachThietBi.getRowCount()>0) danhSachThietBi.setRowCount(0);
        for (int i = 0; i < phongTapBean.getDanhSachThietBiPhongTap().size(); i++) {
//            "ID", "Mã thiết bị", "Tên thiết bị", "Ngày nhập", "Tình trạng"
            int id = phongTapBean.getDanhSachThietBiPhongTap().get(i).getId();
            String ma = phongTapBean.getDanhSachThietBiPhongTap().get(i).getMaThietBi();
            String ten = phongTapBean.getDanhSachThietBiPhongTap().get(i).getTenThietBi();
            String ngayNHap = phongTapBean.getDanhSachThietBiPhongTap().get(i).getNgayNhap();
            String tinhTrang = phongTapBean.getDanhSachThietBiPhongTap().get(i).getTinhTrang();

            Object[] row = {id, ma, ten, ngayNHap, tinhTrang};
            danhSachThietBi.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableThietBi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextIdPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextMaPhong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTenPhong = new javax.swing.JTextField();
        jButtonThemThieti = new javax.swing.JButton();
        jButtonXoaThietBi = new javax.swing.JButton();
        jButtonThemNhanVien = new javax.swing.JButton();
        jButtonXoaNhanVien = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePhanHoi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Danh sách thiết bị:");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setText("Danh sách nhân viên:");

        jTableThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã thiết bị", "Tên thiết bị", "Ngày nhập", "Tình trạng"
            }
        ));
        danhSachThietBi = (DefaultTableModel) jTableThietBi.getModel();
        TableCellEditor nonEditableCellEditor1 = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachThietBi.getColumnCount(); column++) {
            TableColumn tableColumn = jTableThietBi.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor1);
        }
        jTableThietBi.setRowHeight(30);
        jScrollPane2.setViewportView(jTableThietBi);

        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
                new String [] {
                        "ID", "Mã nhân viên", "Họ tên", "Giới tính", "Số điện thoại"
                }
        ));
        danhSachNhanVien = (DefaultTableModel) jTableNhanVien.getModel();
        TableCellEditor nonEditableCellEditor2 = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachNhanVien.getColumnCount(); column++) {
            TableColumn tableColumn = jTableNhanVien.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor2);
        }
        jTableNhanVien.setRowHeight(30);
        jTableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(jTableNhanVien);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("ID Phòng tập");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Mã Phòng:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Tên Phòng:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTenPhong))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMaPhong))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jButtonThemThieti.setBackground(new java.awt.Color(255, 255, 204));
        jButtonThemThieti.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonThemThieti.setText("Thêm thiết bị");
        jButtonThemThieti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemThietiActionPerformed(evt);
            }
        });

        jButtonXoaThietBi.setBackground(new java.awt.Color(255, 255, 204));
        jButtonXoaThietBi.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonXoaThietBi.setText("Xóa thiết bị");
        jButtonXoaThietBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonXoaThietBiActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButtonThemNhanVien.setBackground(new java.awt.Color(255, 255, 204));
        jButtonThemNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonThemNhanVien.setText("Thêm nhân viên");
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

        jButtonXoaNhanVien.setBackground(new java.awt.Color(255, 255, 204));
        jButtonXoaNhanVien.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButtonXoaNhanVien.setText("Xóa nhân viên");
        jButtonXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonXoaNhanVienActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jTablePhanHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
                new String [] {
                        "ID", "ID Nhân viên", "Ý kiến hội viên", "Trả lời", "Check", "Ngày phản hồi"
                }
        ));

        danhSachPhanHoi = (DefaultTableModel) jTablePhanHoi.getModel();
        TableCellEditor nonEditableCellEditor3 = new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject e) {
                return false;
            }
        };
        for (int column = 0; column < danhSachPhanHoi.getColumnCount(); column++) {
            TableColumn tableColumn = jTablePhanHoi.getColumnModel().getColumn(column);
            tableColumn.setCellEditor(nonEditableCellEditor3);
        }
        jTablePhanHoi.setRowHeight(30);
        jTablePhanHoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jTablePhanHoiMouseClicked(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        jScrollPane4.setViewportView(jTablePhanHoi);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Danh sách phản hồi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonThemNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonXoaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonThemThieti, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonXoaThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButtonThemThieti, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonXoaThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonXoaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienMouseClicked
        // TODO add your handling code here:
//
    }//GEN-LAST:event_jTableNhanVienMouseClicked

    private void jTableNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableNhanVienMouseEntered

    private void jButtonThemThietiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemThietiActionPerformed
        // TODO add your handling code here:
       ThemThietBiJframe themThietBiJframe = new ThemThietBiJframe(idPhong);
       themThietBiJframe.setVisible(true);
    }//GEN-LAST:event_jButtonThemThietiActionPerformed

    private void jButtonXoaThietBiActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonXoaThietBiActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(null, "Xác nhận Xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            int row = jTableThietBi.getSelectedRow();
            int idThietBi = (int)jTableThietBi.getValueAt(row, 0);
            CDThietBiPhongTapCtrl cdThietBiPhongTapCtrl = new CDThietBiPhongTapCtrl();
            if (cdThietBiPhongTapCtrl.deleteThietBiPhongTap(idThietBi)) {
                loadData();
            }
        }
    }//GEN-LAST:event_jButtonXoaThietBiActionPerformed

    private void jButtonThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonThemNhanVienActionPerformed
        // TODO add your handling code here:
        DanhSachNhanVienJframe danhSachNhanVienJframe = new DanhSachNhanVienJframe(idPhong);
        danhSachNhanVienJframe.setVisible(true);
    }//GEN-LAST:event_jButtonThemNhanVienActionPerformed

    private void jButtonXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jButtonXoaNhanVienActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(null, "Xác nhận Xóa?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {

            CDNhanVienPhongTapCtrl cdNhanVienPhongTapCtrl = new CDNhanVienPhongTapCtrl();

            int row = jTableNhanVien.getSelectedRow();
            if (row < 0 ) {
                JOptionPane.showMessageDialog(null, "Hãy chọn nhân viên");
                return;
            }
            int idNhanVien = (int)jTableNhanVien.getValueAt(row, 0);
            if (cdNhanVienPhongTapCtrl.deleteNhanVienPhongTap(idPhong, idNhanVien)) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                loadData();
            }
        }
    }//GEN-LAST:event_jButtonXoaNhanVienActionPerformed

    private void jTablePhanHoiMouseClicked(java.awt.event.MouseEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_jTablePhanHoiMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int row = jTablePhanHoi.getSelectedRow();
            int idPhanHoi = (int) jTablePhanHoi.getValueAt(row, 0);
            PhanHoiPhongTapJframe phanHoiPhongTapJframe = new PhanHoiPhongTapJframe(idPhanHoi);
            phanHoiPhongTapJframe.setVisible(true);
        }
    }//GEN-LAST:event_jTablePhanHoiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonThemNhanVien;
    private javax.swing.JButton jButtonThemThieti;
    private javax.swing.JButton jButtonXoaNhanVien;
    private javax.swing.JButton jButtonXoaThietBi;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableNhanVien;
    private javax.swing.JTable jTablePhanHoi;
    private javax.swing.JTable jTableThietBi;
    private static javax.swing.JTextField jTextIdPhong;
    private static javax.swing.JTextField jTextMaPhong;
    private static javax.swing.JTextField jTextTenPhong;
    // End of variables declaration//GEN-END:variables
}
