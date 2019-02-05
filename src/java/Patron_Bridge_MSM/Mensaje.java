/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Bridge_MSM;

/**
 *
 * @author Usuario
 */
public interface Mensaje {
    public abstract String getMensajeInsertCorrecto();
    public abstract String getMensajeInsertInCorrecto();
    public abstract String getMensajeActualizadoCorrecto();
    public abstract String getMensajeActualizadoIncorrecto();
    public abstract String getMensajeEliminadoCorrecto();
    public abstract String getMensajeEliminadoIncorrecto();
    
}
