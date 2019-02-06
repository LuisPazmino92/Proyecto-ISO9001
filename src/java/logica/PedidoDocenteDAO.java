package logica;

import adaptador.ConexionJDBC;
import clases.Pedido;
import clases.PedidoDocente;
import interfaz.IntPedidoDocenteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author renzo
 */
public class PedidoDocenteDAO implements IntPedidoDocenteDAO {

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
    public List<PedidoDocente> listarTodos() {
         List<PedidoDocente> lista = new ArrayList<PedidoDocente>();
        try {
            String sql = "SELECT * FROM PEDIDODOCENTE";
            Statement stm = getConnection().createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            System.out.println(sql);
            while (resultado.next()) {
                PedidoDocente objpedidoDocente = new PedidoDocente();
               
                objpedidoDocente.setId(resultado.getInt("id"));
                objpedidoDocente.setIdDocente(resultado.getInt("iddocente"));
                objpedidoDocente.setIdPedido(resultado.getInt("idpedido"));
                
                objpedidoDocente.setFecha(resultado.getString("fecha"));
                objpedidoDocente.setNombre(resultado.getString("nombre"));
                objpedidoDocente.setApellido(resultado.getString("apellido"));
                objpedidoDocente.setEmpresa(resultado.getString("empresa"));
                objpedidoDocente.setTelefono(resultado.getString("telefono"));
                objpedidoDocente.setEstudio(resultado.getString("estudio"));
                objpedidoDocente.setProyecto(resultado.getString("proyecto"));
                objpedidoDocente.setControlcalidad(resultado.getString("controlcalidad"));
                objpedidoDocente.setEnsayos(resultado.getString("ensayos"));
                objpedidoDocente.setObservaciones(resultado.getString("observaciones"));

                lista.add(objpedidoDocente);
            }
            /*
            
iddocente 
idpedido VARCHAR(50),
fecha VARCHAR(50),
nombre VARCHAR(50),
apellido VARCHAR(50),
empresa VARCHAR(50),
telefono VARCHAR(50),
estudio VARCHAR(50),
proyecto VARCHAR(50),
controlcalidad VARCHAR(50),
ensayos VARCHAR(50),
observaciones VARCHAR(50),
PRIMARY KEY (id)
);*/

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al hacer la consulta");
        }
        return lista;
    }

    @Override
    public boolean registrar(PedidoDocente objpedidoDocente) {
        boolean respuesta = false;
        System.out.println("--***-- ID:" + objpedidoDocente.getId());
        PreparedStatement stm = null;        
        //-------------
        try {
            String sql = "INSERT INTO PEDIDO(id,iddocente,idpedido fecha, nombre, apellido, empresa, telefono, estudio, proyecto, controlcalidad, ensayos, observaciones) values("
                    
                    + "'" + objpedidoDocente.getIdDocente()+ "'" + ","
                    + "'" + objpedidoDocente.getIdPedido()+ "'" + ","
                    
                    + "'" + objpedidoDocente.getFecha() + "'" + ","
                    + "'" + objpedidoDocente.getNombre() + "'" + ","
                    + "'" + objpedidoDocente.getApellido() + "'" + ","
                    + "'" + objpedidoDocente.getEmpresa() + "'" + ","
                    + "'" + objpedidoDocente.getTelefono() + "'" + ","
                    + "'" + objpedidoDocente.getEstudio() + "'" + ","
                    + "'" + objpedidoDocente.getProyecto() + "'" + ","
                    + "'" + objpedidoDocente.getControlcalidad() + "'" + ","
                    + "'" + objpedidoDocente.getEnsayos() + "'" + ","
                    + "'" + objpedidoDocente.getObservaciones() + "'" + ")";
            System.out.println("**** SENTENCIA  " + sql);

            stm = getConnection().prepareStatement(sql);
            int i = stm.executeUpdate();//ejecuta la sentencia
            if (i == 1) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDocenteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion--- PedidoDocenteDAO");
        }
        //cerrarConeccion();
        //----------------
        return respuesta;
    }

}
