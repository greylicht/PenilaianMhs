/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksiDB;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author veluvi
 */
public class RekapNilai extends javax.swing.JFrame {
    Statement stat;
    Connection con;
    String matkul;
    private final Connection conn = koneksiDB.getkoneksi();
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    /**
     * Creates new form RekapNilai
     */
    public RekapNilai() {
        initComponents();
        setTanggal();
        setJam();
        setLocationRelativeTo(null);
    }
    public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd-MM-yyyy");
    Tanggal.setText(kal.format(skrg));
    }
    public void setJam(){
        ActionListener taskPerformer = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {
        String nol_jam = "", nol_menit = "",nol_detik = "";

        java.util.Date dateTime = new java.util.Date();
        int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if(nilai_jam <= 9) nol_jam= "0";
                if(nilai_menit <= 9) nol_menit= "0";
                if(nilai_detik <= 9) nol_detik= "0";

                String waktu = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

            jam.setText(waktu+":"+menit+":"+detik+"");
        }
        };
        new Timer(1000, taskPerformer).start();
    }
    private void koneksi(){
        String mk=matkul;
        
        switch (mk) {
         case "Teknik_Kompilasi":
             try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_teknik_kompilasi","root","");
            stat = con.createStatement();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
             
             break;         
         case "PBO":
             try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_pbo","root","");
            stat = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
             break;
         
         default:
             throw new IllegalArgumentException("Database tidak ditemukan: " +mk);
     }     
    }
    
    private void table(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("NPM");
        dtm.addColumn("NAMA");
        dtm.addColumn("Nilai");
        dtm.addColumn("UTS");
        dtm.addColumn("UAS");
        dtm.addColumn("Skala Huruf");
        dtm.addColumn("Nilai Bobot");
        dtm.addColumn("Mata Kuliah"); 
        
        try{
           koneksi();           
           ResultSet res =  stat.executeQuery("select npm,nama,nilai,uts,uas,skala_huruf,bobot,matakuliah from rekapnilai ");
           while(res.next()){
            dtm.addRow(new Object[]{
                res.getString(1),
                res.getString(2),
                res.getString(3),
                res.getString(4),
                res.getString(5),
                res.getString(6),
                res.getString(7),
                res.getString(8)
            });
           }
           thasil.setModel(dtm);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void total(){
    float a,b,c,hasil;    
        a=Float.parseFloat(ftugas.getText());
        b=Float.parseFloat(futs.getText());
        c=Float.parseFloat(fuas.getText());
        hasil=(a*20/100+(b*30/100+(c*50/100)));
        totalf.setText(String.valueOf(hasil));
        if (hasil>=90){
        txtHuruf.setText("A");
        txtNilaiBobot.setText("4.0");
        }
        
        else if (hasil>=80){
        txtHuruf.setText("A-");
        txtNilaiBobot.setText("3.75");
        }
        
        else if (hasil>=76){
        txtHuruf.setText("B+");
        txtNilaiBobot.setText("3.25");
        }
        
        else if (hasil>=72){
        txtHuruf.setText("B");
        txtNilaiBobot.setText("3.0");
        }
        
        else if (hasil>=68){
        txtHuruf.setText("B-");
        txtNilaiBobot.setText("2.75");
        }
        
        else if (hasil>=62){
        txtHuruf.setText("C+");
        txtNilaiBobot.setText("2.25");
        }
        
        else if (hasil>=56){
        txtHuruf.setText("C");
        txtNilaiBobot.setText("2.0");
        }
        
        else if (hasil>=45){
        txtHuruf.setText("D");
        txtNilaiBobot.setText("1.0");
        }
        
        else              
        {         
        txtHuruf.setText("E");
        txtNilaiBobot.setText("0");
        }
        
    }
    public void simpan(){
        try{
            koneksi();
            
            String query;
            query = "update rekapnilai set UTS=?,UAS=?,skala_huruf=?,bobot=? where NPM ='"+fnpm.getText()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, futs.getText());
            stmt.setString(2, fuas.getText());
            stmt.setString(3,txtHuruf.getText() );
            stmt.setString(4,txtNilaiBobot.getText() );            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    private void reset(){
        fnpm.setText("");
        fnama.setText("");
        ftugas.setText("");
        futs.setText("");
        fuas.setText("");
        totalf.setText("");
        txtHuruf.setText("");
        txtNilaiBobot.setText("");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        thasil = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fnama = new javax.swing.JTextField();
        fnpm = new javax.swing.JTextField();
        ftugas = new javax.swing.JTextField();
        futs = new javax.swing.JTextField();
        fuas = new javax.swing.JTextField();
        btotal = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        mk = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        totalf = new javax.swing.JTextField();
        txtHuruf = new javax.swing.JTextField();
        txtNilaiBobot = new javax.swing.JTextField();
        sv = new javax.swing.JButton();
        back = new javax.swing.JButton();
        print = new javax.swing.JButton();
        print1 = new javax.swing.JButton();
        jam = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        bk = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        kls = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        thasil.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        thasil.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        thasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NPM", "Nama", "Nilai Tugas", "UTS", "UAS", "Skala Huruf", "Bobot Nilai", "Mata Kuliah"
            }
        ));
        thasil.setRowHeight(24);
        thasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thasilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(thasil);
        if (thasil.getColumnModel().getColumnCount() > 0) {
            thasil.getColumnModel().getColumn(0).setPreferredWidth(180);
            thasil.getColumnModel().getColumn(1).setPreferredWidth(180);
            thasil.getColumnModel().getColumn(2).setMinWidth(30);
            thasil.getColumnModel().getColumn(2).setPreferredWidth(30);
            thasil.getColumnModel().getColumn(3).setMinWidth(30);
            thasil.getColumnModel().getColumn(3).setPreferredWidth(30);
            thasil.getColumnModel().getColumn(4).setMinWidth(30);
            thasil.getColumnModel().getColumn(4).setPreferredWidth(30);
            thasil.getColumnModel().getColumn(5).setMinWidth(30);
            thasil.getColumnModel().getColumn(5).setPreferredWidth(30);
            thasil.getColumnModel().getColumn(6).setMinWidth(30);
            thasil.getColumnModel().getColumn(6).setPreferredWidth(30);
            thasil.getColumnModel().getColumn(7).setPreferredWidth(180);
        }

        jLabel5.setText("Nilai Uas      :");

        jLabel4.setText("Nilai UTS      :");

        jLabel3.setText("Nilai Tugas  :");

        jLabel2.setText("NPM              :");

        jLabel1.setText("Nama            :");

        fnama.setText(" ");

        fnpm.setText(" ");

        ftugas.setText(" ");

        btotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/contreng.png"))); // NOI18N
        btotal.setText("Total");
        btotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btotalActionPerformed(evt);
            }
        });

        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/eraser.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnama, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(fnpm))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(ftugas))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fuas)
                            .addComponent(futs))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(futs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik_Kompilasi", "PBO" }));
        mk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkActionPerformed(evt);
            }
        });

        jLabel45.setText("Nilai Bobot");

        jLabel40.setText("Skala Huruf");

        jLabel39.setText("Nilai Skala 100");

        totalf.setText(" ");

        sv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Save-icon.png"))); // NOI18N
        sv.setText("Simpan");
        sv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(totalf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNilaiBobot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sv)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(totalf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilaiBobot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addComponent(sv)
                .addContainerGap())
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow-back-icon.png"))); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Printer-icon.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Printer-icon.png"))); // NOI18N
        print1.setText("Cetak Kelas");
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(print1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 376, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back))
        );

        jam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jam.setForeground(new java.awt.Color(0, 204, 255));
        jam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jam.setText("Jam");
        jam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jam", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        Tanggal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Tanggal.setForeground(new java.awt.Color(0, 0, 255));
        Tanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tanggal.setText("Tanggal");
        Tanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jam)
                    .addComponent(Tanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jMenu2.setText("Login");

        jMenuItem2.setText("Login");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("List Dosen");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        bk.setText("Kelas");

        jMenuItem1.setText("Buat Kelas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bk.add(jMenuItem1);

        kls.setText("Kelas");
        kls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klsActionPerformed(evt);
            }
        });
        bk.add(kls);

        jMenuBar1.add(bk);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void klsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klsActionPerformed
        new Kelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_klsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new BuatKelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        String mk=matkul;
        switch (mk) {
            case "Teknik_Kompilasi":
            try {
                File file = new File("src/laporan/nilai.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }

            break;
            case "PBO":
            try {
                File file = new File("src/laporan/nilai.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi2());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            default:
            throw new IllegalArgumentException("Database tidak ditemukan: " +mk);
        }

    }//GEN-LAST:event_printActionPerformed

    private void svActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svActionPerformed
        simpan();
        table();
        reset();
    }//GEN-LAST:event_svActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new hasil().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void mkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkActionPerformed
        String val=(String)mk.getSelectedItem();
        matkul=val;
        table();

    }//GEN-LAST:event_mkActionPerformed

    private void btotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btotalActionPerformed
        total();
    }//GEN-LAST:event_btotalActionPerformed

    private void thasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thasilMouseClicked
        int selectedRow = thasil.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)thasil.getModel();
        fnpm.setText(model.getValueAt(selectedRow,0).toString());
        fnama.setText(model.getValueAt(selectedRow,1).toString());
        ftugas.setText(model.getValueAt(selectedRow,2).toString());
    }//GEN-LAST:event_thasilMouseClicked

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        try{
            koneksi();
            
            stat.executeUpdate("DELETE FROM rekapnilai WHERE NPM ='"+fnpm.getText()+"'");
            stat.close();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ListDosen().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        String mk=matkul;
        switch (mk) {
            case "Teknik_Kompilasi":
            try {
                File file = new File("src/laporan/nilaikelas.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }

            break;
            case "PBO":
            try {
                File file = new File("src/laporan/nilaikelas.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi2());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            default:
            throw new IllegalArgumentException("Database tidak ditemukan: " +mk);
        }
    }//GEN-LAST:event_print1ActionPerformed

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
            java.util.logging.Logger.getLogger(RekapNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RekapNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RekapNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RekapNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RekapNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tanggal;
    private javax.swing.JButton back;
    private javax.swing.JButton bhapus;
    private javax.swing.JMenu bk;
    private javax.swing.JButton btotal;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fnpm;
    private javax.swing.JTextField ftugas;
    private javax.swing.JTextField fuas;
    private javax.swing.JTextField futs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jam;
    private javax.swing.JMenuItem kls;
    private javax.swing.JComboBox<String> mk;
    private javax.swing.JButton print;
    private javax.swing.JButton print1;
    private javax.swing.JButton sv;
    private javax.swing.JTable thasil;
    private javax.swing.JTextField totalf;
    private javax.swing.JTextField txtHuruf;
    private javax.swing.JTextField txtNilaiBobot;
    // End of variables declaration//GEN-END:variables
}
