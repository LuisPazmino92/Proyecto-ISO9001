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
@WebServlet(name = "ActualizarPedido", urlPatterns = {"/ActualizarPedido.html"})
public class ActualizarPedido extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/FormularioActualizarPedido.jsp").forward(request,response);
        
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
        int id = Integer.parseInt(request.getParameter("id"));
        
        System.out.println("ACTUALIZAR +++++ id:"+id);
        Pedido objpedido = new Pedido();
        //objpedido.setId(id);
        IntPedidoDAO objIntPedidoDAO = new PedidoDAO();
        objpedido = objIntPedidoDAO.leerPorId(id);
        /*
        if (id > 0) {
            objpedido = objIntPedidoDAO.leerPorId(id);
        }else{
            objpedido = new Pedido();          
        }  
        */
        request.setAttribute("pedido", objpedido);
        //request.setAttribute("id", id);
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/FormularioActualizarPedido.jsp").forward(request,response);
        
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
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("IIIDDDD: "+id);
        String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String estudio = request.getParameter("estudio");
        String proyecto = request.getParameter("proyecto");
        String controlcalidad = request.getParameter("controlcalidad");
        String ensayos = request.getParameter("ensayos");
        String observaciones = request.getParameter("observaciones");
        
        PedidoDAO objPedidoDao = new PedidoDAO();//instancia Adaptador -> las sentencias para  CRUD
        
        Pedido objpedido = new Pedido();
        objpedido.setId(id);
        objpedido.setFecha(fecha);
        objpedido.setNombre(nombre);
        objpedido.setApellido(apellido);
        objpedido.setEmpresa(empresa);
        objpedido.setTelefono(telefono);
        objpedido.setEstudio(estudio);
        objpedido.setProyecto(proyecto);
        objpedido.setControlcalidad(controlcalidad);
        objpedido.setEnsayos(ensayos);
        objpedido.setObservaciones(observaciones);
        
        boolean respuesta = objPedidoDao.actualizar(objpedido);//enviamos objPedido a la clase adaptador para crud
        if (respuesta) {
            String msm = objpedido.getMensajeActualizadoCorrecto();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/Respuesta.jsp?mensaje="+msm).forward(request, response);
            //getServletContext().getRequestDispatcher("/WEB-INF/vistas/Respuesta.jsp?mensaje="+msm).forward(request, response);
        }else{
            String msm = objpedido.getMensajeActualizadoIncorrecto();
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/Respuesta.jsp?mensaje="+msm).forward(request, response);
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
