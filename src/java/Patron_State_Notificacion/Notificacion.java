/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_State_Notificacion;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Usuario
 */
public class Notificacion implements Notificar{
    public String user = "pazmigol92@gmail.com";
    public String pass = "1105327074";
    
    @Override
    public void ejecutarNotificacion(String to, String sub, String msg){
        // Propiedades de la conexión
        Properties props = new Properties();
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);        
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");     
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
             protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                 return new javax.mail.PasswordAuthentication("pazmigol92@gmail.com","1105327074");
             }
        }); 
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);
            Transport.send(message);
            System.out.println("Correo enviado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void enviandoNotificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
