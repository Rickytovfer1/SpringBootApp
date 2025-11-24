package org.example.pruebas.controladores;

import org.example.pruebas.modelos.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoControlador {


    @GetMapping("/listaProducto")
    public String listaProducto(Model model){

        List<Producto> listaProductos = new ArrayList<>();
        Producto p1 = new Producto(1, "Zapatos", 50, "Deportes");
        Producto p2 = new Producto(2, "Pan", 1.25, "Comida");
        listaProductos.add(p1);
        listaProductos.add(p2);
        model.addAttribute("listaProductos", listaProductos);
        return "productos";
    }

//    @GetMapping("/producto/{id}")
//    public String verDetalle(Model model,@PathVariable Integer id){
//        return "verdet";
//    }

}
