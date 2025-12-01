package org.example.pruebas.servicios;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.pruebas.modelos.Producto;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServicio {

    private int cont_id = 3;


    private List<Producto> listaProductos = new ArrayList<>();
    public List<Producto> listaProducto(){
        Producto p1 = new Producto(1, "Zapatos", 50, "Deportes");
        Producto p2 = new Producto(2, "Pan", 1.25, "Comida");
        listaProductos.add(p1);
        listaProductos.add(p2);

        return listaProductos;
    }

    public void agregarProducto(Producto p) {
        p.setId(cont_id++);
        listaProductos.add(p);
    }

    public Producto verProductoID(Integer id){
        for (Producto p: listaProductos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
