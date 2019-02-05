/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import logica.PedidoDAO;
import clases.Pedido;
import interfaz.IntPedidoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "EliminarPedido", urlPatterns = {"/EliminarPedido.html"})
public class EliminarPedido extends HttpServlet {

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
        processRequest(request, response);
        
        String id = request.getParameter("id");
        System.out.println("ID DEL PEDIDO: "+id);
        Pedido objPedido = new Pedido();
        
        IntPedidoDAO objIntPedidoDAO = new PedidoDAO();
        //objIntPedidoDAO.eliminar(id);
        
        boolean respuesta = objIntPedidoDAO.eliminar(id);
        if (respuesta) {
            String msm = objPedido.getMensajeEliminadoCorrecto();
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/Respuesta.jsp?mensaje="+msm).forward(request, response);
        }else{
            String msm = objPedido.getMensajeEliminadoIncorrecto();
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/Respuesta.jsp?mensaje="+msm).forward(request, response);
        }
                
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
        processRequest(request, response);
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
