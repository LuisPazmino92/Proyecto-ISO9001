/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Patron_Bridge_MSM.Login;

/**
 *
 * @author Usuario
 */
public class Administrador implements Login{
    private String nombre;
    private String apellido;
    private String usuario ;
    private String clave; 
    
    //Implementacion de Singleton
    private static Administrador instance; //unica instancia para la clase
    public static Administrador getinstance(){
        if(instance == null){
            instance = new Administrador();
        }
        return instance;
    }

    public Administrador() {
    }

    public Administrador(String nombre, String apellido, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String getCredencialesCorrectas() {
        return "User and Password Correctos";
    }

    @Override
    public String getCredencialesIncorrectas() {
        return "User and Password Incorrectos";
    }
     
}
