/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.*;
import interfaz.*;
import java.sql.Connection;

import adaptador.ConexionJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import clases.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PedidoDAO implements IntPedidoDAO {

    //Conexion c = new ConexionJDBC();
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
    public boolean eliminar(String id) {
        boolean respuesta = false;
        PreparedStatement stm = null;
        try {
            String sql = "delete from PEDIDO WHERE id = " + id;
            stm = getConnection().prepareStatement(sql);
            int i = stm.executeUpdate();//ejecuta la sentencia
            if (i == 1) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR AL ELIMINAR");
        }
        return respuesta;
    }

    @Override
    public boolean registrar(Pedido objpedido) {
        boolean respuesta = false;
        System.out.println("--***-- ID:" + objpedido.getId());
        PreparedStatement stm = null;        
        //-------------
        try {
            String sql = "INSERT INTO PEDIDO(fecha, nombre, apellido, empresa, telefono, estudio, proyecto, controlcalidad, ensayos, observaciones) values("
                    + "'" + objpedido.getFecha() + "'" + ","
                    + "'" + objpedido.getNombre() + "'" + ","
                    + "'" + objpedido.getApellido() + "'" + ","
                    + "'" + objpedido.getEmpresa() + "'" + ","
                    + "'" + objpedido.getTelefono() + "'" + ","
                    + "'" + objpedido.getEstudio() + "'" + ","
                    + "'" + objpedido.getProyecto() + "'" + ","
                    + "'" + objpedido.getControlcalidad() + "'" + ","
                    + "'" + objpedido.getEnsayos() + "'" + ","
                    + "'" + objpedido.getObservaciones() + "'" + ")";
            System.out.println("**** SENTENCIA  " + sql);

            stm = getConnection().prepareStatement(sql);
            int i = stm.executeUpdate();//ejecuta la sentencia
            if (i == 1) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion--- PedidoDAO");
        }
        //cerrarConeccion();
        //----------------
        return respuesta;
    }

    @Override
    public boolean actualizar(Pedido objpedido) {
        boolean respuesta = false;
        int id = objpedido.getId();
        System.out.println("--***-- ID:" + id);
        PreparedStatement stm = null;
        try { 
            String sql = "UPDATE PEDIDO SET fecha= '" + objpedido.getFecha()+"',"
                    + "nombre= '" + objpedido.getNombre() + "',"
                    + "apellido= '"+ objpedido.getApellido() + "',"
                    + "empresa= '" +  objpedido.getEmpresa() + "',"
                    + "telefono= '"+ objpedido.getTelefono() + "',"
                    + "estudio= '"+ objpedido.getEstudio() + "',"
                    + "proyecto= '"  + objpedido.getProyecto() + "',"
                    + "controlcalidad= '" + objpedido.getControlcalidad() + "',"
                    + "ensayos= '" +  objpedido.getEnsayos() + "',"
                    + "observaciones= '" + objpedido.getObservaciones()  + "' WHERE ID =" + id;
            System.out.println("SENTENCIA UPDATE: " + sql);
            stm = getConnection().prepareStatement(sql);
            int i = stm.executeUpdate();//ejecuta la sentencia
            if (i == 1) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion para ACTUALIZAR--- PedidoDAO");
        }
        return respuesta;
    }

    @Override
    public List<Pedido> listarTodos() {
        List<Pedido> lista = new ArrayList<Pedido>();
        try {
            String sql = "SELECT * FROM PEDIDO";
            Statement stm = getConnection().createStatement();
            ResultSet resultado = stm.executeQuery(sql);
            System.out.println(sql);
            while (resultado.next()) {
                Pedido objpedido = new Pedido();
                objpedido.setId(resultado.getInt("id"));
                objpedido.setFecha(resultado.getString("fecha"));
                objpedido.setNombre(resultado.getString("nombre"));
                objpedido.setApellido(resultado.getString("apellido"));
                objpedido.setEmpresa(resultado.getString("empresa"));
                objpedido.setTelefono(resultado.getString("telefono"));
                objpedido.setEstudio(resultado.getString("estudio"));
                objpedido.setProyecto(resultado.getString("proyecto"));
                objpedido.setControlcalidad(resultado.getString("controlcalidad"));
                objpedido.setEnsayos(resultado.getString("ensayos"));
                objpedido.setObservaciones(resultado.getString("observaciones"));

                lista.add(objpedido);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al hacer la consulta");
        }
        return lista;
    }

    @Override
    public Pedido leerPorId(int id) {

        Pedido objpedido = null;
        PreparedStatement stm = null;
        try {
            String sql = "SELECT id,fecha,nombre,apellido,empresa,telefono,estudio,proyecto,controlcalidad,ensayos,observaciones FROM PEDIDO WHERE ID = " + id;
            System.out.println("SQL de BUSCAR: " + sql);
            //PreparedStatement stm = getConnection().prepareStatement(sql);            
            stm = getConnection().prepareStatement(sql);//envio sentencia 
            //stm.setInt(1, id);
            ResultSet resultado = stm.executeQuery();//cargo en resultado la q debuelve d consulta
            while (resultado.next()) {
                objpedido = new Pedido();
                objpedido.setId(resultado.getInt("id"));
                objpedido.setFecha(resultado.getString("fecha"));
                objpedido.setNombre(resultado.getString("nombre"));
                objpedido.setApellido(resultado.getString("apellido"));
                objpedido.setEmpresa(resultado.getString("empresa"));
                objpedido.setTelefono(resultado.getString("telefono"));
                objpedido.setEstudio(resultado.getString("estudio"));
                objpedido.setProyecto(resultado.getString("proyecto"));
                objpedido.setControlcalidad(resultado.getString("controlcalidad"));
                objpedido.setEnsayos(resultado.getString("ensayos"));
                objpedido.setObservaciones(resultado.getString("observaciones"));

                System.out.println("FECHA: " + objpedido.getFecha());
                System.out.println("FECHA: " + objpedido.getNombre());
                System.out.println("FECHA: " + objpedido.getApellido());
                System.out.println("FECHA: " + objpedido.getTelefono());
                System.out.println("FECHA: " + objpedido.getEstudio());
                System.out.println("FECHA: " + objpedido.getProyecto());

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al buscar");
        }
        return objpedido;
    }
}
