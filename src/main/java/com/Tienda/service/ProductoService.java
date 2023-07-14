package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    // metodo para consultar las productos. El parametro define si se muestran solo las activas o todas
    public List<Producto> getProductos(boolean activos);

    // se obtiene una producto x su id
    public Producto getProducto(Producto producto);

    // Insertar: Se inserta cuando el idProducto esta vacio (valor 0 o null)
    // Modificar: Se modifica cuando el idProducto NO esta vacio
    public void save(Producto producto);

    // se elimina un registro por su idProducto
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
