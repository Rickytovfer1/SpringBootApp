package org.example.pruebas.controladores;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.pruebas.modelos.Producto;
import org.example.pruebas.servicios.ProductoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class ProductoControlador {

    private ProductoServicio productoServicio;

    @GetMapping("/listaProducto")
    public String listaProducto(Model model){
        model.addAttribute("listaProductos", productoServicio.listaProducto());
        return "productos";
    }

    @GetMapping("/producto/{id}")
    public String verDetalle(Model model,@PathVariable Integer id){
        Producto producto = productoServicio.verProductoID(id);
        model.addAttribute("producto",producto);

        return "verDetalle";
    }

}
