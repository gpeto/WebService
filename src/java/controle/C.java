/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

//BIBLIOTECAS
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gpeto
 */
public class C {
    private static final String URL = "jdbc:mysql://localhost/webservice";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String SENHA ="";
    
    private static Connection con;
    
    // METODO CONECTAR BANCO
    public static Connection cb() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        con = (Connection) DriverManager.getConnection(URL, USER, SENHA);
        return con;
    }
    
    // METODO DESCONECTAR BANCO
    public static void db(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
