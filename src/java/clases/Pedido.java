/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Patron_Bridge_MSM.Mensaje;

/**
 *
 * @author Usuario
 */
public class Pedido  implements Mensaje{
    private int id;
    private String fecha;
    private String nombre;
    private String apellido;
    private String empresa;
    private String telefono;
    private String estudio;
    private String proyecto;
    private String controlcalidad;
    private String ensayos;
    private String observaciones;

    public Pedido() {
    }

    public Pedido(int id, String fecha, String nombre, String apellido, String empresa, String telefono, String estudio, String proyecto, String controlcalidad, String ensayos, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.telefono = telefono;
        this.estudio = estudio;
        this.proyecto = proyecto;
        this.controlcalidad = controlcalidad;
        this.ensayos = ensayos;
        this.observaciones = observaciones;
    }

    public int getId() {     
        //System.out.println("ID EN LA CLASE:"+id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getControlcalidad() {
        return controlcalidad;
    }

    public void setControlcalidad(String controlcalidad) {
        this.controlcalidad = controlcalidad;
    }

    public String getEnsayos() {
        return ensayos;
    }

    public void setEnsayos(String ensayos) {
        this.ensayos = ensayos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Override
    public String getMensajeInsertCorrecto() {
        return "El pedido se ingreso correctamente...";
    }

    @Override
    public String getMensajeInsertInCorrecto() {
        return "Error al ingresar el pedido...";
    }

    @Override
    public String getMensajeActualizadoCorrecto() {
        return "El pedido se actualizo correctamente..";
    }

    @Override
    public String getMensajeActualizadoIncorrecto() {
        return "Error al actualizar..";
    }

    @Override
    public String getMensajeEliminadoCorrecto() {
        return "El pedido se elimino correctamente..";
    }

    @Override
    public String getMensajeEliminadoIncorrecto() {
        return "Error al eliminar...";
    }
}
