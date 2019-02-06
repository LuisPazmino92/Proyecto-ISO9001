package servlet;

import clases.Pedido;
import clases.PedidoDocente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author renzo
 */
@WebServlet(name = "AgregarPedidoDocente", urlPatterns = {"/AgregarPedidoDocente.html"})
public class AgregarPedidoDocente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/ListarPedidosDocente.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
       int id = Integer.parseInt(request.getParameter("id"));
        
        
       // System.out.println("Get id;" + id);
        Pedido objpedido = new Pedido();
        objpedido.setId(id);
        //request.setAttribute("id", id);
        request.setAttribute("pedidoDocente", objpedido);
        //request.getRequestDispatcher("/WEB-INF/vistas/ListarPedidosDocente.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Pedido p= new Pedido();
        int idd = p.getId();
        //int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("iddd/"+idd);
        
        PedidoDocente objpedidodocente = new PedidoDocente();
        //objpedido.getId();
        System.out.println("idpost"+objpedidodocente.getId());
        /*String idDocente = request.getParameter("idDocente");
        /*Pedido*/
 /*String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String estudio = request.getParameter("estudio");
        String proyecto = request.getParameter("proyecto");
        String controlcalidad = request.getParameter("controlcalidad");
        String observaciones = request.getParameter("observaciones");*/


 /*PedidoDAO objPedidoDao = new PedidoDAO();//instancia Adaptador -> las sentencias para  CRUD

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
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaCliente.jsp?mensaje=" + msm).forward(request, response);
        } else {
            String msm = objpedido.getMensajeInsertInCorrecto();
            //System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaCliente.jsp?mensaje=" + msm).forward(request, response);
        }*/
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
