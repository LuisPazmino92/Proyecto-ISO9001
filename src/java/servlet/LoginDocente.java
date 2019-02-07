package servlet;

import clases.Docente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.LoginDocenteDAO;

/**
 *
 * @author renzo
 */
@WebServlet(name = "LoginDocente", urlPatterns = {"/LoginDocente.html"})
public class LoginDocente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/LoginDocente.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Docente objDocente = new Docente();
        request.setAttribute("docente", objDocente);
        request.getRequestDispatcher("/WEB-INF/vistas/LoginDocente.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        String userDocente = request.getParameter("usuarioDocente");
        String claveDocente = request.getParameter("claveDocente");
        
        LoginDocenteDAO objLoginDocenteDao=new LoginDocenteDAO();
        
        Docente objDocente = new Docente();
        objDocente.setUserDocente(userDocente);
        objDocente.setPassDocente(claveDocente);
        
        //enviamos objPedido a la clase adaptador para login
        Docente objdocente = objLoginDocenteDao.login(userDocente, claveDocente);
        
        System.out.println("ID DOCENTE " + objdocente.getIdDocetne());
        System.out.println("USUARIO: " + objdocente.getUserDocente());
        System.out.println("CLAVE: " + objdocente.getPassDocente());
        
        String uD = objdocente.getUserDocente();
        String cD = objdocente.getPassDocente();

        request.setAttribute("objdocente", objdocente);//envio obj docente para poder extraer el id
        
         if ((uD != null) && (cD != null)) {
            if (uD.equals(userDocente) && cD.equals(claveDocente)) {               
                String msm = objDocente.getCredencialesCorrectas();
                System.out.println(msm);
                getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginDocente.jsp?mensaje=" +msm).forward(request, response);
            } else {
                String msm = objDocente.getCredencialesIncorrectas();
                //System.out.println(msm);
                getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginIncorrecto.jsp?mensaje=" + msm).forward(request, response);
            }
        } else {
            String msm = objDocente.getCredencialesIncorrectas();
            System.out.println(msm);
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/RespuestaLoginIncorrecto.jsp?mensaje=" + msm).forward(request, response);
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
