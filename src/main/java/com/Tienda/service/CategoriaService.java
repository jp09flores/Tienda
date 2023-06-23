package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    // metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    public List<Categoria> getCategorias(boolean activos);
    
    
    // se obtiene una categoria x su id
    public Categoria getCategoria(Categoria categoria);
    
    
    // Insertar: Se inserta cuando el idCategoria esta vacio (valor 0 o null)
    // Modificar: Se modifica cuando el idCategoria NO esta vacio
    public void save(Categoria categoria);
    
    // se elimina un registro por su idCategoria
    public void delete(Categoria categoria);
}
