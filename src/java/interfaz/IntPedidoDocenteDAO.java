package interfaz;


import clases.PedidoDocente;
import java.util.List;

/**
 *
 * @author Renzo
 */
public interface IntPedidoDocenteDAO {
    List<PedidoDocente> listarTodos();
    //Pedido leerPorId(int id);
    boolean registrar(PedidoDocente objpedidoDocente);
    //boolean actualizar(Pedido objpediod);
    //boolean eliminar(String id);
}
