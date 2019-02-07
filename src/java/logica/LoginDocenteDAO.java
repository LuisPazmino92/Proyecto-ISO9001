package logica;

import adaptador.ConexionJDBC;
import clases.Docente;
import interfaz.IntLoginDocente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author renzo
 */
public class LoginDocenteDAO implements IntLoginDocente {

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
    public Docente login(String userDocente,String passDocente) {
        System.out.println("USER DOCENTE: "+userDocente);
        System.out.println("PASSWORD DOCENTE: "+ passDocente);
        /*INSERT INTO docente( nombre, apellido, email, userdocente, passdocente) values('Luis','Abad','la@utpl.edu.ec','ldocente','ldocente')*/
        Docente objDocente = new Docente();
        try {
            String sql = "SELECT id,nombre,apellido,email,userdocente,passdocente FROM DOCENTE WHERE USERDOCENTE = '" + userDocente + "' AND PASSDOCENTE = '" + passDocente+"'";
            Statement stm = getConnection().createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            System.out.println(sql);
            while (resultado.next()) {
                objDocente.setIdDocetne(Integer.parseInt(resultado.getString("id")));
                objDocente.setNombreDocente(resultado.getString("nombre"));
                objDocente.setApellidoDocente(resultado.getString("apellido"));
                objDocente.setEmail(resultado.getString("email"));
                objDocente.setUserDocente(resultado.getString("userdocente"));
                objDocente.setPassDocente(resultado.getString("passdocente"));
                System.out.println("DOCENTE NAME: " + objDocente.getNombreDocente());
                System.out.println("DOCENTE LASTNAME: " + objDocente.getApellidoDocente());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR");
        }
        return objDocente;
    }

}
