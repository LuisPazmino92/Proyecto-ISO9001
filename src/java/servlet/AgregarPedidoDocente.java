package servlet;

import clases.Docente;
import clases.Pedido;
import clases.PedidoDocente;
import interfaz.IntPedidoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logica.LoginDocenteDAO;

import logica.PedidoDAO;
import logica.PedidoDocenteDAO;

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
        int id = Integer.parseInt(request.getParameter("idPedido"));  
        System.out.println("id Pedido: "+id);
        
        int id2 = Integer.parseInt(request.getParameter("idDocente"));  
        System.out.println("id Docente: "+id2);
        
        PedidoDAO objPedidoDAO = new PedidoDAO();
        
        Pedido objPedido = new Pedido();
        objPedido = objPedidoDAO.leerPorId(id);//obj pedido se asigna la consulta    
        //variables q se almacenaran en PedidoDocenteDAO
        String fecha = objPedido.getFecha();
        String nombre = objPedido.getNombre();
        String apellido = objPedido.getApellido();
        String empresa = objPedido.getApellido();
        String telefono = objPedido.getTelefono();
        String estudio = objPedido.getEstudio();
        String proyecto = objPedido.getProyecto();
        String controlcalidad = objPedido.getControlcalidad();
        String observaciones = objPedido.getObservaciones();
        System.out.println("AGREGAR PEDIDO DOCENTE idPedido: "+id);
        System.out.println("AGREGAR PEDIDO DOCENTE idDocente: "+id2);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+fecha);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+nombre);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+apellido);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+empresa);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+telefono);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+estudio);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+proyecto);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+controlcalidad);
        System.out.println("AGREGAR PEDIDO DOCENTE: "+observaciones);
        
        //------------------------------------------------------------------
        //ENVIA LOS RESULTADOS DE LA CONSULTA AL INSRT DE PEDIDO CLIENTE DAO
        PedidoDocenteDAO objPedidoDocenteDAO = new PedidoDocenteDAO();
        PedidoDocente objPedidoDocente = new PedidoDocente();
        objPedidoDocente.setIdDocente(id2);
        objPedidoDocente.setIdPedido(id);
        objPedidoDocente.setFecha(fecha);
        objPedidoDocente.setNombre(nombre);
        objPedidoDocente.setApellido(apellido);
        objPedidoDocente.setEmpresa(empresa);
        objPedidoDocente.setTelefono(telefono);
        objPedidoDocente.setEstudio(estudio);
        objPedidoDocente.setProyecto(proyecto);
        objPedidoDocente.setControlcalidad(controlcalidad);
        objPedidoDocente.setObservaciones(observaciones);
        
        boolean respuesta = objPedidoDocenteDAO.registrar(objPedidoDocente);
        
        if (respuesta) {
            String msm = objPedidoDocente.getCredencialesCorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaPedidoDocente.jsp?mensaje="+msm).forward(request, response);
        }else{
            String msm = objPedidoDocente.getCredencialesIncorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaPedidoDocente.jsp?mensaje="+msm).forward(request, response);
        }
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        //////
        String userDocente = request.getParameter("usuarioDocente");
        String claveDocente = request.getParameter("claveDocente");
        String fechapedido = request.getParameter("fecha");

        //PedidoDocenteDAO objPedidoDoceteDao = new PedidoDocenteDAO();
        PedidoDAO objPedidoDao = new PedidoDAO();
        LoginDocenteDAO objLoginDocenteDao = new LoginDocenteDAO();

        Docente objDocente = new Docente();

        Pedido objPedido = new Pedido();

        objDocente.setUserDocente(userDocente);
        objDocente.setPassDocente(claveDocente);

        IntPedidoDAO objIntPedidoDAO = new PedidoDAO();
        List<Pedido> lista = objIntPedidoDAO.listarTodos();
       System.out.println("Empresa: " + objPedido.getEmpresa());
        
        //String uD = objdocente.getUserDocente();
        //String cD = objdocente.getPassDocente();

        //int id = (int) request.getAttribute("idd");
        
        int id = Integer.parseInt(request.getParameter("idd"));
        System.out.println("id DO POST: "+id);
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/ListarPedidosDocente.jsp?").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
