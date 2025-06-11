/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidad.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IDC
 */
public class ProductoDAOImpl implements ProductoDAO {

    private List<Producto> productos = new ArrayList<>();

    @Override
    public void guardar(Producto p) {
        productos.add(p);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return productos;
    }

}
