/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_State_Notificacion;

/**
 *
 * @author Usuario
 */
public class Correo {
    private Notificar n;
    

    public void setEstado(Notificar e){
        this.n = e;
    }

    public void ejecutarAcción(){
        String to = "mddiaz2511@gmail.com";
        String sub = "Prueba de envio de correo";
        String msg = "Se notifica que se ingreso un nuevo pedido";
        n.ejecutarNotificacion(to, sub, msg);
    }
}
