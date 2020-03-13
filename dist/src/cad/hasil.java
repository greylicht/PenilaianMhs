/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksiDB;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
;



/**
 *
 * @author veluvi
 */
public class hasil extends javax.swing.JFrame {
    Statement stat;
    Connection con;
    String matkul,ptmn;
    int nilai1,nilai2,nilai3,nilai4,nilai5,nilai6,nilai7,nilai8,nilai9,nilai10,nilai11,nilai12,nilai13,nilai14;
    int absen1,absen2,absen3,absen4,absen5,absen6,absen7,absen8,absen9,absen10,absen11,absen12,absen13,absen14;
    private final Connection conn = koneksiDB.getkoneksi();
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    /**
     * Creates new form hasil
     */
    public hasil() {
        initComponents();
        
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
        dtm.addColumn("ABSEN");
        dtm.addColumn("Nilai Individu");
        dtm.addColumn("Topik");        
        
        try{
           koneksi();
           String cls=ptmn;
           ResultSet res =  stat.executeQuery("select npm,nama,nilai,absen,individu,topik from "+cls+"");
           while(res.next()){
            dtm.addRow(new Object[]{
                res.getString(1),
                res.getString(2),
                res.getString(3),
                res.getString(4),
                res.getString(5),
                res.getString(6)
                
                
            });
           }
           nmhs.setModel(dtm);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void total(){
    try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select NILAI,ABSEN from pertemuan1 where npm= '"+npm+"'");
           while(res.next()){
            nilai1=res.getInt("nilai");
            absen1=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan2 where npm='"+npm+"'");
           while(res.next()){
            nilai2=res.getInt("nilai");
            absen2=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan3 where npm= '"+npm+"'");
           while(res.next()){
            nilai3=res.getInt("nilai");
            absen3=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan4 where npm= '"+npm+"'");
           while(res.next()){
            nilai4=res.getInt("nilai");
            absen4=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan5 where npm= '"+npm+"'");
           while(res.next()){
            nilai5=res.getInt("nilai");
            absen5=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan6 where npm= '"+npm+"'");
           while(res.next()){
            nilai6=res.getInt("nilai");
            absen6=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan7 where npm= '"+npm+"'");
           while(res.next()){
            nilai7=res.getInt("nilai");
            absen7=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan8 where npm= '"+npm+"'");
           while(res.next()){
            nilai8=res.getInt("nilai");
            absen8=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan9 where npm= '"+npm+"'");
           while(res.next()){
            nilai9=res.getInt("nilai");
            absen9=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan10 where npm= '"+npm+"'");
           while(res.next()){
            nilai10=res.getInt("nilai");
            absen10=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan11 where npm= '"+npm+"'");
           while(res.next()){
            nilai11=res.getInt("nilai");
            absen11=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan12 where npm= '"+npm+"'");
           while(res.next()){
            nilai12=res.getInt("nilai");
            absen12=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan13 where npm= '"+npm+"'");
           while(res.next()){
            nilai13=res.getInt("nilai");
            absen13=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
           koneksi();
           String npm=npmf.getText();
           ResultSet res =  stat.executeQuery("select nilai,absen from pertemuan14 where npm= '"+npm+"'");
           while(res.next()){
            nilai14=res.getInt("nilai");
            absen14=res.getInt("absen");            
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }                    
    }
    private void simpan_total(){
           try{
            koneksi();
            String query="INSERT INTO rekapnilai (NPM,NAMA,NILAI,MataKuliah)  values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, npmfn.getText());
            stmt.setString(2, namafn.getText());
            stmt.setString(3, nilaifn.getText());
            stmt.setString(4, matkul);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
           reset();
           
    }
    private void update(){
        try{
            koneksi();            
            String query;
            query = "update rekapnilai set npm=?,nama=?,nilai=? where NPM ='"+npmfn.getText()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, npmfn.getText());
            stmt.setString(2, namafn.getText());
            stmt.setString(3, nilaifn.getText() );                        
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        reset();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    private void reset(){
        npmf.setText("");
        namaf.setText("");
        nilaif.setText("");
        nilaiab.setText("");
        namafn.setText("");
        npmfn.setText("");
        nilaifn.setText("");
        absenfn.setText("");
        ninv.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nmhs = new javax.swing.JTable();
        ptmnbox = new javax.swing.JComboBox<>();
        mk = new javax.swing.JComboBox<>();
        Nama = new javax.swing.JLabel();
        namaf = new javax.swing.JTextField();
        npmf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nilaif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nilaiab = new javax.swing.JTextField();
        na = new javax.swing.JLabel();
        na1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        npmfn = new javax.swing.JTextField();
        namafn = new javax.swing.JTextField();
        nilaifn = new javax.swing.JTextField();
        absenfn = new javax.swing.JTextField();
        rekapnilai = new javax.swing.JButton();
        save = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        linv = new javax.swing.JLabel();
        ninv = new javax.swing.JTextField();
        cabs = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        bk = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        kls = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nmhs.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));
        nmhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NPM", "Nama", "Nilai", "Absen", "Topik"
            }
        ));
        nmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nmhs);

        ptmnbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pertemuan1", "Pertemuan2", "Pertemuan3", "Pertemuan4", "Pertemuan5", "Pertemuan6", "Pertemuan7", "Pertemuan8", "Pertemuan9", "Pertemuan10", "Pertemuan11", "Pertemuan12", "Pertemuan13", "Pertemuan14" }));
        ptmnbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptmnboxActionPerformed(evt);
            }
        });

        mk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik_Kompilasi", "PBO" }));
        mk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkActionPerformed(evt);
            }
        });

        Nama.setText("Nama            :");

        namaf.setText(" ");

        jLabel1.setText(" NPM             :");

        jLabel2.setText("Nilai Tugas  :");

        jLabel3.setText("Nilai Absen  :");

        na.setText("Total Nilai Pertemuan");

        na1.setText("Nilai Pertemuan");

        jLabel4.setText(" NPM             :");

        Nama1.setText("Nama            :");

        jLabel5.setText("Nilai Tugas  :");

        jLabel6.setText("Nilai Absen  :");

        rekapnilai.setText("Total Nilai");
        rekapnilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapnilaiActionPerformed(evt);
            }
        });

        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        next.setText("Penilaian UTS & UAS");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        update.setText("Ubah");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        linv.setText("Nilai Individu :");

        cabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Printer-icon.png"))); // NOI18N
        cabs.setText("Cetak Absen");
        cabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(linv)
                                .addGap(2, 2, 2)
                                .addComponent(ninv))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(rekapnilai))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nilaif)
                                    .addComponent(namaf, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(npmf))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(na)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Nama1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(namafn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                            .addComponent(npmfn, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nilaifn)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(update)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                                .addComponent(save))
                                            .addComponent(absenfn))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(next))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(266, 266, 266))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(nilaiab)))
                            .addComponent(na1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ptmnbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cabs, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ptmnbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cabs))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(na)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(npmf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(npmfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(na1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(namaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nama1)
                    .addComponent(namafn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nilaif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nilaifn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(absenfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(linv)
                            .addComponent(ninv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nilaiab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(back)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(rekapnilai))
                .addContainerGap())
        );

        jMenu2.setText("Login");

        jMenuItem2.setText("Login");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("List Dosen");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

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

    private void ptmnboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptmnboxActionPerformed
        // TODO add your handling code here:
        String value=(String)ptmnbox.getSelectedItem();
        ptmn=value;
        table();
        reset();

    }//GEN-LAST:event_ptmnboxActionPerformed

    private void mkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkActionPerformed
        String val=(String)mk.getSelectedItem();
        matkul=val;
    }//GEN-LAST:event_mkActionPerformed

    private void nmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmhsMouseClicked
     int selectedRow = nmhs.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)nmhs.getModel();
        npmf.setText(model.getValueAt(selectedRow,0).toString());
        namaf.setText(model.getValueAt(selectedRow,1).toString());
        nilaif.setText(model.getValueAt(selectedRow,2).toString());
        nilaiab.setText(model.getValueAt(selectedRow,3).toString());
        ninv.setText(model.getValueAt(selectedRow,4).toString());
    }//GEN-LAST:event_nmhsMouseClicked

    private void rekapnilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapnilaiActionPerformed
    total();
    String nama=namaf.getText();
    namafn.setText(nama);
    String npm=npmf.getText();
    npmfn.setText(npm);
    int totaln=(nilai1+nilai2+nilai3+nilai4+nilai5+nilai6+nilai7+nilai8+nilai9+nilai10+nilai11+nilai12+nilai13+nilai14)/14;
    int absn=(absen1+absen2+absen3+absen4+absen5+absen6+absen7+absen8+absen9+absen10+absen11+absen12+absen13+absen14)/14;
    String totalnilai=Integer.toString(totaln);
    nilaifn.setText(totalnilai);
    String totalabsen=Integer.toString(absn);
    absenfn.setText(totalabsen);
    
    }//GEN-LAST:event_rekapnilaiActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     simpan_total();
    }//GEN-LAST:event_saveActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        new RekapNilai().setVisible(true);
        dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new BuatKelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void klsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klsActionPerformed
        new Kelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_klsActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update();
    }//GEN-LAST:event_updateActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ListDosen().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabsActionPerformed
       String ptm=ptmn;
        switch (ptmn) {
            case "Pertemuan1":
            try {
                File file = new File("src/laporan/absen1.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }

            break;
            case "Pertemuan2":
            try {
                File file = new File("src/laporan/absen2.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan3":
            try {
                File file = new File("src/laporan/absen3.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan4":
            try {
                File file = new File("src/laporan/absen4.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan5":
            try {
                File file = new File("src/laporan/absen5.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan6":
            try {
                File file = new File("src/laporan/absen6.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan7":
            try {
                File file = new File("src/laporan/absen7.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan8":
            try {
                File file = new File("src/laporan/absen8.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan9":
            try {
                File file = new File("src/laporan/absen9.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan10":
            try {
                File file = new File("src/laporan/absen10.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan11":
            try {
                File file = new File("src/laporan/absen11.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan12":
            try {
                File file = new File("src/laporan/absen12.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan13":
            try {
                File file = new File("src/laporan/absen13.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            case "Pertemuan14":
            try {
                File file = new File("src/laporan/absen14.jrxml");
                jasperDesign = JRXmlLoader.load(file);
                param.clear();
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDB.getkoneksi());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
            default:
            throw new IllegalArgumentException("Database tidak ditemukan: " +mk);
        }
    }//GEN-LAST:event_cabsActionPerformed

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
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nama1;
    private javax.swing.JTextField absenfn;
    private javax.swing.JButton back;
    private javax.swing.JMenu bk;
    private javax.swing.JButton cabs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem kls;
    private javax.swing.JLabel linv;
    private javax.swing.JComboBox<String> mk;
    private javax.swing.JLabel na;
    private javax.swing.JLabel na1;
    private javax.swing.JTextField namaf;
    private javax.swing.JTextField namafn;
    private javax.swing.JButton next;
    private javax.swing.JTextField nilaiab;
    private javax.swing.JTextField nilaif;
    private javax.swing.JTextField nilaifn;
    private javax.swing.JTextField ninv;
    private javax.swing.JTable nmhs;
    private javax.swing.JTextField npmf;
    private javax.swing.JTextField npmfn;
    private javax.swing.JComboBox<String> ptmnbox;
    private javax.swing.JButton rekapnilai;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
