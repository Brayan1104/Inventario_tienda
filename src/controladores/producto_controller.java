/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.Producto;

/**
 *
 * @author B09S206est
 */
public class producto_controller {
    
    
    private ArrayList<Producto> productos = new ArrayList<>();

    public boolean agregar(Producto producto){
        try {
            
            Producto newProduct = new Producto();
            
            newProduct.setId(producto.getId());
            newProduct.setNombre(producto.getNombre());
            newProduct.setPrecio(producto.getPrecio());
            newProduct.setStock(producto.getStock());
            
            boolean disponible = true;
            
            if(producto.getStock() < 1){
                disponible = false;
            }
            
            newProduct.setDisponible(disponible);
            
            productos.add(newProduct);
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }
    
    
    // 🔹 Método para devolver toda la lista (lo que necesitas)
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
    
    public boolean eliminar(String id) {
               
        // producto.getId() = id
        // producto.getId().equalsIgnoreCase(id)
        
        return productos.removeIf(producto -> producto.getId().equalsIgnoreCase(id));
    }
    
  
}
