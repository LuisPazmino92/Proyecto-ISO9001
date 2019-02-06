/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Adaptador.*;
import clases.Pedido;
import interfaz.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.PedidoDAO;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ListarPedidosDocente", urlPatterns = {"/ListarPedidosDocente.html"})
public class ListarPedidosDocente extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/WEB-INF/vistas/listarproductos.jsp").forward(request,response);
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        IntPedidoDAO objIntPedidoDAO = new PedidoDAO();
        List<Pedido> lista = objIntPedidoDAO.listarTodos();
        request.setAttribute("lista", lista);
        
        request.getRequestDispatcher("/WEB-INF/vistas/ListarPedidosDocente.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
