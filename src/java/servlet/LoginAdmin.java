/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import clases.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.LoginAdminDAO;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "LoginAdmin", urlPatterns = {"/LoginAdmin.html"})
public class LoginAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/LoginAdmin.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Administrador objAdmin = new Administrador();
        request.setAttribute("administrador", objAdmin);
        request.getRequestDispatcher("/WEB-INF/vistas/LoginAdmin.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String us = request.getParameter("usuario");
        String cl = request.getParameter("clave");

        LoginAdminDAO objLoginAdminDao = new LoginAdminDAO();//instancia Adaptador -> las sentencias para login

        Administrador objAdmin = new Administrador();
        //objpedido.setId(id);

        objAdmin.setUsuario(us);
        objAdmin.setClave(cl);

        //enviamos objPedido a la clase adaptador para login
        Administrador objadmin = objLoginAdminDao.login(us, cl);
        System.out.println("USUARIO: " + objadmin.getUsuario());
        System.out.println("CLAVE: " + objadmin.getClave());
        String u = objadmin.getUsuario();
        String c = objadmin.getClave();

        if ((u != null) && (c != null)) {
            if (u.equals(us) && c.equals(cl)) {
                String msm = objAdmin.getCredencialesCorrectas();
                System.out.println(msm);
                getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLogin.jsp?mensaje=" + msm).forward(request, response);
            } else {
                String msm = objAdmin.getCredencialesIncorrectas();
                System.out.println(msm);
                getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginIncorrecto.jsp?mensaje=" + msm).forward(request, response);
            }
        } else {
            String msm = objAdmin.getCredencialesIncorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginIncorrecto.jsp?mensaje=" + msm).forward(request, response);
        }
        /*
        if ((u.equals(us)) & (c.equals(cl)) && ((u != null)) & (c != null)) {
            String msm = objAdmin.getCredencialesCorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLogin.jsp?mensaje=" + msm).forward(request, response);
        } else {
            String msm = objAdmin.getCredencialesIncorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginIncorrecto.jsp?mensaje=" + msm).forward(request, response);
        }
        */
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
