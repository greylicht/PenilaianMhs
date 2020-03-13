
package cad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Kelas extends javax.swing.JFrame {
    Statement stat;
    Connection con;
    String kelas,matkul,ptmn,tp,ar1,ar2,ar3,ar4,ar5,ar6;
    String nm1,nm2,nm3,nm4,nm5,nm6,nm7,nm8,nm9,nm10,nm11,nm12,nm13,nm14,nm15,nm16,nm17,nm18,nm19,nm20,nm21,nm22,nm23,nm24,nm25,nm26,nm27,nm28,nm29,nm30,nm31,nm32,nm33,nm34,nm35,nm36,nm37,nm38,nm39,nm40;
    String npm1,npm2,npm3,npm4,npm5,npm6,npm7,npm8,npm9,npm10,npm11,npm12,npm13,npm14,npm15,npm16,npm17,npm18,npm19,npm20,npm21,npm22,npm23,npm24,npm25,npm26,npm27,npm28,npm29,npm30,npm31,npm32,npm33,npm34,npm35,npm36,npm37,npm38,npm39,npm40;
   
    
    public Kelas() {
        initComponents();
        setTanggal();
        setJam();
        this.setLocationRelativeTo(null);        
        }
    public Kelas(String kls){
        initComponents();
        kelas=kls;
        nmkls.setText(kls);
        setTanggal();
        setJam();
        mahasiswa();
        this.setLocationRelativeTo(null);      
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
    public void mahasiswa(){
        try {
            ar1();
            ar2();
            ar3();
            ar4();
            ar5();
            ar6();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ar1()throws ClassNotFoundException, SQLException{
         Kelas ks = new Kelas();
         ArrayList<mhs1> mhs = ks.getAll();            
            for (int i = 0; i < mhs.size(); i++) {
            Object[] array = mhs.toArray();
                ar1=Arrays.toString(array);
        nm1=(mhs.get(0).getNama());nama1.setText(nm1);
        npm1=(mhs.get(0).getNpm());
        nm2=(mhs.get(1).getNama());nama2.setText(nm2);
        npm2=(mhs.get(1).getNpm());
        nm3=(mhs.get(2).getNama());nama3.setText(nm3);
        npm3=(mhs.get(2).getNpm());
        nm4=(mhs.get(3).getNama());nama4.setText(nm4);
        npm4=(mhs.get(3).getNpm());
        nm5=(mhs.get(4).getNama());nama5.setText(nm5);
        npm5=(mhs.get(4).getNpm());
        nm6=(mhs.get(5).getNama());nama6.setText(nm6);
        npm6=(mhs.get(5).getNpm());
        
        }     
    }
    public void ar2()throws ClassNotFoundException,SQLException{
        Kelas ks2=new Kelas();
        ArrayList<mhs2> Mhs2 = ks2.getAll2();            
            for (int j = 0; j < Mhs2.size(); j++) {
            Object[] array2 = Mhs2.toArray();
                ar2=Arrays.toString(array2);
        nm7=(Mhs2.get(0).getNama());nama7.setText(nm7);
        npm7=(Mhs2.get(0).getNpm());
        nm8=(Mhs2.get(1).getNama());nama8.setText(nm8);
        npm8=(Mhs2.get(1).getNpm());
        nm9=(Mhs2.get(2).getNama());nama9.setText(nm9);
        npm9=(Mhs2.get(2).getNpm());
        nm10=(Mhs2.get(3).getNama());nama10.setText(nm10);
        npm10=(Mhs2.get(3).getNpm());
        nm11=(Mhs2.get(4).getNama());nama11.setText(nm11);
        npm11=(Mhs2.get(4).getNpm());
        nm12=(Mhs2.get(5).getNama());nama12.setText(nm12);
        npm12=(Mhs2.get(5).getNpm());
        }
    }
    public void ar3()throws ClassNotFoundException,SQLException{
        Kelas ks3=new Kelas();
        ArrayList<mhs3> Mhs3 = ks3.getAll3();            
            for (int k = 0; k < Mhs3.size(); k++) {
            Object[] array3 = Mhs3.toArray();
                ar3=Arrays.toString(array3);
        
        nm13=(Mhs3.get(0).getNama());nama13.setText(nm13);
        npm13=(Mhs3.get(0).getNpm());
        nm14=(Mhs3.get(1).getNama());nama14.setText(nm14);
        npm14=(Mhs3.get(1).getNpm());
        nm15=(Mhs3.get(2).getNama());nama15.setText(nm15);
        npm15=(Mhs3.get(2).getNpm());
        nm16=(Mhs3.get(3).getNama());nama16.setText(nm16);
        npm16=(Mhs3.get(3).getNpm());
        nm17=(Mhs3.get(4).getNama());nama17.setText(nm17);
        npm17=(Mhs3.get(4).getNpm());
        nm18=(Mhs3.get(5).getNama());nama18.setText(nm18);
        npm18=(Mhs3.get(5).getNpm());
        nm19=(Mhs3.get(6).getNama());nama19.setText(nm19);
        npm19=(Mhs3.get(6).getNpm());
        }
    }
    public void ar4()throws ClassNotFoundException,SQLException{
        Kelas ks4=new Kelas();
        ArrayList<mhs4> Mhs4 = ks4.getAll4();            
            for (int k = 0; k < Mhs4.size(); k++) {
            Object[] array4 = Mhs4.toArray();
                ar4=Arrays.toString(array4);
        
        nm20=(Mhs4.get(0).getNama());nama20.setText(nm20);
        npm20=(Mhs4.get(0).getNpm());
        nm21=(Mhs4.get(1).getNama());nama21.setText(nm21);
        npm21=(Mhs4.get(1).getNpm());
        nm22=(Mhs4.get(2).getNama());nama22.setText(nm22);
        npm22=(Mhs4.get(2).getNpm());
        nm23=(Mhs4.get(3).getNama());nama23.setText(nm23);
        npm23=(Mhs4.get(3).getNpm());
        nm24=(Mhs4.get(4).getNama());nama24.setText(nm24);
        npm24=(Mhs4.get(4).getNpm());
        nm25=(Mhs4.get(5).getNama());nama25.setText(nm25);
        npm25=(Mhs4.get(5).getNpm());
        nm26=(Mhs4.get(6).getNama());nama26.setText(nm26);
        npm26=(Mhs4.get(6).getNpm());
        }
    }
    public void ar5()throws ClassNotFoundException,SQLException{
        Kelas ks5=new Kelas();
        ArrayList<mhs5> Mhs5 = ks5.getAll5();            
            for (int k = 0; k < Mhs5.size(); k++) {
            Object[] array5 = Mhs5.toArray();
                ar5=Arrays.toString(array5);
        nm27=(Mhs5.get(0).getNama());nama27.setText(nm27);
        npm27=(Mhs5.get(0).getNpm());
        nm28=(Mhs5.get(1).getNama());nama28.setText(nm28);
        npm28=(Mhs5.get(1).getNpm());
        nm29=(Mhs5.get(2).getNama());nama29.setText(nm29);
        npm29=(Mhs5.get(2).getNpm());
        nm30=(Mhs5.get(3).getNama());nama30.setText(nm30);
        npm30=(Mhs5.get(3).getNpm());
        nm31=(Mhs5.get(4).getNama());nama31.setText(nm31);
        npm31=(Mhs5.get(4).getNpm());
        nm32=(Mhs5.get(5).getNama());nama32.setText(nm32);
        npm32=(Mhs5.get(5).getNpm());
        nm33=(Mhs5.get(6).getNama());nama33.setText(nm33);
        npm33=(Mhs5.get(6).getNpm());
        
        
        }
    }
    public void ar6()throws ClassNotFoundException,SQLException{
        Kelas ks6=new Kelas();
        ArrayList<mhs6> Mhs6 = ks6.getAll6();            
            for (int k = 0; k < Mhs6.size(); k++) {
            Object[] array6 = Mhs6.toArray();
                ar6=Arrays.toString(array6);
        nm34=(Mhs6.get(0).getNama());nama34.setText(nm34);
        npm34=(Mhs6.get(0).getNpm());
        nm35=(Mhs6.get(1).getNama());nama35.setText(nm35);
        npm35=(Mhs6.get(1).getNpm());
        nm36=(Mhs6.get(2).getNama());nama36.setText(nm36);
        npm36=(Mhs6.get(2).getNpm());
        nm37=(Mhs6.get(3).getNama());nama37.setText(nm37);
        npm37=(Mhs6.get(3).getNpm());
        nm38=(Mhs6.get(4).getNama());nama38.setText(nm38);
        npm38=(Mhs6.get(4).getNpm());
        nm39=(Mhs6.get(5).getNama());nama39.setText(nm39);
        npm39=(Mhs6.get(5).getNpm());
        nm40=(Mhs6.get(6).getNama());nama40.setText(nm40);
        npm40=(Mhs6.get(6).getNpm());
        
        
        }
    }
    public ArrayList<mhs1> getAll() throws ClassNotFoundException, SQLException {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
    Statement stm;
    stm = conn.createStatement();
    String sql = "Select * From kelompok1";
    ResultSet rst;
    rst = stm.executeQuery(sql);
    ArrayList<mhs1> mhsList = new ArrayList<>();
        while (rst.next()) {
                mhs1 mhs = new mhs1(rst.getString("nama"), rst.getString("npm"));
                mhsList.add(mhs);
                
                
    }
        return mhsList;
    }
       
    class mhs1 {
        private String nama;
        private String npm;
    
    

    public mhs1 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    
    
    public ArrayList<mhs2> getAll2() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From kelompok2";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<mhs2> mhsList2 = new ArrayList<>();
        while (rst.next()) {
                mhs2 mhs = new mhs2(rst.getString("nama"), rst.getString("npm"));
                mhsList2.add(mhs);
                
                
    }
    return mhsList2;
    }
    class mhs2 {
        private String nama;
        private String npm;
    
    

    public mhs2 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    public ArrayList<mhs3> getAll3() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From kelompok3";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<mhs3> mhsList3 = new ArrayList<>();
        while (rst.next()) {
                mhs3 mhs = new mhs3(rst.getString("nama"), rst.getString("npm"));
                mhsList3.add(mhs);
                
                
    }
    return mhsList3;
    }
    class mhs3 {
        private String nama;
        private String npm;
    
    

    public mhs3 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    public ArrayList<mhs4> getAll4() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From kelompok4";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<mhs4> mhsList4 = new ArrayList<>();
        while (rst.next()) {
                mhs4 mhs = new mhs4(rst.getString("nama"), rst.getString("npm"));
                mhsList4.add(mhs);
                
                
    }
    return mhsList4;
    }
    class mhs4 {
        private String nama;
        private String npm;
    
    

    public mhs4 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    public ArrayList<mhs5> getAll5() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From kelompok5";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<mhs5> mhsList5 = new ArrayList<>();
        while (rst.next()) {
                mhs5 mhs = new mhs5(rst.getString("nama"), rst.getString("npm"));
                mhsList5.add(mhs);
                
                
    }
    return mhsList5;
    }
    class mhs5 {
        private String nama;
        private String npm;
    
    

    public mhs5 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    public ArrayList<mhs6> getAll6() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cad_kelompok", "root", "");
        Statement stm;
        stm = conn.createStatement();
        String sql = "Select * From kelompok6";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<mhs6> mhsList6= new ArrayList<>();
        while (rst.next()) {
                mhs6 mhs = new mhs6(rst.getString("nama"), rst.getString("npm"));
                mhsList6.add(mhs);
                
                
    }
    return mhsList6;
    }
    class mhs6 {
        private String nama;
        private String npm;
    
    

    public mhs6 (String nama,String npm) {
        super();
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    }
    public void data(){
        String namamhs[]=new String [40];
        namamhs[0]=nm1;namamhs[1]=nm2;namamhs[2]=nm3;
        namamhs[3]=nm4;namamhs[4]=nm5;namamhs[5]=nm6;
        namamhs[6]=nm7;namamhs[7]=nm8;namamhs[8]=nm9;
        namamhs[9]=nm10;namamhs[10]=nm11;namamhs[11]=nm12;
        namamhs[12]=nm13;namamhs[13]=nm14;namamhs[14]=nm15;
        namamhs[15]=nm16;namamhs[16]=nm17;namamhs[17]=nm18;
        namamhs[18]=nm19;namamhs[19]=nm20;namamhs[20]=nm21;
        namamhs[21]=nm22;namamhs[22]=nm23;namamhs[23]=nm24;
        namamhs[24]=nm25;namamhs[25]=nm26;namamhs[26]=nm27;
        namamhs[27]=nm28;namamhs[28]=nm29;namamhs[29]=nm30;
        namamhs[30]=nm31;namamhs[31]=nm32;namamhs[32]=nm33;
        namamhs[33]=nm34;namamhs[34]=nm35;namamhs[35]=nm36;
        namamhs[36]=nm37;namamhs[37]=nm38;namamhs[38]=nm39;
        namamhs[39]=nm40;
        String npmmhs[]=new String [40];
        npmmhs[0]=npm1;npmmhs[1]=npm2;npmmhs[2]=npm3;
        npmmhs[3]=npm4;npmmhs[4]=npm5;npmmhs[5]=npm6;
        npmmhs[6]=npm7;npmmhs[7]=npm8;npmmhs[8]=npm9;
        npmmhs[9]=npm10;npmmhs[10]=npm11;npmmhs[11]=npm12;
        npmmhs[12]=npm13;npmmhs[13]=npm14;npmmhs[14]=npm15;
        npmmhs[15]=npm16;npmmhs[16]=npm17;npmmhs[17]=npm18;
        npmmhs[18]=npm19;npmmhs[19]=npm20;npmmhs[20]=npm21;
        npmmhs[21]=npm22;npmmhs[22]=npm23;npmmhs[23]=npm24;
        npmmhs[24]=npm25;npmmhs[25]=npm26;npmmhs[26]=npm27;
        npmmhs[27]=npm28;npmmhs[28]=npm29;npmmhs[29]=npm30;
        npmmhs[30]=npm31;npmmhs[31]=npm32;npmmhs[32]=npm33;
        npmmhs[33]=npm34;npmmhs[34]=npm35;npmmhs[35]=npm36;
        npmmhs[36]=npm37;npmmhs[37]=npm38;npmmhs[38]=npm39;
        npmmhs[39]=npm40;
        
        String matakuliah=matkul;
        String pertemuan=ptmn;
        String topikmk=tp;
        new Main(namamhs,npmmhs,matakuliah,pertemuan,topikmk).setVisible(true);
        dispose();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelmk = new javax.swing.JLabel();
        mk = new javax.swing.JComboBox<>();
        labelptmn = new javax.swing.JLabel();
        cbptmn = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tpkcb = new javax.swing.JComboBox<>();
        Tanggal = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        jpanelkel1 = new javax.swing.JPanel();
        k1n1 = new javax.swing.JButton();
        k1n2 = new javax.swing.JButton();
        k1n4 = new javax.swing.JButton();
        k1n3 = new javax.swing.JButton();
        k1n5 = new javax.swing.JButton();
        k1n6 = new javax.swing.JButton();
        nama1 = new javax.swing.JLabel();
        nama2 = new javax.swing.JLabel();
        nama3 = new javax.swing.JLabel();
        nama4 = new javax.swing.JLabel();
        nama5 = new javax.swing.JLabel();
        nama6 = new javax.swing.JLabel();
        jPanelkel2 = new javax.swing.JPanel();
        k2n1 = new javax.swing.JButton();
        k2n2 = new javax.swing.JButton();
        k2n3 = new javax.swing.JButton();
        k2n4 = new javax.swing.JButton();
        k2n5 = new javax.swing.JButton();
        k2n6 = new javax.swing.JButton();
        nama7 = new javax.swing.JLabel();
        nama8 = new javax.swing.JLabel();
        nama9 = new javax.swing.JLabel();
        nama10 = new javax.swing.JLabel();
        nama11 = new javax.swing.JLabel();
        nama12 = new javax.swing.JLabel();
        jPanelkel3 = new javax.swing.JPanel();
        k3n1 = new javax.swing.JButton();
        k3n2 = new javax.swing.JButton();
        k3n3 = new javax.swing.JButton();
        k3n4 = new javax.swing.JButton();
        k3n5 = new javax.swing.JButton();
        k3n6 = new javax.swing.JButton();
        k3n7 = new javax.swing.JButton();
        nama13 = new javax.swing.JLabel();
        nama14 = new javax.swing.JLabel();
        nama15 = new javax.swing.JLabel();
        nama16 = new javax.swing.JLabel();
        nama17 = new javax.swing.JLabel();
        nama18 = new javax.swing.JLabel();
        nama19 = new javax.swing.JLabel();
        jPanelkel4 = new javax.swing.JPanel();
        k4n1 = new javax.swing.JButton();
        k4n2 = new javax.swing.JButton();
        k4n3 = new javax.swing.JButton();
        k4n4 = new javax.swing.JButton();
        k4n5 = new javax.swing.JButton();
        k4n6 = new javax.swing.JButton();
        k4n7 = new javax.swing.JButton();
        nama20 = new javax.swing.JLabel();
        nama21 = new javax.swing.JLabel();
        nama22 = new javax.swing.JLabel();
        nama23 = new javax.swing.JLabel();
        nama24 = new javax.swing.JLabel();
        nama25 = new javax.swing.JLabel();
        nama26 = new javax.swing.JLabel();
        pn = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanelkel5 = new javax.swing.JPanel();
        k5n1 = new javax.swing.JButton();
        k5n2 = new javax.swing.JButton();
        k5n3 = new javax.swing.JButton();
        k5n4 = new javax.swing.JButton();
        k5n5 = new javax.swing.JButton();
        k5n6 = new javax.swing.JButton();
        k5n7 = new javax.swing.JButton();
        nama27 = new javax.swing.JLabel();
        nama28 = new javax.swing.JLabel();
        nama29 = new javax.swing.JLabel();
        nama30 = new javax.swing.JLabel();
        nama31 = new javax.swing.JLabel();
        nama32 = new javax.swing.JLabel();
        nama33 = new javax.swing.JLabel();
        jPanelkel6 = new javax.swing.JPanel();
        k6n1 = new javax.swing.JButton();
        k6n2 = new javax.swing.JButton();
        k6n3 = new javax.swing.JButton();
        k6n4 = new javax.swing.JButton();
        k6n5 = new javax.swing.JButton();
        k6n6 = new javax.swing.JButton();
        k6n7 = new javax.swing.JButton();
        nama34 = new javax.swing.JLabel();
        nama35 = new javax.swing.JLabel();
        nama36 = new javax.swing.JLabel();
        nama37 = new javax.swing.JLabel();
        nama38 = new javax.swing.JLabel();
        nama39 = new javax.swing.JLabel();
        nama40 = new javax.swing.JLabel();
        nmkls = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelmk.setText("Pilih Mata Kuliah");

        mk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik_Kompilasi", "PBO" }));
        mk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkActionPerformed(evt);
            }
        });

        labelptmn.setText("Pilih Pertemuan");

        cbptmn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pertemuan1", "Pertemuan2", "Pertemuan3", "Pertemuan4", "Pertemuan5", "Pertemuan6", "Pertemuan7", "Pertemuan8", "Pertemuan9", "Pertemuan10", "Pertemuan11", "Pertemuan12", "Pertemuan13", "Pertemuan14" }));
        cbptmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbptmnActionPerformed(evt);
            }
        });

        jLabel1.setText("Topik                   :");

        tpkcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Pengenalan Kompiler", "2.Analisa Leksikal", "3.Contex Free Grammar", "4.Top-Down Parsing(TDP)", "5.First And Follow Set", "6.TDP Non-Recursive Descent Parser(LL(1))", "7.Bottom Up Parser", "8.Bottom Up Parser (LR(0))", "9.,Bottom Up Parser (LR(0)) Lanjutan", "10.Bottom Up Parser SLR(1)", "11.Bottom Up Parser CLR(1), LALR(1)", "12.Analisis Semantic", "13.Intermediate Code Generator", "14.Syntax Tree,Three Addresses Code,N-Tuple", " " }));
        tpkcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpkcbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelmk)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelptmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpkcb, 0, 1, Short.MAX_VALUE)
                    .addComponent(cbptmn, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mk, 0, 178, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmk)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelptmn)
                    .addComponent(cbptmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tpkcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Tanggal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Tanggal.setForeground(new java.awt.Color(0, 0, 255));
        Tanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tanggal.setText("Tanggal");
        Tanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jam.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jam.setForeground(new java.awt.Color(0, 204, 255));
        jam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jam.setText("Jam");
        jam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jam", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jpanelkel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 1"));

        k1n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n1MouseEntered(evt);
            }
        });

        k1n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n2MouseEntered(evt);
            }
        });

        k1n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n4MouseEntered(evt);
            }
        });

        k1n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n3MouseEntered(evt);
            }
        });

        k1n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n5MouseEntered(evt);
            }
        });

        k1n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k1n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k1n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k1n6MouseEntered(evt);
            }
        });

        nama1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama1.setText("Nama");
        nama1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama1.setMaximumSize(new java.awt.Dimension(10, 10));
        nama1.setMinimumSize(new java.awt.Dimension(10, 10));
        nama1.setPreferredSize(new java.awt.Dimension(10, 10));

        nama2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama2.setText("Nama");
        nama2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama2.setMaximumSize(new java.awt.Dimension(10, 10));
        nama2.setMinimumSize(new java.awt.Dimension(10, 10));
        nama2.setPreferredSize(new java.awt.Dimension(10, 10));

        nama3.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama3.setText("Nama");
        nama3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama3.setMaximumSize(new java.awt.Dimension(10, 10));
        nama3.setMinimumSize(new java.awt.Dimension(10, 10));
        nama3.setPreferredSize(new java.awt.Dimension(10, 10));

        nama4.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama4.setText("Nama");
        nama4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama4.setMaximumSize(new java.awt.Dimension(10, 10));
        nama4.setMinimumSize(new java.awt.Dimension(10, 10));
        nama4.setPreferredSize(new java.awt.Dimension(10, 10));

        nama5.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama5.setText("Nama");
        nama5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama5.setMaximumSize(new java.awt.Dimension(10, 10));
        nama5.setMinimumSize(new java.awt.Dimension(10, 10));
        nama5.setPreferredSize(new java.awt.Dimension(10, 10));

        nama6.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama6.setText("Nama");
        nama6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama6.setMaximumSize(new java.awt.Dimension(10, 10));
        nama6.setMinimumSize(new java.awt.Dimension(10, 10));
        nama6.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jpanelkel1Layout = new javax.swing.GroupLayout(jpanelkel1);
        jpanelkel1.setLayout(jpanelkel1Layout);
        jpanelkel1Layout.setHorizontalGroup(
            jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelkel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelkel1Layout.createSequentialGroup()
                        .addComponent(k1n6)
                        .addContainerGap())))
        );
        jpanelkel1Layout.setVerticalGroup(
            jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelkel1Layout.createSequentialGroup()
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(k1n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k1n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(k1n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k1n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(k1n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(k1n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelkel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelkel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 2"));

        k2n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n1MouseEntered(evt);
            }
        });

        k2n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n2MouseEntered(evt);
            }
        });

        k2n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n3MouseEntered(evt);
            }
        });

        k2n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n4MouseEntered(evt);
            }
        });

        k2n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n5MouseEntered(evt);
            }
        });

        k2n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k2n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k2n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k2n6MouseEntered(evt);
            }
        });

        nama7.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama7.setText("Nama");
        nama7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama7.setMaximumSize(new java.awt.Dimension(10, 10));
        nama7.setMinimumSize(new java.awt.Dimension(10, 10));
        nama7.setPreferredSize(new java.awt.Dimension(10, 10));

        nama8.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama8.setText("Nama");
        nama8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama8.setMaximumSize(new java.awt.Dimension(10, 10));
        nama8.setMinimumSize(new java.awt.Dimension(10, 10));
        nama8.setPreferredSize(new java.awt.Dimension(10, 10));

        nama9.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama9.setText("Nama");
        nama9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama9.setMaximumSize(new java.awt.Dimension(10, 10));
        nama9.setMinimumSize(new java.awt.Dimension(10, 10));
        nama9.setPreferredSize(new java.awt.Dimension(10, 10));

        nama10.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama10.setText("Nama");
        nama10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama10.setMaximumSize(new java.awt.Dimension(10, 10));
        nama10.setMinimumSize(new java.awt.Dimension(10, 10));
        nama10.setPreferredSize(new java.awt.Dimension(10, 10));

        nama11.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama11.setText("Nama");
        nama11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama11.setMaximumSize(new java.awt.Dimension(10, 10));
        nama11.setMinimumSize(new java.awt.Dimension(10, 10));
        nama11.setPreferredSize(new java.awt.Dimension(10, 10));

        nama12.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama12.setText("Nama");
        nama12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama12.setMaximumSize(new java.awt.Dimension(10, 10));
        nama12.setMinimumSize(new java.awt.Dimension(10, 10));
        nama12.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelkel2Layout = new javax.swing.GroupLayout(jPanelkel2);
        jPanelkel2.setLayout(jPanelkel2Layout);
        jPanelkel2Layout.setHorizontalGroup(
            jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nama7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k2n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nama9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k2n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k2n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k2n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelkel2Layout.setVerticalGroup(
            jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel2Layout.createSequentialGroup()
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(k2n1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k2n6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelkel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 3"));

        k3n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n1MouseEntered(evt);
            }
        });

        k3n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n2MouseEntered(evt);
            }
        });

        k3n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n3MouseEntered(evt);
            }
        });

        k3n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n4MouseEntered(evt);
            }
        });

        k3n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n5MouseEntered(evt);
            }
        });

        k3n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n6MouseEntered(evt);
            }
        });

        k3n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k3n7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k3n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k3n7MouseEntered(evt);
            }
        });

        nama13.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama13.setText("Nama");
        nama13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama13.setMaximumSize(new java.awt.Dimension(10, 10));
        nama13.setMinimumSize(new java.awt.Dimension(10, 10));
        nama13.setPreferredSize(new java.awt.Dimension(10, 10));

        nama14.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama14.setText("Nama");
        nama14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama14.setMaximumSize(new java.awt.Dimension(10, 10));
        nama14.setMinimumSize(new java.awt.Dimension(10, 10));
        nama14.setPreferredSize(new java.awt.Dimension(10, 10));

        nama15.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama15.setText("Nama");
        nama15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama15.setMaximumSize(new java.awt.Dimension(10, 10));
        nama15.setMinimumSize(new java.awt.Dimension(10, 10));
        nama15.setPreferredSize(new java.awt.Dimension(10, 10));

        nama16.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama16.setText("Nama");
        nama16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama16.setMaximumSize(new java.awt.Dimension(10, 10));
        nama16.setMinimumSize(new java.awt.Dimension(10, 10));
        nama16.setPreferredSize(new java.awt.Dimension(10, 10));

        nama17.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama17.setText("Nama");
        nama17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama17.setMaximumSize(new java.awt.Dimension(10, 10));
        nama17.setMinimumSize(new java.awt.Dimension(10, 10));
        nama17.setPreferredSize(new java.awt.Dimension(10, 10));

        nama18.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama18.setText("Nama");
        nama18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama18.setMaximumSize(new java.awt.Dimension(10, 10));
        nama18.setMinimumSize(new java.awt.Dimension(10, 10));
        nama18.setPreferredSize(new java.awt.Dimension(10, 10));

        nama19.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama19.setText("Nama");
        nama19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama19.setMaximumSize(new java.awt.Dimension(10, 10));
        nama19.setMinimumSize(new java.awt.Dimension(10, 10));
        nama19.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelkel3Layout = new javax.swing.GroupLayout(jPanelkel3);
        jPanelkel3.setLayout(jPanelkel3Layout);
        jPanelkel3Layout.setHorizontalGroup(
            jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nama13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k3n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelkel3Layout.createSequentialGroup()
                        .addComponent(k3n7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nama19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelkel3Layout.setVerticalGroup(
            jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel3Layout.createSequentialGroup()
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k3n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k3n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k3n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k3n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(k3n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(k3n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(k3n1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelkel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 4"));

        k4n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n1MouseEntered(evt);
            }
        });

        k4n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n2MouseEntered(evt);
            }
        });

        k4n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n3MouseEntered(evt);
            }
        });

        k4n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n4MouseEntered(evt);
            }
        });

        k4n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n5MouseEntered(evt);
            }
        });

        k4n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n6MouseEntered(evt);
            }
        });

        k4n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k4n7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k4n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k4n7MouseEntered(evt);
            }
        });

        nama20.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama20.setText("Nama");
        nama20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama20.setMaximumSize(new java.awt.Dimension(10, 10));
        nama20.setMinimumSize(new java.awt.Dimension(10, 10));
        nama20.setPreferredSize(new java.awt.Dimension(10, 10));

        nama21.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama21.setText("Nama");
        nama21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama21.setMaximumSize(new java.awt.Dimension(10, 10));
        nama21.setMinimumSize(new java.awt.Dimension(10, 10));
        nama21.setPreferredSize(new java.awt.Dimension(10, 10));

        nama22.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama22.setText("Nama");
        nama22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama22.setMaximumSize(new java.awt.Dimension(10, 10));
        nama22.setMinimumSize(new java.awt.Dimension(10, 10));
        nama22.setPreferredSize(new java.awt.Dimension(10, 10));

        nama23.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama23.setText("Nama");
        nama23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama23.setMaximumSize(new java.awt.Dimension(10, 10));
        nama23.setMinimumSize(new java.awt.Dimension(10, 10));
        nama23.setPreferredSize(new java.awt.Dimension(10, 10));

        nama24.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama24.setText("Nama");
        nama24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama24.setMaximumSize(new java.awt.Dimension(10, 10));
        nama24.setMinimumSize(new java.awt.Dimension(10, 10));
        nama24.setPreferredSize(new java.awt.Dimension(10, 10));

        nama25.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama25.setText("Nama");
        nama25.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama25.setMaximumSize(new java.awt.Dimension(10, 10));
        nama25.setMinimumSize(new java.awt.Dimension(10, 10));
        nama25.setPreferredSize(new java.awt.Dimension(10, 10));

        nama26.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama26.setText("Nama");
        nama26.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama26.setMaximumSize(new java.awt.Dimension(10, 10));
        nama26.setMinimumSize(new java.awt.Dimension(10, 10));
        nama26.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelkel4Layout = new javax.swing.GroupLayout(jPanelkel4);
        jPanelkel4.setLayout(jPanelkel4Layout);
        jPanelkel4Layout.setHorizontalGroup(
            jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k4n1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k4n2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k4n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k4n4)
                    .addComponent(nama23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k4n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k4n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k4n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelkel4Layout.setVerticalGroup(
            jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel4Layout.createSequentialGroup()
                .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelkel4Layout.createSequentialGroup()
                        .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(k4n4)
                            .addComponent(k4n5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelkel4Layout.createSequentialGroup()
                        .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k4n1)
                            .addComponent(k4n2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelkel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(nama21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelkel4Layout.createSequentialGroup()
                        .addComponent(k4n3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelkel4Layout.createSequentialGroup()
                        .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k4n6)
                            .addComponent(k4n7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelkel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow_right.png"))); // NOI18N
        pn.setText("Penilaian");
        pn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow-back-icon.png"))); // NOI18N
        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jPanelkel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 5"));

        k5n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n1MouseEntered(evt);
            }
        });

        k5n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n2MouseEntered(evt);
            }
        });

        k5n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n3MouseEntered(evt);
            }
        });

        k5n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n4MouseEntered(evt);
            }
        });

        k5n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n5MouseEntered(evt);
            }
        });

        k5n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n6MouseEntered(evt);
            }
        });

        k5n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k5n7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k5n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k5n7MouseEntered(evt);
            }
        });

        nama27.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama27.setText("Nama");
        nama27.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama27.setMaximumSize(new java.awt.Dimension(10, 10));
        nama27.setMinimumSize(new java.awt.Dimension(10, 10));
        nama27.setPreferredSize(new java.awt.Dimension(10, 10));

        nama28.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama28.setText("Nama");
        nama28.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama28.setMaximumSize(new java.awt.Dimension(10, 10));
        nama28.setMinimumSize(new java.awt.Dimension(10, 10));
        nama28.setPreferredSize(new java.awt.Dimension(10, 10));

        nama29.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama29.setText("Nama");
        nama29.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama29.setMaximumSize(new java.awt.Dimension(10, 10));
        nama29.setMinimumSize(new java.awt.Dimension(10, 10));
        nama29.setPreferredSize(new java.awt.Dimension(10, 10));

        nama30.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama30.setText("Nama");
        nama30.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama30.setMaximumSize(new java.awt.Dimension(10, 10));
        nama30.setMinimumSize(new java.awt.Dimension(10, 10));
        nama30.setPreferredSize(new java.awt.Dimension(10, 10));

        nama31.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama31.setText("Nama");
        nama31.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama31.setMaximumSize(new java.awt.Dimension(10, 10));
        nama31.setMinimumSize(new java.awt.Dimension(10, 10));
        nama31.setPreferredSize(new java.awt.Dimension(10, 10));

        nama32.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama32.setText("Nama");
        nama32.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama32.setMaximumSize(new java.awt.Dimension(10, 10));
        nama32.setMinimumSize(new java.awt.Dimension(10, 10));
        nama32.setPreferredSize(new java.awt.Dimension(10, 10));

        nama33.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama33.setText("Nama");
        nama33.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama33.setMaximumSize(new java.awt.Dimension(10, 10));
        nama33.setMinimumSize(new java.awt.Dimension(10, 10));
        nama33.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelkel5Layout = new javax.swing.GroupLayout(jPanelkel5);
        jPanelkel5.setLayout(jPanelkel5Layout);
        jPanelkel5Layout.setHorizontalGroup(
            jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nama27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k5n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k5n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k5n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k5n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k5n6)
                    .addComponent(nama33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k5n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelkel5Layout.setVerticalGroup(
            jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(k5n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k5n7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelkel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Kelompok 6"));

        k6n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n1MouseEntered(evt);
            }
        });

        k6n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n2MouseEntered(evt);
            }
        });

        k6n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n3MouseEntered(evt);
            }
        });

        k6n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n4MouseEntered(evt);
            }
        });

        k6n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n5MouseEntered(evt);
            }
        });

        k6n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n6MouseEntered(evt);
            }
        });

        k6n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        k6n7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k6n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k6n7MouseEntered(evt);
            }
        });

        nama34.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama34.setText("Nama");
        nama34.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama34.setMaximumSize(new java.awt.Dimension(10, 10));
        nama34.setMinimumSize(new java.awt.Dimension(10, 10));
        nama34.setPreferredSize(new java.awt.Dimension(10, 10));

        nama35.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama35.setText("Nama");
        nama35.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama35.setMaximumSize(new java.awt.Dimension(10, 10));
        nama35.setMinimumSize(new java.awt.Dimension(10, 10));
        nama35.setPreferredSize(new java.awt.Dimension(10, 10));

        nama36.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama36.setText("Nama");
        nama36.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama36.setMaximumSize(new java.awt.Dimension(10, 10));
        nama36.setMinimumSize(new java.awt.Dimension(10, 10));
        nama36.setPreferredSize(new java.awt.Dimension(10, 10));

        nama37.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama37.setText("Nama");
        nama37.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama37.setMaximumSize(new java.awt.Dimension(10, 10));
        nama37.setMinimumSize(new java.awt.Dimension(10, 10));
        nama37.setPreferredSize(new java.awt.Dimension(10, 10));

        nama38.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama38.setText("Nama");
        nama38.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama38.setMaximumSize(new java.awt.Dimension(10, 10));
        nama38.setMinimumSize(new java.awt.Dimension(10, 10));
        nama38.setPreferredSize(new java.awt.Dimension(10, 10));

        nama39.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama39.setText("Nama");
        nama39.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama39.setMaximumSize(new java.awt.Dimension(10, 10));
        nama39.setMinimumSize(new java.awt.Dimension(10, 10));
        nama39.setPreferredSize(new java.awt.Dimension(10, 10));

        nama40.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        nama40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama40.setText("Nama");
        nama40.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nama40.setMaximumSize(new java.awt.Dimension(10, 10));
        nama40.setMinimumSize(new java.awt.Dimension(10, 10));
        nama40.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelkel6Layout = new javax.swing.GroupLayout(jPanelkel6);
        jPanelkel6.setLayout(jPanelkel6Layout);
        jPanelkel6Layout.setHorizontalGroup(
            jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel6Layout.createSequentialGroup()
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelkel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(k6n1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k6n2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k6n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nama37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k6n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k6n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k6n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k6n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelkel6Layout.setVerticalGroup(
            jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelkel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k6n1)
                    .addComponent(k6n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k6n3)
                    .addComponent(k6n4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k6n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k6n6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(k6n7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelkel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nama40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nmkls.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nmkls.setText("Nama Kelas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nmkls)
                        .addGap(49, 49, 49)
                        .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pn))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanelkel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanelkel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jpanelkel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelkel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanelkel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelkel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tanggal)
                        .addComponent(jam))
                    .addComponent(nmkls)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelkel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelkel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelkel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelkel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelkel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanelkel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new BuatKelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void cbptmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbptmnActionPerformed
        String value=(String)cbptmn.getSelectedItem();
        ptmn=value;    
    }//GEN-LAST:event_cbptmnActionPerformed

    private void mkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkActionPerformed
        String val=(String)mk.getSelectedItem();
        matkul=val;
        mahasiswa();
    }//GEN-LAST:event_mkActionPerformed

    private void tpkcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpkcbActionPerformed
    String value=(String)tpkcb.getSelectedItem();
        tp=value;
    }//GEN-LAST:event_tpkcbActionPerformed

    private void k1n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n1MouseEntered
        k1n1.setToolTipText(nm1+" "+npm1);
    }//GEN-LAST:event_k1n1MouseEntered

    private void k1n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n2MouseEntered
        k1n2.setToolTipText(nm2+" "+npm2);
    }//GEN-LAST:event_k1n2MouseEntered

    private void k1n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n3MouseEntered
        k1n3.setToolTipText(nm3+" "+npm3);
    }//GEN-LAST:event_k1n3MouseEntered

    private void k1n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n4MouseEntered
        k1n4.setToolTipText(nm4+" "+npm4);
    }//GEN-LAST:event_k1n4MouseEntered

    private void k1n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n5MouseEntered
        k1n5.setToolTipText(nm5+" "+npm5);
    }//GEN-LAST:event_k1n5MouseEntered

    private void k2n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n1MouseEntered
        k2n1.setToolTipText(nm7+" "+npm7);
    }//GEN-LAST:event_k2n1MouseEntered

    private void k2n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n2MouseEntered
        k2n2.setToolTipText(nm8+" "+npm8);
    }//GEN-LAST:event_k2n2MouseEntered

    private void k2n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n3MouseEntered
        k2n3.setToolTipText(nm9+" "+npm9);
    }//GEN-LAST:event_k2n3MouseEntered

    private void k2n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n4MouseEntered
        k2n4.setToolTipText(nm10+" "+npm10);
    }//GEN-LAST:event_k2n4MouseEntered

    private void k2n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n5MouseEntered
        k2n5.setToolTipText(nm11+" "+npm11);
    }//GEN-LAST:event_k2n5MouseEntered

    private void k3n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n1MouseEntered
        k3n1.setToolTipText(nm13+" "+npm13);
    }//GEN-LAST:event_k3n1MouseEntered

    private void k3n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n2MouseEntered
        k3n2.setToolTipText(nm14+" "+npm14);
    }//GEN-LAST:event_k3n2MouseEntered

    private void k3n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n3MouseEntered
        k3n3.setToolTipText(nm15+" "+npm15);
    }//GEN-LAST:event_k3n3MouseEntered

    private void k3n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n4MouseEntered
        k3n4.setToolTipText(nm16+" "+npm16);
    }//GEN-LAST:event_k3n4MouseEntered

    private void k3n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n5MouseEntered
        k3n5.setToolTipText(nm17+" "+npm17);
    }//GEN-LAST:event_k3n5MouseEntered

    private void k4n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n1MouseEntered
        k4n1.setToolTipText(nm20+" "+npm20);
    }//GEN-LAST:event_k4n1MouseEntered

    private void k4n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n2MouseEntered
        k4n2.setToolTipText(nm21+" "+npm21);
    }//GEN-LAST:event_k4n2MouseEntered

    private void k4n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n3MouseEntered
        k4n3.setToolTipText(nm22+" "+npm22);
    }//GEN-LAST:event_k4n3MouseEntered

    private void k4n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n4MouseEntered
        k4n4.setToolTipText(nm23+" "+npm23);
    }//GEN-LAST:event_k4n4MouseEntered

    private void k4n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n5MouseEntered
        k4n5.setToolTipText(nm24+" "+npm24);
    }//GEN-LAST:event_k4n5MouseEntered

    private void k1n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1n6MouseEntered
        k1n6.setToolTipText(nm6+" "+npm6);
    }//GEN-LAST:event_k1n6MouseEntered

    private void k2n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k2n6MouseEntered
        k2n6.setToolTipText(nm12+" "+npm12);
    }//GEN-LAST:event_k2n6MouseEntered

    private void k3n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n6MouseEntered
        k3n6.setToolTipText(nm18+" "+npm18);
    }//GEN-LAST:event_k3n6MouseEntered

    private void k4n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n6MouseEntered
        k4n6.setToolTipText(nm25+" "+npm25);
    }//GEN-LAST:event_k4n6MouseEntered

    private void k5n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n1MouseEntered
        k5n1.setToolTipText(nm27+" "+npm27);
    }//GEN-LAST:event_k5n1MouseEntered

    private void k5n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n2MouseEntered
        k5n2.setToolTipText(nm28+" "+npm28);
    }//GEN-LAST:event_k5n2MouseEntered

    private void k5n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n3MouseEntered
        k5n3.setToolTipText(nm29+" "+npm29);
    }//GEN-LAST:event_k5n3MouseEntered

    private void k5n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n4MouseEntered
        k5n4.setToolTipText(nm30+" "+npm30);
    }//GEN-LAST:event_k5n4MouseEntered

    private void k5n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n5MouseEntered
        k5n5.setToolTipText(nm31+" "+npm31);
    }//GEN-LAST:event_k5n5MouseEntered

    private void k5n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n6MouseEntered
        k5n6.setToolTipText(nm32+" "+npm32);
    }//GEN-LAST:event_k5n6MouseEntered

    private void k6n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n1MouseEntered
        k6n1.setToolTipText(nm34+" "+npm34);
    }//GEN-LAST:event_k6n1MouseEntered

    private void k6n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n2MouseEntered
        k6n2.setToolTipText(nm35+" "+npm35);
    }//GEN-LAST:event_k6n2MouseEntered

    private void k6n3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n3MouseEntered
        k6n3.setToolTipText(nm36+" "+npm36);
    }//GEN-LAST:event_k6n3MouseEntered

    private void k6n4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n4MouseEntered
        k6n4.setToolTipText(nm37+" "+npm37);
    }//GEN-LAST:event_k6n4MouseEntered

    private void k6n5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n5MouseEntered
        k6n5.setToolTipText(nm38+" "+npm38);
    }//GEN-LAST:event_k6n5MouseEntered

    private void k6n6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n6MouseEntered
        k6n6.setToolTipText(nm39+" "+npm39);
    }//GEN-LAST:event_k6n6MouseEntered

    private void k5n7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k5n7MouseEntered
        k5n7.setToolTipText(nm33+" "+npm33);
    }//GEN-LAST:event_k5n7MouseEntered

    private void k6n7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k6n7MouseEntered
        k6n7.setToolTipText(nm40+" "+npm40);
    }//GEN-LAST:event_k6n7MouseEntered

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        data();

    }//GEN-LAST:event_pnActionPerformed

    private void k3n7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k3n7MouseEntered
        k3n7.setToolTipText(nm19+" "+npm19);
    }//GEN-LAST:event_k3n7MouseEntered

    private void k4n7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k4n7MouseEntered
        k4n7.setToolTipText(nm26+" "+npm26);
    }//GEN-LAST:event_k4n7MouseEntered

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
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JComboBox<String> cbptmn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelkel2;
    private javax.swing.JPanel jPanelkel3;
    private javax.swing.JPanel jPanelkel4;
    private javax.swing.JPanel jPanelkel5;
    private javax.swing.JPanel jPanelkel6;
    private javax.swing.JLabel jam;
    private javax.swing.JPanel jpanelkel1;
    private javax.swing.JButton k1n1;
    private javax.swing.JButton k1n2;
    private javax.swing.JButton k1n3;
    private javax.swing.JButton k1n4;
    private javax.swing.JButton k1n5;
    private javax.swing.JButton k1n6;
    private javax.swing.JButton k2n1;
    private javax.swing.JButton k2n2;
    private javax.swing.JButton k2n3;
    private javax.swing.JButton k2n4;
    private javax.swing.JButton k2n5;
    private javax.swing.JButton k2n6;
    private javax.swing.JButton k3n1;
    private javax.swing.JButton k3n2;
    private javax.swing.JButton k3n3;
    private javax.swing.JButton k3n4;
    private javax.swing.JButton k3n5;
    private javax.swing.JButton k3n6;
    private javax.swing.JButton k3n7;
    private javax.swing.JButton k4n1;
    private javax.swing.JButton k4n2;
    private javax.swing.JButton k4n3;
    private javax.swing.JButton k4n4;
    private javax.swing.JButton k4n5;
    private javax.swing.JButton k4n6;
    private javax.swing.JButton k4n7;
    private javax.swing.JButton k5n1;
    private javax.swing.JButton k5n2;
    private javax.swing.JButton k5n3;
    private javax.swing.JButton k5n4;
    private javax.swing.JButton k5n5;
    private javax.swing.JButton k5n6;
    private javax.swing.JButton k5n7;
    private javax.swing.JButton k6n1;
    private javax.swing.JButton k6n2;
    private javax.swing.JButton k6n3;
    private javax.swing.JButton k6n4;
    private javax.swing.JButton k6n5;
    private javax.swing.JButton k6n6;
    private javax.swing.JButton k6n7;
    private javax.swing.JLabel labelmk;
    private javax.swing.JLabel labelptmn;
    private javax.swing.JComboBox<String> mk;
    private javax.swing.JLabel nama1;
    private javax.swing.JLabel nama10;
    private javax.swing.JLabel nama11;
    private javax.swing.JLabel nama12;
    private javax.swing.JLabel nama13;
    private javax.swing.JLabel nama14;
    private javax.swing.JLabel nama15;
    private javax.swing.JLabel nama16;
    private javax.swing.JLabel nama17;
    private javax.swing.JLabel nama18;
    private javax.swing.JLabel nama19;
    private javax.swing.JLabel nama2;
    private javax.swing.JLabel nama20;
    private javax.swing.JLabel nama21;
    private javax.swing.JLabel nama22;
    private javax.swing.JLabel nama23;
    private javax.swing.JLabel nama24;
    private javax.swing.JLabel nama25;
    private javax.swing.JLabel nama26;
    private javax.swing.JLabel nama27;
    private javax.swing.JLabel nama28;
    private javax.swing.JLabel nama29;
    private javax.swing.JLabel nama3;
    private javax.swing.JLabel nama30;
    private javax.swing.JLabel nama31;
    private javax.swing.JLabel nama32;
    private javax.swing.JLabel nama33;
    private javax.swing.JLabel nama34;
    private javax.swing.JLabel nama35;
    private javax.swing.JLabel nama36;
    private javax.swing.JLabel nama37;
    private javax.swing.JLabel nama38;
    private javax.swing.JLabel nama39;
    private javax.swing.JLabel nama4;
    private javax.swing.JLabel nama40;
    private javax.swing.JLabel nama5;
    private javax.swing.JLabel nama6;
    private javax.swing.JLabel nama7;
    private javax.swing.JLabel nama8;
    private javax.swing.JLabel nama9;
    private javax.swing.JLabel nmkls;
    private javax.swing.JButton pn;
    private javax.swing.JComboBox<String> tpkcb;
    // End of variables declaration//GEN-END:variables
}
