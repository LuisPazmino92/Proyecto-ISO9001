/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import clases.Pedido;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "PedidosCliente", urlPatterns = {"/PedidosCliente.html"})
public class PedidosCliente extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/FormularioPedido.jsp").forward(request,response);
        
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
        Pedido objpedido = new Pedido();
        request.setAttribute("pedido", objpedido);
        request.getRequestDispatcher("/WEB-INF/vistas/FormularioPedido.jsp").forward(request,response);
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
                
        String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String estudio = request.getParameter("estudio");
        String proyecto = request.getParameter("proyecto");
        String controlcalidad = request.getParameter("controlcalidad");
        String observaciones = request.getParameter("observaciones");
        
        PedidoDAO objPedidoDao = new PedidoDAO();//instancia Adaptador -> las sentencias para  CRUD
        
        Pedido objpedido = new Pedido();
        //objpedido.setId(id);
        objpedido.setFecha(fecha);
        objpedido.setNombre(nombre);
        objpedido.setApellido(apellido);
        objpedido.setEmpresa(empresa);
        objpedido.setTelefono(telefono);
        objpedido.setEstudio(estudio);
        objpedido.setProyecto(proyecto);
        objpedido.setControlcalidad(controlcalidad);
        objpedido.setObservaciones(observaciones);
        
        boolean respuesta = objPedidoDao.registrar(objpedido);//enviamos objPedido a la clase adaptador para crud
        
        if (respuesta) {
            String msm = objpedido.getMensajeInsertCorrecto();
            //System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaCliente.jsp?mensaje="+msm).forward(request, response);
        }else{
            String msm = objpedido.getMensajeInsertInCorrecto();
            //System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaCliente.jsp?mensaje="+msm).forward(request, response);
        }
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
