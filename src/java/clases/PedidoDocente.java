package clases;

import Patron_Bridge_MSM.Login;

/**
 *
 * @author renzo
 */
public class PedidoDocente implements Login {
    private int id;
    private int idDocente;
    private int idPedido;
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

    public PedidoDocente(int id, int idDocente, int idPedido, String fecha, String nombre, String apellido, String empresa, String telefono, String estudio, String proyecto, String controlcalidad, String ensayos, String observaciones) {
        this.id = id;
        this.idDocente = idDocente;
        this.idPedido = idPedido;
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

    public PedidoDocente() {
    }

    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    ////
    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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
    public String getCredencialesCorrectas() {
        return "Pedido se ingreso Correctamente";
    }

    @Override
    public String getCredencialesIncorrectas() {
       return "Pedido No se ingreso ";
    }
    

}
