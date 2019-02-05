/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Pedido;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IntPedidoDAO {
    List<Pedido> listarTodos();
    Pedido leerPorId(int id);
    boolean registrar(Pedido objpedido);
    boolean actualizar(Pedido objpediod);
    boolean eliminar(String id);
}
