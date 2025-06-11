/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionproductosdao;

import dao.ProductoDAO;
import dao.ProductoDAOImpl;
import entidad.Producto;
import servicio.ProductoService;

/**
 *
 * @author IDC
 */
public class GestionProductosDAO {

    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAOImpl();
        ProductoService servicio = new ProductoService(dao);

        Producto producto = new Producto(1, "Mouse gamer", 25.50);
        servicio.registrarProducto(producto);

        servicio.listarProductos();
    }
}
