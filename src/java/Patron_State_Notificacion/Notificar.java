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
public interface Notificar {
    void ejecutarNotificacion(String to, String sub, String msg);
    void enviandoNotificacion();
}
