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
        Pedido objPedido = new Pedido();
        request.setAttribute("pedido", objPedido);

        request.getRequestDispatcher("/WEB-INF/vistas/ListarPedidosDocente.jsp").forward(request, response);
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
        //////
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
