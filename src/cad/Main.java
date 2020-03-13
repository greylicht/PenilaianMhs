/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Map;
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
public class Main extends javax.swing.JFrame {
    Statement stat;
    Connection con;
    String ptn;
    String kelas,matkul,ptmn,topik;
    String nm1,nm2,nm3,nm4,nm5,nm6,nm7,nm8,nm9,nm10,nm11,nm12,nm13,nm14,nm15,nm16,nm17,nm18,nm19,nm20,nm21,nm22,nm23,nm24,nm25,nm26,nm27,nm28,nm29,nm30,nm31,nm32,nm33,nm34,nm35,nm36,nm37,nm38,nm39,nm40;;
    String npm1,npm2,npm3,npm4,npm5,npm6,npm7,npm8,npm9,npm10,npm11,npm12,npm13,npm14,npm15,npm16,npm17,npm18,npm19,npm20,npm21,npm22,npm23,npm24,npm25,npm26,npm27,npm28,npm29,npm30,npm31,npm32,npm33,npm34,npm35,npm36,npm37,npm38,npm39,npm40;
    int absn1,absn2,absn3,absn4,absn5,absn6,absn7,absn8,absn9,absn10,absn11,absn12,absn13,absn14,absn15,absn16,absn17,absn18,absn19,absn20,absn21,absn22,absn23,absn24,absn25,absn26,absn27,absn28,absn29,absn30,absn31,absn32,absn33,absn34,absn35,absn36,absn37,absn38,absn39,absn40;
    int inv1,inv2,inv3,inv4,inv5,inv6,inv7,inv8,inv9,inv10,inv11,inv12,inv13,inv14,inv15,inv16,inv17,inv18,inv19,inv20,inv21,inv22,inv23,inv24,inv25,inv26,inv27,inv28,inv29,inv30,inv31,inv32,inv33,inv34,inv35,inv36,inv37,inv38,inv39,inv40;
    int Abs,Nilai,n1,n2,n3;
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    
    public Main() {
        initComponents();
        absen();
        this.setLocationRelativeTo(null);
        
    }
    public Main (String[] namamhs, String[] npmmhs, String matakuliah, String pertemuan, String topikmk) {
       initComponents();
       this.setLocationRelativeTo(null);
       absen();
       Matkuln.setText(matakuliah);
       ptmk.setText(pertemuan);
       TopikMk.setText(topikmk);       
       String NamaMhs[]=namamhs;
       String NpmMhs[]=npmmhs;
       nm1=NamaMhs[0];npm1=NpmMhs[0];lnama1.setText(nm1);
       nm2=NamaMhs[1];npm2=NpmMhs[1];lnama2.setText(nm2);
       nm3=NamaMhs[2];npm3=NpmMhs[2];lnama3.setText(nm3);
       nm4=NamaMhs[3];npm4=NpmMhs[3];lnama4.setText(nm4);
       nm5=NamaMhs[4];npm5=NpmMhs[4];lnama5.setText(nm5);
       nm6=NamaMhs[5];npm6=NpmMhs[5];lnama6.setText(nm6);
       nm7=NamaMhs[6];npm7=NpmMhs[6];lnama7.setText(nm7);
       nm8=NamaMhs[7];npm8=NpmMhs[7];lnama8.setText(nm8);
       nm9=NamaMhs[8];npm9=NpmMhs[8];lnama9.setText(nm9);
       nm10=NamaMhs[9];npm10=NpmMhs[9];lnama10.setText(nm10);
       nm11=NamaMhs[10];npm11=NpmMhs[10];lnama11.setText(nm11);
       nm12=NamaMhs[11];npm12=NpmMhs[11];lnama12.setText(nm12);
       nm13=NamaMhs[12];npm13=NpmMhs[12];lnama13.setText(nm13);
       nm14=NamaMhs[13];npm14=NpmMhs[13];lnama14.setText(nm14);
       nm15=NamaMhs[14];npm15=NpmMhs[14];lnama15.setText(nm15);
       nm16=NamaMhs[15];npm16=NpmMhs[15];lnama16.setText(nm16);
       nm17=NamaMhs[16];npm17=NpmMhs[16];lnama17.setText(nm17);
       nm18=NamaMhs[17];npm18=NpmMhs[17];lnama18.setText(nm18);
       nm19=NamaMhs[18];npm19=NpmMhs[18];lnama19.setText(nm19);
       nm20=NamaMhs[19];npm20=NpmMhs[19];lnama20.setText(nm20);
       nm21=NamaMhs[20];npm21=NpmMhs[20];lnama21.setText(nm21);
       nm22=NamaMhs[21];npm22=NpmMhs[21];lnama22.setText(nm22);
       nm23=NamaMhs[22];npm23=NpmMhs[22];lnama23.setText(nm23);
       nm24=NamaMhs[23];npm24=NpmMhs[23];lnama24.setText(nm24);
       nm25=NamaMhs[24];npm25=NpmMhs[24];lnama25.setText(nm25);
       nm26=NamaMhs[25];npm26=NpmMhs[25];lnama26.setText(nm26);
       nm27=NamaMhs[26];npm27=NpmMhs[26];lnama27.setText(nm27);
       nm28=NamaMhs[27];npm28=NpmMhs[27];lnama28.setText(nm28);
       nm29=NamaMhs[28];npm29=NpmMhs[28];lnama29.setText(nm29);
       nm30=NamaMhs[29];npm30=NpmMhs[29];lnama30.setText(nm30);
       nm31=NamaMhs[30];npm31=NpmMhs[30];lnama31.setText(nm31);
       nm32=NamaMhs[31];npm32=NpmMhs[31];lnama32.setText(nm32);
       nm33=NamaMhs[32];npm33=NpmMhs[32];lnama33.setText(nm33);
       nm34=NamaMhs[33];npm34=NpmMhs[33];lnama34.setText(nm34);
       nm35=NamaMhs[34];npm35=NpmMhs[34];lnama35.setText(nm35);
       nm36=NamaMhs[35];npm36=NpmMhs[35];lnama36.setText(nm36);
       nm37=NamaMhs[36];npm37=NpmMhs[36];lnama37.setText(nm37);
       nm38=NamaMhs[37];npm38=NpmMhs[37];lnama38.setText(nm38);
       nm39=NamaMhs[38];npm39=NpmMhs[38];lnama39.setText(nm39);
       nm40=NamaMhs[39];npm40=NpmMhs[39];lnama40.setText(nm40);
    }
    private void koneksi(){
        String mk=Matkuln.getText();
        
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
    
    
    public void absen(){
        absn1=100;absn2=100;absn3=100;absn4=100;absn5=100;
        absn6=100;absn7=100;absn8=100;absn9=100;absn10=100;
        absn11=100;absn12=100;absn13=100;absn14=100;absn15=100;
        absn16=100;absn17=100;absn18=100;absn19=100;absn20=100;
        absn21=100;absn22=100;absn23=100;absn24=100;absn25=100;
        absn26=100;absn27=100;absn28=100;absn29=100;absn30=100;
        absn31=100;absn32=100;absn33=100;absn34=100;absn35=100;
        absn36=100;absn37=100;absn38=100;absn39=100;absn40=100;       
    }
    public void save_mhs(){            
       int nilai1 =Integer.parseInt(n1g1.getText());int nilai2 =Integer.parseInt(n2g1.getText());
       int nilai3 =Integer.parseInt(n3g1.getText());int nilai4 =Integer.parseInt(n4g1.getText());
       int nilai5 =Integer.parseInt(n5g1.getText());int nilai6 =Integer.parseInt(n6g1.getText());
       int nilai7 =Integer.parseInt(n1g2.getText());int nilai8 =Integer.parseInt(n2g2.getText());
       int nilai9 =Integer.parseInt(n3g2.getText());int nilai10 =Integer.parseInt(n4g2.getText());
       int nilai11 =Integer.parseInt(n5g2.getText());int nilai12 =Integer.parseInt(n6g2.getText());
       int nilai13 =Integer.parseInt(n1g3.getText());int nilai14 =Integer.parseInt(n2g3.getText());
       int nilai15 =Integer.parseInt(n3g3.getText());int nilai16 =Integer.parseInt(n4g3.getText());
       int nilai17 =Integer.parseInt(n5g3.getText());int nilai18 =Integer.parseInt(n6g3.getText());
       int nilai19 =Integer.parseInt(n7g3.getText());int nilai20 =Integer.parseInt(n1g4.getText());
       int nilai21 =Integer.parseInt(n2g4.getText());int nilai22 =Integer.parseInt(n3g4.getText());
       int nilai23 =Integer.parseInt(n4g4.getText());int nilai24 =Integer.parseInt(n5g4.getText());
       int nilai25 =Integer.parseInt(n6g4.getText());int nilai26 =Integer.parseInt(n7g4.getText());
       int nilai27 =Integer.parseInt(n1g5.getText());int nilai28 =Integer.parseInt(n2g5.getText());
       int nilai29 =Integer.parseInt(n3g5.getText());int nilai30 =Integer.parseInt(n4g5.getText());
       int nilai31 =Integer.parseInt(n5g5.getText());int nilai32 =Integer.parseInt(n6g5.getText());
       int nilai33 =Integer.parseInt(n7g5.getText());int nilai34 =Integer.parseInt(n1g6.getText());
       int nilai35 =Integer.parseInt(n2g6.getText());int nilai36 =Integer.parseInt(n3g6.getText());
       int nilai37 =Integer.parseInt(n4g6.getText());int nilai38 =Integer.parseInt(n5g6.getText());
       int nilai39 =Integer.parseInt(n6g6.getText());int nilai40 =Integer.parseInt(n7g6.getText());
       
       int absen1=absn1;int absen2=absn2;int absen3=absn3;int absen4=absn4;int absen5=absn5;
       int absen6=absn6;int absen7=absn7;int absen8=absn8;int absen9=absn9;int absen10=absn10;
       int absen11=absn11;int absen12=absn12;int absen13=absn13;int absen14=absn14;int absen15=absn15;
       int absen16=absn16;int absen17=absn17;int absen18=absn18;int absen19=absn19;int absen20=absn20;
       int absen21=absn21;int absen22=absn22;int absen23=absn23;int absen24=absn24;int absen25=absn25;
       int absen26=absn26;int absen27=absn27;int absen28=absn28;int absen29=absn29;int absen30=absn30;
       int absen31=absn31;int absen32=absn32;int absen33=absn33;int absen34=absn34;int absen35=absn35;
       int absen36=absn36;int absen37=absn37;int absen38=absn38;int absen39=absn39;int absen40=absn40;
       
       int ninv1=inv1;int ninv2=inv2;int ninv3=inv3;int ninv4=inv4;int ninv5=inv5;
       int ninv6=inv6;int ninv7=inv7;int ninv8=inv8;int ninv9=inv9;int ninv10=inv10;
       int ninv11=inv11;int ninv12=inv12;int ninv13=inv13;int ninv14=inv14;int ninv15=inv15;
       int ninv16=inv16;int ninv17=inv17;int ninv18=inv18;int ninv19=inv19;int ninv20=inv20;
       int ninv21=inv21;int ninv22=inv22;int ninv23=inv23;int ninv24=inv24;int ninv25=inv25;
       int ninv26=inv26;int ninv27=inv27;int ninv28=inv28;int ninv29=inv29;int ninv30=inv30;
       int ninv31=inv31;int ninv32=inv32;int ninv33=inv33;int ninv34=inv34;int ninv35=inv35;
       int ninv36=inv36;int ninv37=inv37;int ninv38=inv38;int ninv39=inv39;int ninv40=inv40;
       
        List <mhs> list = new ArrayList < > ();
        list.add(new mhs(npm1, nm1,nilai1,absen1,ninv1));
        list.add(new mhs(npm2, nm2,nilai2,absen2,ninv2));
        list.add(new mhs(npm3, nm3,nilai3,absen3,ninv3));
        list.add(new mhs(npm4, nm4,nilai4,absen4,ninv4));
        list.add(new mhs(npm5, nm5,nilai5,absen5,ninv5));
        list.add(new mhs(npm6, nm6,nilai6,absen6,ninv6));
        list.add(new mhs(npm7, nm7,nilai7,absen7,ninv7));
        list.add(new mhs(npm8, nm8,nilai8,absen8,ninv8));
        list.add(new mhs(npm9, nm9,nilai9,absen9,ninv9));
        list.add(new mhs(npm10, nm10,nilai10,absen10,ninv10));
        list.add(new mhs(npm11, nm11,nilai11,absen11,ninv11));
        list.add(new mhs(npm12, nm12,nilai12,absen12,ninv12));
        list.add(new mhs(npm13, nm13,nilai13,absen13,ninv13));
        list.add(new mhs(npm14, nm14,nilai14,absen14,ninv14));
        list.add(new mhs(npm15, nm15,nilai15,absen15,ninv15));
        list.add(new mhs(npm16, nm16,nilai16,absen16,ninv16));
        list.add(new mhs(npm17, nm17,nilai17,absen17,ninv17));
        list.add(new mhs(npm18, nm18,nilai18,absen18,ninv18));
        list.add(new mhs(npm19, nm19,nilai19,absen19,ninv19));
        list.add(new mhs(npm20, nm20,nilai20,absen20,ninv20));
        list.add(new mhs(npm21, nm21,nilai21,absen21,ninv21));
        list.add(new mhs(npm22, nm22,nilai22,absen22,ninv22));
        list.add(new mhs(npm23, nm23,nilai23,absen23,ninv23));
        list.add(new mhs(npm24, nm24,nilai24,absen24,ninv24));
        list.add(new mhs(npm25, nm25,nilai25,absen25,ninv25));
        list.add(new mhs(npm26, nm26,nilai26,absen26,ninv26));
        list.add(new mhs(npm27, nm27,nilai27,absen27,ninv27));
        list.add(new mhs(npm28, nm28,nilai28,absen28,ninv28));
        list.add(new mhs(npm29, nm29,nilai29,absen29,ninv29));
        list.add(new mhs(npm30, nm30,nilai30,absen30,ninv30));
        list.add(new mhs(npm31, nm31,nilai31,absen31,ninv31));
        list.add(new mhs(npm32, nm32,nilai32,absen32,ninv32));
        list.add(new mhs(npm33, nm33,nilai33,absen33,ninv33));
        list.add(new mhs(npm34, nm34,nilai34,absen34,ninv34));
        list.add(new mhs(npm35, nm35,nilai35,absen35,ninv35));
        list.add(new mhs(npm36, nm36,nilai36,absen36,ninv36));
        list.add(new mhs(npm37, nm37,nilai37,absen37,ninv37));
        list.add(new mhs(npm38, nm38,nilai38,absen38,ninv38));
        list.add(new mhs(npm39, nm39,nilai39,absen39,ninv39));
        list.add(new mhs(npm40, nm40,nilai40,absen40,ninv40));
        
        
        
        String pertm=ptmk.getText();
        
        String insert_mhs = "INSERT INTO "+pertm+" (NPM,NAMA,NILAI,ABSEN,individu,TOPIK) VALUES " +
            " (?,?,?,?,?,?);";        
        
        try {
            koneksi();
            PreparedStatement preparedStatement = con.prepareStatement(insert_mhs);
            con.setAutoCommit(false);
            for (Iterator < mhs > iterator = list.iterator(); iterator.hasNext();) {
                mhs mhs = (mhs) iterator.next();
                preparedStatement.setString(1, mhs.getNpm());
                preparedStatement.setString(2, mhs.getNm());
                preparedStatement.setInt(3, mhs.getNilai());
                preparedStatement.setInt(4, mhs.getAbsen());
                preparedStatement.setInt(5, mhs.getInv());
                preparedStatement.setString(6, TopikMk.getText());               
                preparedStatement.addBatch();
            }
            int[] updateCounts = preparedStatement.executeBatch();
            System.out.println(Arrays.toString(updateCounts));
            con.commit();
            con.setAutoCommit(true);
        } catch (BatchUpdateException batchUpdateException) {
            printBatchUpdateException(batchUpdateException);
        } catch (SQLException e) {
            printSQLException(e);
        }
        
        
    }
    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
     public static void printBatchUpdateException(BatchUpdateException b) {

        System.err.println("----BatchUpdateException----");
        System.err.println("SQLState:  " + b.getSQLState());
        System.err.println("Message:  " + b.getMessage());
        System.err.println("Vendor:  " + b.getErrorCode());
        System.err.print("Update counts:  ");
        int[] updateCounts = b.getUpdateCounts();

        for (int i = 0; i < updateCounts.length; i++) {
            System.err.print(updateCounts[i] + "   ");
        }
    }
  
    class mhs {
    private String npm;
    private String nm;    
    private int nilai;
    private int absen;
    private int inv;
    
    

    public mhs (String npm, String nm,int nilai,int absen,int inv) {
        super();
        this.npm = npm;
        this.nm = nm;
        this.nilai = nilai;
        this.absen =absen;
        this.inv=inv;
        
    }
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }    

    public int getNilai() {
        return nilai;
    }

    public void setNilai (int nilai) {
        this.nilai = nilai;
    }
    public int getInv() {
        return inv;
    }

    public void setInv (int inv) {
        this.inv = inv;
    }

    
    public int getAbsen() {
        return absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Matkuln = new javax.swing.JLabel();
        TopikMk = new javax.swing.JLabel();
        ptmk = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        ab1g1 = new javax.swing.JRadioButton();
        ab2g1 = new javax.swing.JRadioButton();
        ab3g1 = new javax.swing.JRadioButton();
        ab4g1 = new javax.swing.JRadioButton();
        ab5g1 = new javax.swing.JRadioButton();
        ab6g1 = new javax.swing.JRadioButton();
        n1g1 = new javax.swing.JTextField();
        n2g1 = new javax.swing.JTextField();
        n3g1 = new javax.swing.JTextField();
        n4g1 = new javax.swing.JTextField();
        n5g1 = new javax.swing.JTextField();
        n6g1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ng1 = new javax.swing.JTextField();
        bng1 = new javax.swing.JButton();
        lnama1 = new javax.swing.JLabel();
        lnama2 = new javax.swing.JLabel();
        lnama3 = new javax.swing.JLabel();
        lnama4 = new javax.swing.JLabel();
        lnama5 = new javax.swing.JLabel();
        lnama6 = new javax.swing.JLabel();
        ninv1 = new javax.swing.JTextField();
        binv1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        n1g2 = new javax.swing.JTextField();
        n2g2 = new javax.swing.JTextField();
        n3g2 = new javax.swing.JTextField();
        n4g2 = new javax.swing.JTextField();
        n5g2 = new javax.swing.JTextField();
        n6g2 = new javax.swing.JTextField();
        bng2 = new javax.swing.JButton();
        ng2 = new javax.swing.JTextField();
        ab1g2 = new javax.swing.JRadioButton();
        ab2g2 = new javax.swing.JRadioButton();
        ab3g2 = new javax.swing.JRadioButton();
        ab4g2 = new javax.swing.JRadioButton();
        ab5g2 = new javax.swing.JRadioButton();
        ab6g2 = new javax.swing.JRadioButton();
        lnama7 = new javax.swing.JLabel();
        lnama8 = new javax.swing.JLabel();
        lnama9 = new javax.swing.JLabel();
        lnama10 = new javax.swing.JLabel();
        lnama11 = new javax.swing.JLabel();
        lnama12 = new javax.swing.JLabel();
        ninv2 = new javax.swing.JTextField();
        binv2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        a20 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a25 = new javax.swing.JButton();
        a26 = new javax.swing.JButton();
        n1g4 = new javax.swing.JTextField();
        n2g4 = new javax.swing.JTextField();
        n3g4 = new javax.swing.JTextField();
        n4g4 = new javax.swing.JTextField();
        n5g4 = new javax.swing.JTextField();
        n6g4 = new javax.swing.JTextField();
        n7g4 = new javax.swing.JTextField();
        bng4 = new javax.swing.JButton();
        ng4 = new javax.swing.JTextField();
        ab1g4 = new javax.swing.JRadioButton();
        ab2g4 = new javax.swing.JRadioButton();
        ab3g4 = new javax.swing.JRadioButton();
        ab4g4 = new javax.swing.JRadioButton();
        ab5g4 = new javax.swing.JRadioButton();
        ab6g4 = new javax.swing.JRadioButton();
        ab7g4 = new javax.swing.JRadioButton();
        lnama20 = new javax.swing.JLabel();
        lnama21 = new javax.swing.JLabel();
        lnama22 = new javax.swing.JLabel();
        lnama23 = new javax.swing.JLabel();
        lnama24 = new javax.swing.JLabel();
        lnama25 = new javax.swing.JLabel();
        lnama26 = new javax.swing.JLabel();
        ninv4 = new javax.swing.JTextField();
        binv4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        a13 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        ng3 = new javax.swing.JTextField();
        bng3 = new javax.swing.JButton();
        ab1g3 = new javax.swing.JRadioButton();
        ab2g3 = new javax.swing.JRadioButton();
        ab3g3 = new javax.swing.JRadioButton();
        ab4g3 = new javax.swing.JRadioButton();
        ab5g3 = new javax.swing.JRadioButton();
        ab6g3 = new javax.swing.JRadioButton();
        ab7g3 = new javax.swing.JRadioButton();
        n1g3 = new javax.swing.JTextField();
        n2g3 = new javax.swing.JTextField();
        n3g3 = new javax.swing.JTextField();
        n4g3 = new javax.swing.JTextField();
        n5g3 = new javax.swing.JTextField();
        n6g3 = new javax.swing.JTextField();
        n7g3 = new javax.swing.JTextField();
        lnama13 = new javax.swing.JLabel();
        lnama14 = new javax.swing.JLabel();
        lnama15 = new javax.swing.JLabel();
        lnama16 = new javax.swing.JLabel();
        lnama17 = new javax.swing.JLabel();
        lnama18 = new javax.swing.JLabel();
        lnama19 = new javax.swing.JLabel();
        ninv3 = new javax.swing.JTextField();
        binv3 = new javax.swing.JButton();
        bnilai = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        a27 = new javax.swing.JButton();
        a28 = new javax.swing.JButton();
        a29 = new javax.swing.JButton();
        a30 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        ng5 = new javax.swing.JTextField();
        bng5 = new javax.swing.JButton();
        ab1g5 = new javax.swing.JRadioButton();
        ab2g5 = new javax.swing.JRadioButton();
        ab3g5 = new javax.swing.JRadioButton();
        ab4g5 = new javax.swing.JRadioButton();
        ab5g5 = new javax.swing.JRadioButton();
        ab6g5 = new javax.swing.JRadioButton();
        ab7g5 = new javax.swing.JRadioButton();
        n1g5 = new javax.swing.JTextField();
        n2g5 = new javax.swing.JTextField();
        n3g5 = new javax.swing.JTextField();
        n4g5 = new javax.swing.JTextField();
        n5g5 = new javax.swing.JTextField();
        n6g5 = new javax.swing.JTextField();
        n7g5 = new javax.swing.JTextField();
        lnama27 = new javax.swing.JLabel();
        lnama28 = new javax.swing.JLabel();
        lnama29 = new javax.swing.JLabel();
        lnama30 = new javax.swing.JLabel();
        lnama31 = new javax.swing.JLabel();
        lnama32 = new javax.swing.JLabel();
        lnama33 = new javax.swing.JLabel();
        ninv5 = new javax.swing.JTextField();
        binv5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        a34 = new javax.swing.JButton();
        a35 = new javax.swing.JButton();
        a36 = new javax.swing.JButton();
        a37 = new javax.swing.JButton();
        a38 = new javax.swing.JButton();
        a39 = new javax.swing.JButton();
        a40 = new javax.swing.JButton();
        ng6 = new javax.swing.JTextField();
        bng6 = new javax.swing.JButton();
        ab1g6 = new javax.swing.JRadioButton();
        ab2g6 = new javax.swing.JRadioButton();
        ab3g6 = new javax.swing.JRadioButton();
        ab4g6 = new javax.swing.JRadioButton();
        ab5g6 = new javax.swing.JRadioButton();
        ab6g6 = new javax.swing.JRadioButton();
        ab7g6 = new javax.swing.JRadioButton();
        n1g6 = new javax.swing.JTextField();
        n2g6 = new javax.swing.JTextField();
        n3g6 = new javax.swing.JTextField();
        n4g6 = new javax.swing.JTextField();
        n5g6 = new javax.swing.JTextField();
        n6g6 = new javax.swing.JTextField();
        n7g6 = new javax.swing.JTextField();
        lnama34 = new javax.swing.JLabel();
        lnama35 = new javax.swing.JLabel();
        lnama36 = new javax.swing.JLabel();
        lnama37 = new javax.swing.JLabel();
        lnama38 = new javax.swing.JLabel();
        lnama39 = new javax.swing.JLabel();
        lnama40 = new javax.swing.JLabel();
        ninv6 = new javax.swing.JTextField();
        binv6 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Save-icon.png"))); // NOI18N
        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        Matkuln.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Matkuln.setForeground(new java.awt.Color(51, 51, 51));
        Matkuln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Matkuln.setText("Matkul");
        Matkuln.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mata Kuliah", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TopikMk.setForeground(new java.awt.Color(51, 51, 51));
        TopikMk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopikMk.setText("Topik");
        TopikMk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ptmk.setBackground(new java.awt.Color(255, 255, 255));
        ptmk.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ptmk.setForeground(new java.awt.Color(51, 51, 51));
        ptmk.setText(" ptmk");
        ptmk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ptmk, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopikMk, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Matkuln, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ptmk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopikMk)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(Matkuln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a1MouseEntered(evt);
            }
        });

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a2MouseEntered(evt);
            }
        });

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a3MouseEntered(evt);
            }
        });

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a4MouseEntered(evt);
            }
        });

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a5MouseEntered(evt);
            }
        });

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a6MouseEntered(evt);
            }
        });

        ab1g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g1ItemStateChanged(evt);
            }
        });

        ab2g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g1ItemStateChanged(evt);
            }
        });

        ab3g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g1ItemStateChanged(evt);
            }
        });

        ab4g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g1ItemStateChanged(evt);
            }
        });

        ab5g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g1ItemStateChanged(evt);
            }
        });

        ab6g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g1ItemStateChanged(evt);
            }
        });

        n1g1.setToolTipText("Nilai Individu");

        jLabel2.setText("Grup 1");

        ng1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng1KeyPressed(evt);
            }
        });

        bng1.setText("grup");
        bng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng1ActionPerformed(evt);
            }
        });

        lnama1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama1.setText("Nama");
        lnama1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama1.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama1.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama1.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama2.setText("Nama");
        lnama2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama2.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama2.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama2.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama3.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama3.setText("Nama");
        lnama3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama3.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama3.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama3.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama4.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama4.setText("Nama");
        lnama4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama4.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama4.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama4.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama5.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama5.setText("Nama");
        lnama5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama5.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama5.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama5.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama6.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama6.setText("Nama");
        lnama6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama6.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama6.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama6.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv1KeyPressed(evt);
            }
        });

        binv1.setText("Individu");
        binv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(n1g1)
                                    .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(n2g1)
                                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a3)
                                    .addComponent(n3g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n4g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(a5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(n5g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(n6g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ng1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bng1)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ab1g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab2g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab3g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab4g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab5g1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab6g1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ninv1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lnama1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lnama2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lnama3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lnama4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lnama5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lnama6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(binv1)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bng1)
                    .addComponent(ng1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ninv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binv1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n1g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n2g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n3g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n4g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n6g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n5g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ab4g1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab3g1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab1g1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab2g1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab5g1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab6g1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Grup 2");

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a7MouseEntered(evt);
            }
        });

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a8MouseEntered(evt);
            }
        });

        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a9MouseEntered(evt);
            }
        });

        a10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a10MouseEntered(evt);
            }
        });

        a11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a11MouseEntered(evt);
            }
        });

        a12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a12MouseEntered(evt);
            }
        });

        n1g2.setToolTipText("Nilai Individu");

        n2g2.setToolTipText("Nilai Individu");

        n3g2.setToolTipText("Nilai Individu");

        n4g2.setToolTipText("Nilai Individu");

        n5g2.setToolTipText("Nilai Individu");

        n6g2.setToolTipText("Nilai Individu");

        bng2.setText("OK");
        bng2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng2ActionPerformed(evt);
            }
        });

        ng2.setToolTipText("Masukan Nilai Grup");
        ng2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng2KeyPressed(evt);
            }
        });

        ab1g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g2ItemStateChanged(evt);
            }
        });

        ab2g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g2ItemStateChanged(evt);
            }
        });

        ab3g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g2ItemStateChanged(evt);
            }
        });

        ab4g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g2ItemStateChanged(evt);
            }
        });

        ab5g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g2ItemStateChanged(evt);
            }
        });

        ab6g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g2ItemStateChanged(evt);
            }
        });

        lnama7.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama7.setText("Nama");
        lnama7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama7.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama7.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama7.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama8.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama8.setText("Nama");
        lnama8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama8.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama8.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama8.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama9.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama9.setText("Nama");
        lnama9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama9.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama9.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama9.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama10.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama10.setText("Nama");
        lnama10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama10.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama10.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama10.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama11.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama11.setText("Nama");
        lnama11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama11.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama11.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama11.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama12.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama12.setText("Nama");
        lnama12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama12.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama12.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama12.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv2KeyPressed(evt);
            }
        });

        binv2.setText("Individu");
        binv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(n1g2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ab1g2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ab2g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n2g2)
                                    .addComponent(a8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ab3g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n3g2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ab4g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n4g2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ab5g2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(n5g2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(n6g2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ab6g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lnama7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ng2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bng2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ninv2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(binv2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bng2)
                    .addComponent(ng2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ninv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binv2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(a7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a9))
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11)
                    .addComponent(a12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ab3g2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ab2g2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ab1g2))
                    .addComponent(ab4g2)
                    .addComponent(ab5g2)
                    .addComponent(ab6g2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Grup 4");

        a20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a20MouseEntered(evt);
            }
        });

        a21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a21MouseEntered(evt);
            }
        });

        a22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a22MouseEntered(evt);
            }
        });

        a23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a23MouseEntered(evt);
            }
        });

        a24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a24MouseEntered(evt);
            }
        });

        a25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a25MouseEntered(evt);
            }
        });

        a26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a26MouseEntered(evt);
            }
        });

        n1g4.setToolTipText("Nilai Individu");

        n2g4.setToolTipText("Nilai Individu");

        n3g4.setToolTipText("Nilai Individu");

        n4g4.setToolTipText("Nilai Individu");

        n5g4.setToolTipText("Nilai Individu");

        n6g4.setToolTipText("Nilai Individu");

        n7g4.setToolTipText("Nilai Individu");

        bng4.setText("OK");
        bng4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng4ActionPerformed(evt);
            }
        });

        ng4.setToolTipText("Masukan Nilai Grup");
        ng4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng4KeyPressed(evt);
            }
        });

        ab1g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g4ItemStateChanged(evt);
            }
        });

        ab2g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g4ItemStateChanged(evt);
            }
        });

        ab3g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g4ItemStateChanged(evt);
            }
        });

        ab4g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g4ItemStateChanged(evt);
            }
        });

        ab5g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g4ItemStateChanged(evt);
            }
        });

        ab6g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g4ItemStateChanged(evt);
            }
        });

        ab7g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab7g4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab7g4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab7g4ItemStateChanged(evt);
            }
        });

        lnama20.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama20.setText("Nama");
        lnama20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama20.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama20.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama20.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama21.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama21.setText("Nama");
        lnama21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama21.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama21.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama21.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama22.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama22.setText("Nama");
        lnama22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama22.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama22.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama22.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama23.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama23.setText("Nama");
        lnama23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama23.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama23.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama23.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama24.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama24.setText("Nama");
        lnama24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama24.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama24.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama24.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama25.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama25.setText("Nama");
        lnama25.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama25.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama25.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama25.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama26.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama26.setText("Nama");
        lnama26.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama26.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama26.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama26.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv4KeyPressed(evt);
            }
        });

        binv4.setText("Individu");
        binv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n1g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(n2g4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n3g4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n4g4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n5g4))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(a21)
                                        .addGap(6, 6, 6)
                                        .addComponent(a22)
                                        .addGap(6, 6, 6)
                                        .addComponent(a23)
                                        .addGap(6, 6, 6)
                                        .addComponent(a24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(n6g4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n7g4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ab1g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab2g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab3g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab4g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab5g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab6g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab7g4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(ng4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bng4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ninv4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(binv4))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnama20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ng4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bng4)
                        .addComponent(ninv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(binv4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnama20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnama26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(a20)
                        .addGap(6, 6, 6)
                        .addComponent(n1g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a21)
                            .addComponent(a22)
                            .addComponent(a23)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a24)
                                .addComponent(a25)
                                .addComponent(a26)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n2g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n4g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n6g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n7g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ab4g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab3g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab2g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab5g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab1g4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab6g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab7g4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Grup 3");

        a13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a13MouseEntered(evt);
            }
        });

        a14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a14MouseEntered(evt);
            }
        });

        a15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a15MouseEntered(evt);
            }
        });

        a16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a16MouseEntered(evt);
            }
        });

        a17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a17MouseEntered(evt);
            }
        });

        a18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a18MouseEntered(evt);
            }
        });

        a19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a19MouseEntered(evt);
            }
        });

        ng3.setToolTipText("Masukan Nilai Grup");
        ng3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng3KeyPressed(evt);
            }
        });

        bng3.setText("OK");
        bng3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng3ActionPerformed(evt);
            }
        });

        ab1g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g3ItemStateChanged(evt);
            }
        });

        ab2g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g3ItemStateChanged(evt);
            }
        });

        ab3g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g3ItemStateChanged(evt);
            }
        });

        ab4g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g3ItemStateChanged(evt);
            }
        });

        ab5g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g3ItemStateChanged(evt);
            }
        });

        ab6g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g3ItemStateChanged(evt);
            }
        });

        ab7g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab7g3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab7g3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab7g3ItemStateChanged(evt);
            }
        });

        n1g3.setToolTipText("Nilai Individu");

        n2g3.setToolTipText("Nilai Individu");

        n3g3.setToolTipText("Nilai Individu");

        n4g3.setToolTipText("Nilai Individu");

        n5g3.setToolTipText("Nilai Individu");

        n6g3.setToolTipText("Nilai Individu");

        n7g3.setToolTipText("Nilai Individu");

        lnama13.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama13.setText("Nama");
        lnama13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama13.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama13.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama13.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama14.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama14.setText("Nama");
        lnama14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama14.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama14.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama14.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama15.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama15.setText("Nama");
        lnama15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama15.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama15.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama15.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama16.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama16.setText("Nama");
        lnama16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama16.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama16.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama16.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama17.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama17.setText("Nama");
        lnama17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama17.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama17.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama17.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama18.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama18.setText("Nama");
        lnama18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama18.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama18.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama18.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama19.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama19.setText("Nama");
        lnama19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama19.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama19.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama19.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv3KeyPressed(evt);
            }
        });

        binv3.setText("Individu");
        binv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(a13)
                                .addGap(6, 6, 6)
                                .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lnama13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnama14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lnama15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(a15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(n1g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n4g3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ab1g3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ab2g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab3g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab4g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ab5g3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(n5g3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(n6g3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n7g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ab6g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab7g3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(ng3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bng3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ninv3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(binv3))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ng3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bng3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ninv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(binv3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a15)
                                .addComponent(a17)
                                .addComponent(a16)
                                .addComponent(a18)
                                .addComponent(a19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lnama13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n2g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n1g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n3g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n4g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n5g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n6g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n7g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ab4g3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab1g3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab3g3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab2g3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ab6g3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ab7g3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ab5g3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bnilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow_right.png"))); // NOI18N
        bnilai.setText("Perhitungan Nilai");
        bnilai.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bnilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnilaiActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/arrow-back-icon.png"))); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Grup 5");

        a27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a27MouseEntered(evt);
            }
        });

        a28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a282MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a282MouseEntered(evt);
            }
        });

        a29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a293MouseClicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a293MouseEntered1(evt);
            }
        });

        a30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a30MouseEntered(evt);
            }
        });

        a31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a31MouseEntered(evt);
            }
        });

        a32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a32MouseEntered(evt);
            }
        });

        a33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a33MouseEntered(evt);
            }
        });

        ng5.setToolTipText("Masukan Nilai Grup");
        ng5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng5KeyPressed(evt);
            }
        });

        bng5.setText("OK");
        bng5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng5ActionPerformed(evt);
            }
        });

        ab1g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g5ItemStateChanged(evt);
            }
        });

        ab2g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g5ItemStateChanged(evt);
            }
        });

        ab3g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g5ItemStateChanged(evt);
            }
        });

        ab4g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g5ItemStateChanged(evt);
            }
        });

        ab5g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g5ItemStateChanged(evt);
            }
        });

        ab6g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g5ItemStateChanged(evt);
            }
        });

        ab7g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab7g5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab7g5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab7g5ItemStateChanged(evt);
            }
        });

        n1g5.setToolTipText("Nilai Individu");

        n2g5.setToolTipText("Nilai Individu");

        n3g5.setToolTipText("Nilai Individu");

        n4g5.setToolTipText("Nilai Individu");

        n5g5.setToolTipText("Nilai Individu");

        n6g5.setToolTipText("Nilai Individu");

        n7g5.setToolTipText("Nilai Individu");

        lnama27.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama27.setText("Nama");
        lnama27.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama27.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama27.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama27.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama28.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama28.setText("Nama");
        lnama28.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama28.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama28.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama28.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama29.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama29.setText("Nama");
        lnama29.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama29.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama29.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama29.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama30.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama30.setText("Nama");
        lnama30.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama30.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama30.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama30.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama31.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama31.setText("Nama");
        lnama31.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama31.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama31.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama31.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama32.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama32.setText("Nama");
        lnama32.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama32.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama32.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama32.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama33.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama33.setText("Nama");
        lnama33.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama33.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama33.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama33.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv5KeyPressed(evt);
            }
        });

        binv5.setText("Individu");
        binv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(a27)
                                .addGap(6, 6, 6)
                                .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lnama27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnama28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lnama29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(a29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(n1g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n4g5))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(ab1g5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ab2g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab3g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab4g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ab5g5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(n5g5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(n6g5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n7g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(ab6g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab7g5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(ng5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bng5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ninv5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(binv5)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ng5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bng5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ninv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(binv5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a29)
                                .addComponent(a31)
                                .addComponent(a30)
                                .addComponent(a32)
                                .addComponent(a33))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lnama27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n2g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n1g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n3g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n4g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n5g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n6g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n7g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ab4g5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab1g5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab3g5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab2g5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ab6g5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ab7g5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ab5g5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Grup 6");

        a34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a34MouseEntered(evt);
            }
        });

        a35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a352MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a352MouseEntered(evt);
            }
        });

        a36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a363MouseClicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a363MouseEntered1(evt);
            }
        });

        a37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a37MouseEntered(evt);
            }
        });

        a38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a38MouseEntered(evt);
            }
        });

        a39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a39MouseEntered(evt);
            }
        });

        a40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/boy.png"))); // NOI18N
        a40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a40MouseEntered(evt);
            }
        });

        ng6.setToolTipText("Masukan Nilai Grup");
        ng6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ng6KeyPressed(evt);
            }
        });

        bng6.setText("OK");
        bng6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bng6ActionPerformed(evt);
            }
        });

        ab1g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab1g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab1g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab1g6ItemStateChanged(evt);
            }
        });

        ab2g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab2g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab2g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab2g6ItemStateChanged(evt);
            }
        });

        ab3g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab3g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab3g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab3g6ItemStateChanged(evt);
            }
        });

        ab4g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab4g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab4g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab4g6ItemStateChanged(evt);
            }
        });

        ab5g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab5g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab5g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab5g6ItemStateChanged(evt);
            }
        });

        ab6g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab6g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab6g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab6g6ItemStateChanged(evt);
            }
        });

        ab7g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ab7g6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ab7g6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ab7g6ItemStateChanged(evt);
            }
        });

        n1g6.setToolTipText("Nilai Individu");

        n2g6.setToolTipText("Nilai Individu");

        n3g6.setToolTipText("Nilai Individu");

        n4g6.setToolTipText("Nilai Individu");

        n5g6.setToolTipText("Nilai Individu");

        n6g6.setToolTipText("Nilai Individu");

        n7g6.setToolTipText("Nilai Individu");

        lnama34.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama34.setText("Nama");
        lnama34.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama34.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama34.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama34.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama35.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama35.setText("Nama");
        lnama35.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama35.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama35.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama35.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama36.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama36.setText("Nama");
        lnama36.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama36.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama36.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama36.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama37.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama37.setText("Nama");
        lnama37.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama37.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama37.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama37.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama38.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama38.setText("Nama");
        lnama38.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama38.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama38.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama38.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama39.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama39.setText("Nama");
        lnama39.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama39.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama39.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama39.setPreferredSize(new java.awt.Dimension(10, 10));

        lnama40.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        lnama40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama40.setText("Nama");
        lnama40.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lnama40.setMaximumSize(new java.awt.Dimension(10, 10));
        lnama40.setMinimumSize(new java.awt.Dimension(10, 10));
        lnama40.setPreferredSize(new java.awt.Dimension(10, 10));

        ninv6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ninv6KeyPressed(evt);
            }
        });

        binv6.setText("Individu");
        binv6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binv6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(a34)
                                .addGap(6, 6, 6)
                                .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lnama34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnama35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lnama36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama37, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnama40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(a36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(n1g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n4g6))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ab1g6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ab2g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab3g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab4g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ab5g6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(n5g6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(n6g6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n7g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ab6g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ab7g6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(ng6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bng6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ninv6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(binv6))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ng6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bng6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ninv6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(binv6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a36)
                                .addComponent(a38)
                                .addComponent(a37)
                                .addComponent(a39)
                                .addComponent(a40))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lnama34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnama40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(a35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n2g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n1g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n3g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n4g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n5g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n6g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n7g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ab4g6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab1g6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab3g6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ab2g6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ab6g6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ab7g6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ab5g6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnilai))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(back)
                                .addComponent(save))))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save_mhs();
       
    }//GEN-LAST:event_saveActionPerformed

    private void bng3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng3ActionPerformed
        String bng3=ng3.getText();
        if (bng3 == null ? ("") == null : bng3.equals(""))bng3="0";
        else{
        n1g3.setText(""+bng3);
        n2g3.setText(""+bng3);
        n3g3.setText(""+bng3);
        n4g3.setText(""+bng3);
        n5g3.setText(""+bng3);
        n6g3.setText(""+bng3);
        n7g3.setText(""+bng3);
        }
    }//GEN-LAST:event_bng3ActionPerformed

    private void bng4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng4ActionPerformed
        String bng4=ng4.getText();
        if (bng4 == null ? ("") == null : bng4.equals(""))bng4="0";
        else{
        n1g4.setText(""+bng4);
        n3g4.setText(""+bng4);
        n2g4.setText(""+bng4);
        n4g4.setText(""+bng4);
        n5g4.setText(""+bng4);
        n6g4.setText(""+bng4);
        n7g4.setText(""+bng4);
        }
    }//GEN-LAST:event_bng4ActionPerformed

    private void bng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng1ActionPerformed
        // TODO add your handling code here:
        String bng1=ng1.getText();
        if (bng1 == null ? ("") == null : bng1.equals(""))bng1="0";
        else{
        n1g1.setText(""+bng1);
        n2g1.setText(""+bng1);
        n3g1.setText(""+bng1);
        n4g1.setText(""+bng1);
        n5g1.setText(""+bng1);
        n6g1.setText(""+bng1);
        }
    }//GEN-LAST:event_bng1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Kelas().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void bnilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnilaiActionPerformed
        new hasil().setVisible(true);
        dispose();
    }//GEN-LAST:event_bnilaiActionPerformed

    private void ab1g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g1ItemStateChanged
     if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn1=0;
         inv1=0;
         n1g1.setText("0");
                    n1g1.setVisible(false);
                    n1g1.revalidate();
                    n1g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g1.setVisible(true);
                    n1g1.revalidate();
                    n1g1.repaint();
    }    
    }//GEN-LAST:event_ab1g1ItemStateChanged

    private void ab2g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g1ItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn2=0;
         inv2=0;
         n2g1.setText("0");
                    n2g1.setVisible(false);
                    n2g1.revalidate();
                    n2g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g1.setVisible(true);
                    n2g1.revalidate();
                    n2g1.repaint();
    }
    }//GEN-LAST:event_ab2g1ItemStateChanged

    private void bng2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng2ActionPerformed
        String bng2=ng2.getText();
        if (bng2 == null ? ("") == null : bng2.equals(""))bng2="0";
        else{
        n1g2.setText(""+bng2);
        n2g2.setText(""+bng2);
        n3g2.setText(""+bng2);
        n4g2.setText(""+bng2);
        n5g2.setText(""+bng2);
        n6g2.setText(""+bng2);
        }
    }//GEN-LAST:event_bng2ActionPerformed

    private void ab3g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn3=0;
         inv3=0;
         n3g1.setText("0");
                    n3g1.setVisible(false);
                    n3g1.revalidate();
                    n3g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g1.setVisible(true);
                    n3g1.revalidate();
                    n3g1.repaint();
    }
    }//GEN-LAST:event_ab3g1ItemStateChanged

    private void ab4g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn4=0;
         inv4=0;
         n4g1.setText("0");
                    n4g1.setVisible(false);
                    n4g1.revalidate();
                    n4g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g1.setVisible(true);
                    n4g1.revalidate();
                    n4g1.repaint();
    }
    }//GEN-LAST:event_ab4g1ItemStateChanged

    private void ab5g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn5=0;
         inv5=0;
         n5g1.setText("0");
                    n5g1.setVisible(false);
                    n5g1.revalidate();
                    n5g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g1.setVisible(true);
                    n5g1.revalidate();
                    n5g1.repaint();
    }
    }//GEN-LAST:event_ab5g1ItemStateChanged

    private void ng1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng1.doClick();
            }
    }//GEN-LAST:event_ng1KeyPressed

    private void ng2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng2.doClick();
            }
    }//GEN-LAST:event_ng2KeyPressed

    private void ng3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng3.doClick();
            }
    }//GEN-LAST:event_ng3KeyPressed

    private void ng4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng4KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng4.doClick();
            }
    }//GEN-LAST:event_ng4KeyPressed

    private void ab1g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn7=0;
         inv7=0;
         n1g2.setText("0");
                    n1g2.setVisible(false);
                    n1g2.revalidate();
                    n1g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g2.setVisible(true);
                    n1g2.revalidate();
                    n1g2.repaint();
    }
    }//GEN-LAST:event_ab1g2ItemStateChanged

    private void ab2g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn8=0;
         inv8=0;
         n2g2.setText("0");
                    n2g2.setVisible(false);
                    n2g2.revalidate();
                    n2g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g2.setVisible(true);
                    n2g2.revalidate();
                    n2g2.repaint();
    }
    }//GEN-LAST:event_ab2g2ItemStateChanged

    private void ab3g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn9=0;
         inv9=0;
         n3g2.setText("0");
                    n3g2.setVisible(false);
                    n3g2.revalidate();
                    n3g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g2.setVisible(true);
                    n3g2.revalidate();
                    n3g2.repaint();
    }
    }//GEN-LAST:event_ab3g2ItemStateChanged

    private void ab4g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn10=0;
         inv10=0;
         n4g2.setText("0");
                    n4g2.setVisible(false);
                    n4g2.revalidate();
                    n4g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g2.setVisible(true);
                    n4g2.revalidate();
                    n4g2.repaint();
    }
    }//GEN-LAST:event_ab4g2ItemStateChanged

    private void ab5g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn11=0;
         inv11=0;
         n5g2.setText("0");
                    n5g2.setVisible(false);
                    n5g2.revalidate();
                    n5g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g2.setVisible(true);
                    n5g2.revalidate();
                    n5g2.repaint();
    }
    }//GEN-LAST:event_ab5g2ItemStateChanged

    private void ab1g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn13=0;
         inv13=0;
         n1g3.setText("0");
                    n1g3.setVisible(false);
                    n1g3.revalidate();
                    n1g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g3.setVisible(true);
                    n1g3.revalidate();
                    n1g3.repaint();
    }
    }//GEN-LAST:event_ab1g3ItemStateChanged

    private void ab2g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn14=0;
         inv14=0;
         n2g3.setText("0");
                    n2g3.setVisible(false);
                    n2g3.revalidate();
                    n2g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g3.setVisible(true);
                    n2g3.revalidate();
                    n2g3.repaint();
    }
    }//GEN-LAST:event_ab2g3ItemStateChanged

    private void ab3g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn15=0;
         inv15=0;
         n3g3.setText("0");
                    n3g3.setVisible(false);
                    n3g3.revalidate();
                    n3g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g3.setVisible(true);
                    n3g3.revalidate();
                    n3g3.repaint();
    
    }//GEN-LAST:event_ab3g3ItemStateChanged
    }
    private void ab4g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn16=0;
         inv16=0;
         n4g3.setText("0");
                    n4g3.setVisible(false);
                    n4g3.revalidate();
                    n4g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g3.setVisible(true);
                    n4g3.revalidate();
                    n4g3.repaint();
    
    }//GEN-LAST:event_ab4g3ItemStateChanged
    }
    private void ab6g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn18=0;
         inv18=0;
         n6g3.setText("0");
                    n6g3.setVisible(false);
                    n6g3.revalidate();
                    n6g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g3.setVisible(true);
                    n6g3.revalidate();
                    n6g3.repaint();
    
    }//GEN-LAST:event_ab6g3ItemStateChanged
    }    
    private void ab1g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn20=0;
         inv20=0;
         n1g4.setText("0");
                    n1g4.setVisible(false);
                    n1g4.revalidate();
                    n1g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g4.setVisible(true);
                    n1g4.revalidate();
                    n1g4.repaint();
    
    }
    }//GEN-LAST:event_ab1g4ItemStateChanged

    private void ab2g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn21=0;
         inv21=0;
         n2g4.setText("0");
                    n2g4.setVisible(false);
                    n2g4.revalidate();
                    n2g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g4.setVisible(true);
                    n2g4.revalidate();
                    n2g4.repaint();
    
    }
    }//GEN-LAST:event_ab2g4ItemStateChanged

    private void ab3g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn22=0;
         inv22=0;
         n3g4.setText("0");
                    n3g4.setVisible(false);
                    n3g4.revalidate();
                    n3g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g4.setVisible(true);
                    n3g4.revalidate();
                    n3g4.repaint();
    
    }
    }//GEN-LAST:event_ab3g4ItemStateChanged

    private void ab4g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn23=0;
         inv23=0;
         n4g4.setText("0");
                    n4g4.setVisible(false);
                    n4g4.revalidate();
                    n4g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g4.setVisible(true);
                    n4g4.revalidate();
                    n4g4.repaint();
    
    }
    }//GEN-LAST:event_ab4g4ItemStateChanged

    private void ab5g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn24=0;
         inv24=0;         
         n5g4.setText("0");
                    n5g4.setVisible(false);
                    n5g4.revalidate();
                    n5g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g4.setVisible(true);
                    n5g4.revalidate();
                    n5g4.repaint();
    
    }
    }//GEN-LAST:event_ab5g4ItemStateChanged

    private void a1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseEntered
        a1.setToolTipText(lnama1+" "+npm1);
    }//GEN-LAST:event_a1MouseEntered

    private void a2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseEntered
        a2.setToolTipText(nm2+" "+npm2);
    }//GEN-LAST:event_a2MouseEntered

    private void a3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseEntered
        a3.setToolTipText(nm3+" "+npm3);
    }//GEN-LAST:event_a3MouseEntered

    private void a4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseEntered
        a4.setToolTipText(nm4+" "+npm4);
    }//GEN-LAST:event_a4MouseEntered

    private void a5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseEntered
        a5.setToolTipText(nm5+" "+npm5);
    }//GEN-LAST:event_a5MouseEntered

    private void a7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseEntered
        a7.setToolTipText(nm7+" "+npm7);
    }//GEN-LAST:event_a7MouseEntered

    private void a8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseEntered
        a8.setToolTipText(nm8+" "+npm8);
    }//GEN-LAST:event_a8MouseEntered

    private void a9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a9MouseEntered
        a9.setToolTipText(nm9+" "+npm9);
    }//GEN-LAST:event_a9MouseEntered

    private void a10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a10MouseEntered
        a10.setToolTipText(nm10+" "+npm10);
    }//GEN-LAST:event_a10MouseEntered

    private void a11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a11MouseEntered
        a11.setToolTipText(nm11+" "+npm11);
    }//GEN-LAST:event_a11MouseEntered

    private void a13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a13MouseEntered
        a13.setToolTipText(nm13+" "+npm13);
    }//GEN-LAST:event_a13MouseEntered

    private void a14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a14MouseEntered
        a14.setToolTipText(nm14+" "+npm14);
    }//GEN-LAST:event_a14MouseEntered

    private void a15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a15MouseEntered
        a15.setToolTipText(nm15+" "+npm15);
    }//GEN-LAST:event_a15MouseEntered

    private void a16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a16MouseEntered
        a16.setToolTipText(nm16+" "+npm16);
    }//GEN-LAST:event_a16MouseEntered

    private void a17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a17MouseEntered
        a17.setToolTipText(nm17+" "+npm17);
    }//GEN-LAST:event_a17MouseEntered

    private void a20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a20MouseEntered
        a20.setToolTipText(nm20+" "+npm20);
    }//GEN-LAST:event_a20MouseEntered

    private void a21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a21MouseEntered
        a21.setToolTipText(nm21+" "+npm21);
    }//GEN-LAST:event_a21MouseEntered

    private void a22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a22MouseEntered
        a22.setToolTipText(nm22+" "+npm22);
    }//GEN-LAST:event_a22MouseEntered

    private void a23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a23MouseEntered
        a23.setToolTipText(nm23+" "+npm23);
    }//GEN-LAST:event_a23MouseEntered

    private void a24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a24MouseEntered
        a24.setToolTipText(nm24+" "+npm24);
    }//GEN-LAST:event_a24MouseEntered

    private void a6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseEntered
        a6.setToolTipText(nm6+" "+npm6);
    }//GEN-LAST:event_a6MouseEntered

    private void ab6g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn6=0;
         inv6=0;
         n6g1.setText("0");
                    n6g1.setVisible(false);
                    n6g1.revalidate();
                    n6g1.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g1.setVisible(true);
                    n6g1.revalidate();
                    n6g1.repaint();
    }
    }//GEN-LAST:event_ab6g1ItemStateChanged

    private void a12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a12MouseEntered
        a12.setToolTipText(nm12+" "+npm12);
    }//GEN-LAST:event_a12MouseEntered

    private void ab6g2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn12=0;
         inv12=0;
         n6g2.setText("0");
                    n6g2.setVisible(false);
                    n6g2.revalidate();
                    n6g2.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g2.setVisible(true);
                    n6g2.revalidate();
                    n6g2.repaint();
    }
    }//GEN-LAST:event_ab6g2ItemStateChanged

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
         String tn1=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv1=Integer.parseInt(tn1);         
    }//GEN-LAST:event_a1MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        String tn2=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv2=Integer.parseInt(tn2); 
    }//GEN-LAST:event_a2MouseClicked

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
        String tn3=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv3=Integer.parseInt(tn3); 
    }//GEN-LAST:event_a3MouseClicked

    private void a4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseClicked
        String tn4=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv4=Integer.parseInt(tn4); 
    }//GEN-LAST:event_a4MouseClicked

    private void a5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseClicked
        String tn5=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv5=Integer.parseInt(tn5); 
    }//GEN-LAST:event_a5MouseClicked

    private void a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseClicked
        String tn6=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv6=Integer.parseInt(tn6); 
    }//GEN-LAST:event_a6MouseClicked

    private void a7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseClicked
        String tn7=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv7=Integer.parseInt(tn7);
    }//GEN-LAST:event_a7MouseClicked

    private void a8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseClicked
        String tn8=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv8=Integer.parseInt(tn8);
    }//GEN-LAST:event_a8MouseClicked

    private void a9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a9MouseClicked
        String tn9=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv9=Integer.parseInt(tn9);
    }//GEN-LAST:event_a9MouseClicked

    private void a10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a10MouseClicked
        String tn10=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv10=Integer.parseInt(tn10);
    }//GEN-LAST:event_a10MouseClicked

    private void a11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a11MouseClicked
        String tn11=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv11=Integer.parseInt(tn11);
    }//GEN-LAST:event_a11MouseClicked

    private void a12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a12MouseClicked
        String tn12=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv12=Integer.parseInt(tn12);
    }//GEN-LAST:event_a12MouseClicked

    private void a19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a19MouseEntered
        a19.setToolTipText(nm19+" "+npm19);
    }//GEN-LAST:event_a19MouseEntered

    private void a18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a18MouseEntered
        a18.setToolTipText(nm18+" "+npm18);
    }//GEN-LAST:event_a18MouseEntered

    private void ab5g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn17=0;
         n5g3.setText("0");
                    n5g3.setVisible(false);
                    n5g3.revalidate();
                    n5g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g3.setVisible(true);
                    n5g3.revalidate();
                    n5g3.repaint();
    
    }
    }//GEN-LAST:event_ab5g3ItemStateChanged

    private void ab7g3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab7g3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn19=0;
         inv19=0;
         n7g3.setText("0");
                    n7g3.setVisible(false);
                    n7g3.revalidate();
                    n7g3.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n7g3.setVisible(true);
                    n7g3.revalidate();
                    n7g3.repaint();
    
    }
    }//GEN-LAST:event_ab7g3ItemStateChanged

    private void a13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a13MouseClicked
        String tn13=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv13=Integer.parseInt(tn13);
    }//GEN-LAST:event_a13MouseClicked

    private void a14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a14MouseClicked
        String tn14=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv14=Integer.parseInt(tn14);
    }//GEN-LAST:event_a14MouseClicked

    private void a15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a15MouseClicked
        String tn15=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv15=Integer.parseInt(tn15);
    }//GEN-LAST:event_a15MouseClicked

    private void a16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a16MouseClicked
        String tn16=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv16=Integer.parseInt(tn16);
    }//GEN-LAST:event_a16MouseClicked

    private void a17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a17MouseClicked
        String tn17=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv17=Integer.parseInt(tn17);
    }//GEN-LAST:event_a17MouseClicked

    private void a18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a18MouseClicked
        String tn18=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv18=Integer.parseInt(tn18);
    }//GEN-LAST:event_a18MouseClicked

    private void a19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a19MouseClicked
        String tn19=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv19=Integer.parseInt(tn19);
    }//GEN-LAST:event_a19MouseClicked

    private void a25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a25MouseEntered
        a25.setToolTipText(nm25+" "+npm25);
    }//GEN-LAST:event_a25MouseEntered

    private void a26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a26MouseEntered
        a26.setToolTipText(nm26+" "+npm26);
    }//GEN-LAST:event_a26MouseEntered

    private void ab6g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn25=0;
         inv25=0;
         n6g4.setText("0");
                    n6g4.setVisible(false);
                    n6g4.revalidate();
                    n6g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g4.setVisible(true);
                    n6g4.revalidate();
                    n6g4.repaint();
    
    }
    }//GEN-LAST:event_ab6g4ItemStateChanged

    private void ab7g4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab7g4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn26=0;
         inv26=0;
         n7g4.setText("0");
                    n7g4.setVisible(false);
                    n7g4.revalidate();
                    n7g4.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n7g4.setVisible(true);
                    n7g4.revalidate();
                    n7g4.repaint();
    
    }
    }//GEN-LAST:event_ab7g4ItemStateChanged

    private void a20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a20MouseClicked
        String tn20=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv20=Integer.parseInt(tn20);
    }//GEN-LAST:event_a20MouseClicked

    private void a21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a21MouseClicked
        String tn21=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv21=Integer.parseInt(tn21);
    }//GEN-LAST:event_a21MouseClicked

    private void a22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a22MouseClicked
        String tn22=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv22=Integer.parseInt(tn22);
    }//GEN-LAST:event_a22MouseClicked

    private void a23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a23MouseClicked
        String tn23=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv23=Integer.parseInt(tn23);
    }//GEN-LAST:event_a23MouseClicked

    private void a24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a24MouseClicked
        String tn24=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv24=Integer.parseInt(tn24);
    }//GEN-LAST:event_a24MouseClicked

    private void a25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a25MouseClicked
        String tn25=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv25=Integer.parseInt(tn25);
    }//GEN-LAST:event_a25MouseClicked

    private void a26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a26MouseClicked
        String tn26=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv26=Integer.parseInt(tn26);
    }//GEN-LAST:event_a26MouseClicked

    private void a282MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a282MouseClicked
        String tn28=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv28=Integer.parseInt(tn28);
    }//GEN-LAST:event_a282MouseClicked

    private void a282MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a282MouseEntered
        a28.setToolTipText(nm28+" "+npm28);
    }//GEN-LAST:event_a282MouseEntered

    private void a293MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a293MouseClicked1
        String tn29=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv29=Integer.parseInt(tn29);
    }//GEN-LAST:event_a293MouseClicked1

    private void a293MouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a293MouseEntered1
        a29.setToolTipText(nm29+" "+npm29);
    }//GEN-LAST:event_a293MouseEntered1

    private void a30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a30MouseClicked
        String tn30=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv30=Integer.parseInt(tn30);
    }//GEN-LAST:event_a30MouseClicked

    private void a30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a30MouseEntered
        a30.setToolTipText(nm30+" "+npm30);
    }//GEN-LAST:event_a30MouseEntered

    private void ng5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng5KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng5.doClick();
            }
    }//GEN-LAST:event_ng5KeyPressed

    private void bng5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng5ActionPerformed
        String bng5=ng5.getText();
        if (bng5 == null ? ("") == null : bng5.equals(""))bng5="0";
        else{
        n1g5.setText(""+bng5);
        n2g5.setText(""+bng5);
        n3g5.setText(""+bng5);
        n4g5.setText(""+bng5);
        n5g5.setText(""+bng5);
        n6g5.setText(""+bng5);
        n7g5.setText(""+bng5);
        }
    }//GEN-LAST:event_bng5ActionPerformed

    private void ab1g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn27=0;
         inv27=0;
         n1g5.setText("0");
                    n1g5.setVisible(false);
                    n1g5.revalidate();
                    n1g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g5.setVisible(true);
                    n1g5.revalidate();
                    n1g5.repaint();
    }
    }//GEN-LAST:event_ab1g5ItemStateChanged

    private void ab2g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn28=0;
         inv28=0;
         n2g5.setText("0");
                    n2g5.setVisible(false);
                    n2g5.revalidate();
                    n2g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g5.setVisible(true);
                    n2g5.revalidate();
                    n2g5.repaint();
    }
    }//GEN-LAST:event_ab2g5ItemStateChanged

    private void ab3g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn29=0;
         inv29=0;
         n3g5.setText("0");
                    n3g5.setVisible(false);
                    n3g5.revalidate();
                    n3g5.repaint();
       
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g5.setVisible(true);
                    n3g5.revalidate();
                    n3g5.repaint();
    }
    }//GEN-LAST:event_ab3g5ItemStateChanged

    private void ab4g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn30=0;
         inv30=0;
         n4g5.setText("0");
                    n4g5.setVisible(false);
                    n4g5.revalidate();
                    n4g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g5.setVisible(true);
                    n4g5.revalidate();
                    n4g5.repaint();
    }
    }//GEN-LAST:event_ab4g5ItemStateChanged

    private void ab6g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn32=0;
         inv32=0;
         n6g5.setText("0");
                    n6g5.setVisible(false);
                    n6g5.revalidate();
                    n6g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g5.setVisible(true);
                    n6g5.revalidate();
                    n6g5.repaint();
    }
    }//GEN-LAST:event_ab6g5ItemStateChanged

    private void a27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a27MouseClicked
        String tn27=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv27=Integer.parseInt(tn27);
    }//GEN-LAST:event_a27MouseClicked

    private void a27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a27MouseEntered
        a27.setToolTipText(nm27+" "+npm27);
    }//GEN-LAST:event_a27MouseEntered

    private void a31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a31MouseClicked
        String tn31=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv31=Integer.parseInt(tn31);
    }//GEN-LAST:event_a31MouseClicked

    private void a31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a31MouseEntered
        a31.setToolTipText(nm31+" "+npm31);
    }//GEN-LAST:event_a31MouseEntered

    private void a33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a33MouseClicked
        String tn33=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv33=Integer.parseInt(tn33);
    }//GEN-LAST:event_a33MouseClicked

    private void a33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a33MouseEntered
        a33.setToolTipText(nm33+" "+npm33);
    }//GEN-LAST:event_a33MouseEntered

    private void a32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a32MouseClicked
        String tn32=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv32=Integer.parseInt(tn32);
    }//GEN-LAST:event_a32MouseClicked

    private void a32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a32MouseEntered
        a32.setToolTipText(nm32+" "+npm32);
    }//GEN-LAST:event_a32MouseEntered

    private void ab5g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn31=0;
         inv31=0;
         n5g5.setText("0");
                    n5g5.setVisible(false);
                    n5g5.revalidate();
                    n5g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g5.setVisible(true);
                    n5g5.revalidate();
                    n5g5.repaint();
    }
    }//GEN-LAST:event_ab5g5ItemStateChanged

    private void ab7g5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab7g5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn33=0;
         inv33=0;
         n7g5.setText("0");
                    n7g5.setVisible(false);
                    n7g5.revalidate();
                    n7g5.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n7g5.setVisible(true);
                    n7g5.revalidate();
                    n7g5.repaint();
    }
    }//GEN-LAST:event_ab7g5ItemStateChanged

    private void a34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a34MouseClicked
        String tn34=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv34=Integer.parseInt(tn34);
    }//GEN-LAST:event_a34MouseClicked

    private void a34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a34MouseEntered
        a34.setToolTipText(nm34+" "+npm34);
    }//GEN-LAST:event_a34MouseEntered

    private void a352MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a352MouseClicked
        String tn35=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv35=Integer.parseInt(tn35);
    }//GEN-LAST:event_a352MouseClicked

    private void a352MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a352MouseEntered
        a35.setToolTipText(nm35+" "+npm35);
    }//GEN-LAST:event_a352MouseEntered

    private void a363MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a363MouseClicked1
        String tn36=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv36=Integer.parseInt(tn36);
    }//GEN-LAST:event_a363MouseClicked1

    private void a363MouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a363MouseEntered1
        a36.setToolTipText(nm36+" "+npm36);
    }//GEN-LAST:event_a363MouseEntered1

    private void a37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a37MouseClicked
        String tn37=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv37=Integer.parseInt(tn37);
    }//GEN-LAST:event_a37MouseClicked

    private void a37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a37MouseEntered
        a37.setToolTipText(nm37+" "+npm37);
    }//GEN-LAST:event_a37MouseEntered

    private void a38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a38MouseClicked
        String tn38=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv38=Integer.parseInt(tn38);
    }//GEN-LAST:event_a38MouseClicked

    private void a38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a38MouseEntered
        a38.setToolTipText(nm38+" "+npm38);
    }//GEN-LAST:event_a38MouseEntered

    private void a39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a39MouseClicked
        String tn39=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv39=Integer.parseInt(tn39);
    }//GEN-LAST:event_a39MouseClicked

    private void a39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a39MouseEntered
        a39.setToolTipText(nm39+" "+npm39);
    }//GEN-LAST:event_a39MouseEntered

    private void a40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a40MouseClicked
        String tn40=JOptionPane.showInputDialog(null,"Masukan Nilai individu: ");
         inv40=Integer.parseInt(tn40);
    }//GEN-LAST:event_a40MouseClicked

    private void a40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a40MouseEntered
        a40.setToolTipText(nm40+" "+npm40);
    }//GEN-LAST:event_a40MouseEntered

    private void ng6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng6KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               bng6.doClick();
            }
    }//GEN-LAST:event_ng6KeyPressed

    private void bng6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bng6ActionPerformed
        String bng6=ng6.getText();
        if (bng6 == null ? ("") == null : bng6.equals(""))bng6="0";
        else{
        n1g6.setText(""+bng6);
        n3g6.setText(""+bng6);
        n2g6.setText(""+bng6);
        n4g6.setText(""+bng6);
        n5g6.setText(""+bng6);
        n6g6.setText(""+bng6);
        n7g6.setText(""+bng6);
        }
    }//GEN-LAST:event_bng6ActionPerformed

    private void ab1g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab1g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn34=0;
         inv34=0;
         n1g6.setText("0");
                    n1g6.setVisible(false);
                    n1g6.revalidate();
                    n1g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n1g6.setVisible(true);
                    n1g6.revalidate();
                    n1g6.repaint();
    }
    }//GEN-LAST:event_ab1g6ItemStateChanged

    private void ab2g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab2g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn35=0;
         inv35=0;
         n2g6.setText("0");
                    n2g6.setVisible(false);
                    n2g6.revalidate();
                    n2g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n2g6.setVisible(true);
                    n2g6.revalidate();
                    n2g6.repaint();
    }
    }//GEN-LAST:event_ab2g6ItemStateChanged

    private void ab3g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab3g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn36=0;
         inv36=0;
         n3g6.setText("0");
                    n3g6.setVisible(false);
                    n3g6.revalidate();
                    n3g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n3g6.setVisible(true);
                    n3g6.revalidate();
                    n3g6.repaint();
    }
    }//GEN-LAST:event_ab3g6ItemStateChanged

    private void ab4g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab4g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn37=0;
         inv37=0;
         n4g6.setText("0");
                    n4g6.setVisible(false);
                    n4g6.revalidate();
                    n4g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n4g6.setVisible(true);
                    n4g6.revalidate();
                    n4g6.repaint();
    }
    }//GEN-LAST:event_ab4g6ItemStateChanged

    private void ab5g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab5g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn38=0;
         inv38=0;
         n5g6.setText("0");
                    n5g6.setVisible(false);
                    n5g6.revalidate();
                    n5g6.repaint();
       
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n5g6.setVisible(true);
                    n5g6.revalidate();
                    n5g6.repaint();
    }
    }//GEN-LAST:event_ab5g6ItemStateChanged

    private void ab6g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab6g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn39=0;
         inv39=0;
         n6g6.setText("0");
                    n6g6.setVisible(false);
                    n6g6.revalidate();
                    n6g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n6g6.setVisible(true);
                    n6g6.revalidate();
                    n6g6.repaint();
    }
    }//GEN-LAST:event_ab6g6ItemStateChanged

    private void ab7g6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ab7g6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
         absn40=0;
         inv40=0;
         n7g6.setText("0");
                    n7g6.setVisible(false);
                    n7g6.revalidate();
                    n7g6.repaint();
        
    }
    else if (evt.getStateChange() == ItemEvent.DESELECTED) {        
                    n7g6.setVisible(true);
                    n7g6.revalidate();
                    n7g6.repaint();
    }
    }//GEN-LAST:event_ab7g6ItemStateChanged

    private void ninv1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv1.doClick();
            }
    }//GEN-LAST:event_ninv1KeyPressed

    private void binv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv1ActionPerformed
        String binv1=ninv1.getText();
        if (binv1 == null ? ("") == null : binv1.equals(""))binv1="0";
        else{
        inv1=Integer.parseInt(binv1);
        inv2=Integer.parseInt(binv1);
        inv3=Integer.parseInt(binv1);
        inv4=Integer.parseInt(binv1);
        inv5=Integer.parseInt(binv1);
        inv6=Integer.parseInt(binv1);        
        }
    }//GEN-LAST:event_binv1ActionPerformed

    private void ninv2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv2.doClick();
            }
    }//GEN-LAST:event_ninv2KeyPressed

    private void binv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv2ActionPerformed
        String binv2=ninv2.getText();
        if (binv2 == null ? ("") == null : binv2.equals(""))binv2="0";
        else{
        inv7=Integer.parseInt(binv2);
        inv8=Integer.parseInt(binv2);
        inv9=Integer.parseInt(binv2);
        inv10=Integer.parseInt(binv2);
        inv11=Integer.parseInt(binv2);
        inv12=Integer.parseInt(binv2);        
        }
    }//GEN-LAST:event_binv2ActionPerformed

    private void ninv3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv3.doClick();
            }
    }//GEN-LAST:event_ninv3KeyPressed

    private void binv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv3ActionPerformed
        String binv3=ninv3.getText();
        if (binv3 == null ? ("") == null : binv3.equals(""))binv3="0";
        else{
        inv13=Integer.parseInt(binv3);
        inv14=Integer.parseInt(binv3);
        inv15=Integer.parseInt(binv3);
        inv16=Integer.parseInt(binv3);
        inv17=Integer.parseInt(binv3);
        inv18=Integer.parseInt(binv3);
        inv19=Integer.parseInt(binv3);
        }
    }//GEN-LAST:event_binv3ActionPerformed

    private void ninv4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv4KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv4.doClick();
            }
    }//GEN-LAST:event_ninv4KeyPressed

    private void binv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv4ActionPerformed
        String binv4=ninv4.getText();
        if (binv4 == null ? ("") == null : binv4.equals(""))binv4="0";
        else{
        inv20=Integer.parseInt(binv4);
        inv21=Integer.parseInt(binv4);
        inv22=Integer.parseInt(binv4);
        inv23=Integer.parseInt(binv4);
        inv24=Integer.parseInt(binv4);
        inv25=Integer.parseInt(binv4);
        inv26=Integer.parseInt(binv4);
        }
    }//GEN-LAST:event_binv4ActionPerformed

    private void ninv5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv5KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv5.doClick();
            }
    }//GEN-LAST:event_ninv5KeyPressed

    private void binv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv5ActionPerformed
        String binv5=ninv5.getText();
        if (binv5 == null ? ("") == null : binv5.equals(""))binv5="0";
        else{
        inv27=Integer.parseInt(binv5);
        inv28=Integer.parseInt(binv5);
        inv29=Integer.parseInt(binv5);
        inv30=Integer.parseInt(binv5);
        inv31=Integer.parseInt(binv5);
        inv32=Integer.parseInt(binv5);
        inv33=Integer.parseInt(binv5);
        }
    }//GEN-LAST:event_binv5ActionPerformed

    private void ninv6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ninv6KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
               binv6.doClick();
            }
    }//GEN-LAST:event_ninv6KeyPressed

    private void binv6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binv6ActionPerformed
        String binv6=ninv6.getText();
        if (binv6 == null ? ("") == null : binv6.equals(""))binv6="0";
        else{
        inv34=Integer.parseInt(binv6);
        inv35=Integer.parseInt(binv6);
        inv36=Integer.parseInt(binv6);
        inv37=Integer.parseInt(binv6);
        inv38=Integer.parseInt(binv6);
        inv39=Integer.parseInt(binv6);
        inv40=Integer.parseInt(binv6);
        }
    }//GEN-LAST:event_binv6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Matkuln;
    private javax.swing.JLabel TopikMk;
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JButton a19;
    private javax.swing.JButton a2;
    private javax.swing.JButton a20;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton a23;
    private javax.swing.JButton a24;
    private javax.swing.JButton a25;
    private javax.swing.JButton a26;
    private javax.swing.JButton a27;
    private javax.swing.JButton a28;
    private javax.swing.JButton a29;
    private javax.swing.JButton a3;
    private javax.swing.JButton a30;
    private javax.swing.JButton a31;
    private javax.swing.JButton a32;
    private javax.swing.JButton a33;
    private javax.swing.JButton a34;
    private javax.swing.JButton a35;
    private javax.swing.JButton a36;
    private javax.swing.JButton a37;
    private javax.swing.JButton a38;
    private javax.swing.JButton a39;
    private javax.swing.JButton a4;
    private javax.swing.JButton a40;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JRadioButton ab1g1;
    private javax.swing.JRadioButton ab1g2;
    private javax.swing.JRadioButton ab1g3;
    private javax.swing.JRadioButton ab1g4;
    private javax.swing.JRadioButton ab1g5;
    private javax.swing.JRadioButton ab1g6;
    private javax.swing.JRadioButton ab2g1;
    private javax.swing.JRadioButton ab2g2;
    private javax.swing.JRadioButton ab2g3;
    private javax.swing.JRadioButton ab2g4;
    private javax.swing.JRadioButton ab2g5;
    private javax.swing.JRadioButton ab2g6;
    private javax.swing.JRadioButton ab3g1;
    private javax.swing.JRadioButton ab3g2;
    private javax.swing.JRadioButton ab3g3;
    private javax.swing.JRadioButton ab3g4;
    private javax.swing.JRadioButton ab3g5;
    private javax.swing.JRadioButton ab3g6;
    private javax.swing.JRadioButton ab4g1;
    private javax.swing.JRadioButton ab4g2;
    private javax.swing.JRadioButton ab4g3;
    private javax.swing.JRadioButton ab4g4;
    private javax.swing.JRadioButton ab4g5;
    private javax.swing.JRadioButton ab4g6;
    private javax.swing.JRadioButton ab5g1;
    private javax.swing.JRadioButton ab5g2;
    private javax.swing.JRadioButton ab5g3;
    private javax.swing.JRadioButton ab5g4;
    private javax.swing.JRadioButton ab5g5;
    private javax.swing.JRadioButton ab5g6;
    private javax.swing.JRadioButton ab6g1;
    private javax.swing.JRadioButton ab6g2;
    private javax.swing.JRadioButton ab6g3;
    private javax.swing.JRadioButton ab6g4;
    private javax.swing.JRadioButton ab6g5;
    private javax.swing.JRadioButton ab6g6;
    private javax.swing.JRadioButton ab7g3;
    private javax.swing.JRadioButton ab7g4;
    private javax.swing.JRadioButton ab7g5;
    private javax.swing.JRadioButton ab7g6;
    private javax.swing.JButton back;
    private javax.swing.JButton binv1;
    private javax.swing.JButton binv2;
    private javax.swing.JButton binv3;
    private javax.swing.JButton binv4;
    private javax.swing.JButton binv5;
    private javax.swing.JButton binv6;
    private javax.swing.JButton bng1;
    private javax.swing.JButton bng2;
    private javax.swing.JButton bng3;
    private javax.swing.JButton bng4;
    private javax.swing.JButton bng5;
    private javax.swing.JButton bng6;
    private javax.swing.JButton bnilai;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lnama1;
    private javax.swing.JLabel lnama10;
    private javax.swing.JLabel lnama11;
    private javax.swing.JLabel lnama12;
    private javax.swing.JLabel lnama13;
    private javax.swing.JLabel lnama14;
    private javax.swing.JLabel lnama15;
    private javax.swing.JLabel lnama16;
    private javax.swing.JLabel lnama17;
    private javax.swing.JLabel lnama18;
    private javax.swing.JLabel lnama19;
    private javax.swing.JLabel lnama2;
    private javax.swing.JLabel lnama20;
    private javax.swing.JLabel lnama21;
    private javax.swing.JLabel lnama22;
    private javax.swing.JLabel lnama23;
    private javax.swing.JLabel lnama24;
    private javax.swing.JLabel lnama25;
    private javax.swing.JLabel lnama26;
    private javax.swing.JLabel lnama27;
    private javax.swing.JLabel lnama28;
    private javax.swing.JLabel lnama29;
    private javax.swing.JLabel lnama3;
    private javax.swing.JLabel lnama30;
    private javax.swing.JLabel lnama31;
    private javax.swing.JLabel lnama32;
    private javax.swing.JLabel lnama33;
    private javax.swing.JLabel lnama34;
    private javax.swing.JLabel lnama35;
    private javax.swing.JLabel lnama36;
    private javax.swing.JLabel lnama37;
    private javax.swing.JLabel lnama38;
    private javax.swing.JLabel lnama39;
    private javax.swing.JLabel lnama4;
    private javax.swing.JLabel lnama40;
    private javax.swing.JLabel lnama5;
    private javax.swing.JLabel lnama6;
    private javax.swing.JLabel lnama7;
    private javax.swing.JLabel lnama8;
    private javax.swing.JLabel lnama9;
    private javax.swing.JTextField n1g1;
    private javax.swing.JTextField n1g2;
    private javax.swing.JTextField n1g3;
    private javax.swing.JTextField n1g4;
    private javax.swing.JTextField n1g5;
    private javax.swing.JTextField n1g6;
    private javax.swing.JTextField n2g1;
    private javax.swing.JTextField n2g2;
    private javax.swing.JTextField n2g3;
    private javax.swing.JTextField n2g4;
    private javax.swing.JTextField n2g5;
    private javax.swing.JTextField n2g6;
    private javax.swing.JTextField n3g1;
    private javax.swing.JTextField n3g2;
    private javax.swing.JTextField n3g3;
    private javax.swing.JTextField n3g4;
    private javax.swing.JTextField n3g5;
    private javax.swing.JTextField n3g6;
    private javax.swing.JTextField n4g1;
    private javax.swing.JTextField n4g2;
    private javax.swing.JTextField n4g3;
    private javax.swing.JTextField n4g4;
    private javax.swing.JTextField n4g5;
    private javax.swing.JTextField n4g6;
    private javax.swing.JTextField n5g1;
    private javax.swing.JTextField n5g2;
    private javax.swing.JTextField n5g3;
    private javax.swing.JTextField n5g4;
    private javax.swing.JTextField n5g5;
    private javax.swing.JTextField n5g6;
    private javax.swing.JTextField n6g1;
    private javax.swing.JTextField n6g2;
    private javax.swing.JTextField n6g3;
    private javax.swing.JTextField n6g4;
    private javax.swing.JTextField n6g5;
    private javax.swing.JTextField n6g6;
    private javax.swing.JTextField n7g3;
    private javax.swing.JTextField n7g4;
    private javax.swing.JTextField n7g5;
    private javax.swing.JTextField n7g6;
    private javax.swing.JTextField ng1;
    private javax.swing.JTextField ng2;
    private javax.swing.JTextField ng3;
    private javax.swing.JTextField ng4;
    private javax.swing.JTextField ng5;
    private javax.swing.JTextField ng6;
    private javax.swing.JTextField ninv1;
    private javax.swing.JTextField ninv2;
    private javax.swing.JTextField ninv3;
    private javax.swing.JTextField ninv4;
    private javax.swing.JTextField ninv5;
    private javax.swing.JTextField ninv6;
    private javax.swing.JLabel ptmk;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
