/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import adaptador.ConexionJDBC;
import clases.Administrador;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import interfaz.IntLogin;

/**
 *
 * @author Usuario
 */
public class LoginAdminDAO implements IntLogin {

    private Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }

    public Connection getConnection() {
        if (con == null) {
            con = new ConexionJDBC().getConnection();
        }
        return con;
    }

    public void cerrarConeccion() {
        try {
            getConnection().close();
            con = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Administrador login(String usuario, String clave) {
        System.out.println("USUARIO: "+usuario);
        System.out.println("CLAVE: "+ clave);
        Administrador objAdmin =  new Administrador();
        try {
            String sql = "SELECT nombre,apellido,usuario,clave FROM ADMIN WHERE USUARIO = '" + usuario + "' AND CLAVE = '" + clave+"'";
            Statement stm = getConnection().createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            System.out.println(sql);
            while (resultado.next()) {
                objAdmin.setNombre(resultado.getString("nombre"));
                objAdmin.setApellido(resultado.getString("apellido"));
                objAdmin.setUsuario(resultado.getString("usuario"));
                objAdmin.setClave(resultado.getString("clave"));
                System.out.println("ADMIN NOMBRE: " + objAdmin.getNombre());
                System.out.println("ADMIN APELLIDO: " + objAdmin.getApellido());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR AL BUSCAR");
        }
        return objAdmin;
    }

}
