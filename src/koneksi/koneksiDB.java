/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author veluvi
 */
public class koneksiDB {
    private static Connection con;
    private static Connection con2;
    
    public static Connection getkoneksi(){
        if (con==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection("jdbc:mysql://localhost/cad_teknik_kompilasi", "root", "");
                System.out.println("Berhasil");
                } catch (Exception e){
                e.getStackTrace();
            }
        }
        return con;
    }
    public static Connection getkoneksi2(){
        if (con2==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con2 = DriverManager.getConnection("jdbc:mysql://localhost/cad_pbo", "root", "");
                System.out.println("Berhasil");
                } catch (Exception e){
                e.getStackTrace();
            }
        }
        return con2;
    }
    public static class con {

        public con() {
        }
    }
    public static class con2 {

        public con2() {
        }
    }

}