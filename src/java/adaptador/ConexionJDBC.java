/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import interfaz.IntConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionJDBC implements IntConexion{
    private Connection con;
    private String user = "luis";
    private String password = "luis";
    private String url = "jdbc:derby://localhost:1527/Iso9001";
    private String driverClass = "org.apache.derby.jdbc.ClientDriver";

    public ConexionJDBC(String user, String password, String url, String driverClass){
        this.user = user;
        this.password = password;
        this.url = url;
        this.driverClass = driverClass;  
        conectar();
    }
    
    public ConexionJDBC(){
        conectar();
    }
    @Override
    public void conectar() {
    try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException a) {
            System.out.println("----- ERROR DE CONEXION");
            a.printStackTrace();
        }catch(SQLException e){    
            System.out.println("---- ERROR DE SQL");
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
