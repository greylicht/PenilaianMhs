/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author veluvi
 */
public class BuatKelas extends javax.swing.JFrame {
Statement stat;
Connection con;
String kelas,kelompok; 
    public BuatKelas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public BuatKelas (String user){
        initComponents();
        this.setLocationRelativeTo(null);
        juser.setText(user);     
        }
    
    private void read(){
        String kls=kelas;
        InputStream is;
        is = this.getClass().getClassLoader().getResourceAsStream("Text/"+kls+".txt");
        
         try {            
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            DefaultTableModel model = (DefaultTableModel)tmhs.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(BuatKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void simpan_kls(){
         int rows = tmhs.getRowCount();

            System.out.println(""+rows);
            for(int row = 0; row<rows ; row++)
            {
            String Nama = (String) tmhs.getValueAt(row, 0);
            String NPM = (String) tmhs.getValueAt(row, 1);
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelas","root","");
            stat = con.createStatement();
            String kls=kelas;
            String query = "insert into "+kls+"(NAMA,NPM) values(?,?)" ;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, Nama);
            stmt.setString(2, NPM);         
            stmt.addBatch();
            stmt.executeBatch();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
            }
    }
    private void kelompok(){
           try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelompok","root","");
            stat = con.createStatement();
            String kel=labelkel.getText();
            String query="INSERT INTO "+kel+" values(?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nama_f.getText());
            stmt.setString(2, npm_f.getText()); 
            stmt.executeUpdate();            
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        tabel_kel();
        reset();
    }    
    private void tabel_kel(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Nama");
        dtm.addColumn("NPM");
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelompok","root","");
           stat = con.createStatement();
           String gr=labelkel.getText();
           ResultSet res =  stat.executeQuery("select * from "+gr+"");
           while(res.next()){
            dtm.addRow(new Object[]{
                res.getString(1),
                res.getString(2)
            });    
           }
           tkelompok.setModel(dtm);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void reset(){
        try{
            nama_f.setText("");
            npm_f.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void ubah(){           
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelas","root","");
            stat = con.createStatement();
            String kls=nmkls.getText();
            String query="update "+kls+" set nama=?,npm=? where NPM ='"+npm_f.getText()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nama_f.getText());
            stmt.setString(2, npm_f.getText()); 
            stmt.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void hapus(){
            
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelas","root","");
            stat = con.createStatement();
            String kls=nmkls.getText();
            stat.executeUpdate("DELETE FROM "+kls+" WHERE NPM ='"+npm_f.getText()+"'");
            stat.close();
            reset();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void hapus_kel(){
            
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelompok","root","");
            stat = con.createStatement();
            String kel=labelkel.getText();
            stat.executeUpdate("DELETE FROM "+kel+" WHERE NPM ='"+npm_f.getText()+"'");
            stat.close();
            reset();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel4 = new javax.swing.JPanel();
        bkls = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmhs = new javax.swing.JTable();
        Bcreateclass = new javax.swing.JButton();
        Bdata = new javax.swing.JButton();
        simpankls = new javax.swing.JButton();
        nmkls = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        juser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l_nama = new javax.swing.JLabel();
        l_npm = new javax.swing.JLabel();
        nama_f = new javax.swing.JTextField();
        npm_f = new javax.swing.JTextField();
        cbkel = new javax.swing.JComboBox<>();
        l_kel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tkelompok = new javax.swing.JTable();
        ok = new javax.swing.JButton();
        labelkel = new javax.swing.JLabel();
        hapuskel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        bkelas = new javax.swing.JButton();
        rf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        bkls.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bkls.setForeground(new java.awt.Color(0, 0, 0));
        bkls.setText("Pembuatan Kelas");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));

        tmhs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tmhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NPM"
            }
        ));
        tmhs.setColumnSelectionAllowed(true);
        tmhs.setGridColor(new java.awt.Color(0, 0, 0));
        tmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmhs);
        tmhs.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Bcreateclass.setText("Membuat Kelas Baru");
        Bcreateclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BcreateclassMouseClicked(evt);
            }
        });

        Bdata.setText("Masukan Data Kelas");
        Bdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdataActionPerformed(evt);
            }
        });

        simpankls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/base.png"))); // NOI18N
        simpankls.setText("Simpan");
        simpankls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanklsActionPerformed(evt);
            }
        });

        nmkls.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nmkls.setText("Nama Kelas");

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/eraser.png"))); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/edit1.png"))); // NOI18N
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcreateclass)
                    .addComponent(Bdata, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(hapus)
                        .addGap(32, 32, 32)
                        .addComponent(simpankls)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nmkls)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nmkls)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpankls, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Bcreateclass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bdata)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        juser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        juser.setText("User");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51)));

        jLabel1.setText("Pemilihan Kelompok");

        l_nama.setText("Nama");

        l_npm.setText("NPM");

        cbkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelompok1", "Kelompok2", "Kelompok3", "Kelompok4", "Kelompok5", "Kelompok6", " ", " " }));
        cbkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkelActionPerformed(evt);
            }
        });

        l_kel.setText("Kelompok");

        tkelompok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tkelompok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NPM", "Nama"
            }
        ));
        tkelompok.setGridColor(new java.awt.Color(0, 0, 0));
        tkelompok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkelompokMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tkelompok);
        tkelompok.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/contreng.png"))); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        labelkel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelkel.setText("Kelompok");

        hapuskel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/eraser.png"))); // NOI18N
        hapuskel.setText("Hapus");
        hapuskel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapuskelActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow-back-icon.png"))); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        bkelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow_right.png"))); // NOI18N
        bkelas.setText("Kelas");
        bkelas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkelasActionPerformed(evt);
            }
        });

        rf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/refresh.png"))); // NOI18N
        rf.setText("Refresh");
        rf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(l_nama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nama_f))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(l_npm)
                                            .addGap(18, 18, 18)
                                            .addComponent(npm_f, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(l_kel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hapuskel)
                        .addGap(38, 38, 38)
                        .addComponent(rf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(labelkel)
                            .addGap(154, 154, 154)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelkel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_nama)
                            .addComponent(nama_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_npm)
                            .addComponent(npm_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_kel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(bkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapuskel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(juser, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(bkls)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(juser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bkls)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcreateclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BcreateclassMouseClicked
        String tn=JOptionPane.showInputDialog(null,"Masukan Nama Kelas: ");
        kelas=tn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cad_kelas","root","");
            stat = con.createStatement();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE TABLE "+tn+" " +
                "(NAMA VARCHAR(50) NOT NULL, " +
                " NPM  VARCHAR(15) NOT NULL PRIMARY KEY )");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }        
        JOptionPane.showMessageDialog(null,"Kelas "+tn+" Berhasil Dibuat !");
       
    }//GEN-LAST:event_BcreateclassMouseClicked

    private void BdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdataActionPerformed
        String cls=JOptionPane.showInputDialog(null,"Pilih class : ");
        kelas=cls;
        nmkls.setText(cls);
        read();
    }//GEN-LAST:event_BdataActionPerformed

    private void cbkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkelActionPerformed
        String kel=(String)cbkel.getSelectedItem();
        labelkel.setText(kel);
        tabel_kel();
        
    }//GEN-LAST:event_cbkelActionPerformed

    private void tkelompokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkelompokMouseClicked
        int selectedRow = tkelompok.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tkelompok.getModel();
        nama_f.setText(model.getValueAt(selectedRow,0).toString());
        npm_f.setText(model.getValueAt(selectedRow,1).toString());
        
    }//GEN-LAST:event_tkelompokMouseClicked

    private void tmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmhsMouseClicked
        int selectedRow = tmhs.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tmhs.getModel();
        nama_f.setText(model.getValueAt(selectedRow,0).toString());
        npm_f.setText(model.getValueAt(selectedRow,1).toString());
    }//GEN-LAST:event_tmhsMouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        kelompok();        
    }//GEN-LAST:event_okActionPerformed

    private void simpanklsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanklsActionPerformed
       simpan_kls();        
    }//GEN-LAST:event_simpanklsActionPerformed

    private void hapuskelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapuskelActionPerformed
        hapus_kel();
        tabel_kel();        
    }//GEN-LAST:event_hapuskelActionPerformed

    private void rfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfActionPerformed
        tabel_kel();
    }//GEN-LAST:event_rfActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        hapus();
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        ubah();
    }//GEN-LAST:event_ubahActionPerformed

    private void bkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkelasActionPerformed
        String kls=kelas;
        new Kelas(kls).setVisible(true);
        dispose();
    }//GEN-LAST:event_bkelasActionPerformed

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
            java.util.logging.Logger.getLogger(BuatKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuatKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuatKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuatKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuatKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcreateclass;
    private javax.swing.JButton Bdata;
    private javax.swing.JButton back;
    private javax.swing.JButton bkelas;
    private javax.swing.JLabel bkls;
    private javax.swing.JComboBox<String> cbkel;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapuskel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel juser;
    private javax.swing.JLabel l_kel;
    private javax.swing.JLabel l_nama;
    private javax.swing.JLabel l_npm;
    private javax.swing.JLabel labelkel;
    private javax.swing.JTextField nama_f;
    private javax.swing.JLabel nmkls;
    private javax.swing.JTextField npm_f;
    private javax.swing.JButton ok;
    private javax.swing.JButton rf;
    private javax.swing.JButton simpankls;
    private javax.swing.JTable tkelompok;
    private javax.swing.JTable tmhs;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
