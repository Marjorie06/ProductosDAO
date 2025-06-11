/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dao.ProductoDAO;
import entidad.Producto;
import java.util.List;

/**
 *
 * @author IDC
 */
public class ProductoService {

    private ProductoDAO productoDAO;

    public ProductoService(ProductoDAO dao) {
        this.productoDAO = dao;
    }

    public void registrarProducto(Producto p) {
        productoDAO.guardar(p);
    }

    public void listarProductos() {
        List<Producto> productos = productoDAO.obtenerTodos();
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }
    }
}
