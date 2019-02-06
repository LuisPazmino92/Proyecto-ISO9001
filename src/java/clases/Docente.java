package clases;

import Patron_Bridge_MSM.Login;

/**
 *
 * @author renzo
 */
public class Docente implements Login {

    public int idDocetne;
    public String nombreDocente;
    public String apellidoDocente;
    public String email;
    public String userDocente;
    public String passDocente;

    public Docente(int idDocetne, String nombreDocente, String apellidoDocente, String email, String userDocente, String passDocente) {
        this.idDocetne = idDocetne;
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.email = email;
        this.userDocente = userDocente;
        this.passDocente = passDocente;
    }

    public Docente() {
    }

    public int getIdDocetne() {
        return idDocetne;
    }

    public void setIdDocetne(int idDocetne) {
        this.idDocetne = idDocetne;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserDocente() {
        return userDocente;
    }

    public void setUserDocente(String userDocente) {
        this.userDocente = userDocente;
    }

    public String getPassDocente() {
        return passDocente;
    }

    public void setPassDocente(String passDocente) {
        this.passDocente = passDocente;
    }

    @Override
    public String getCredencialesCorrectas() {
        return "Mensaje Correcto";
    }

    @Override
    public String getCredencialesIncorrectas() {
               return "Error al ingresar el pedido...";
    }

}
