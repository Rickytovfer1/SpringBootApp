package org.example.pruebas.controladores;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.pruebas.modelos.Producto;
import org.example.pruebas.servicios.ProductoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/formulario")
    public String formulario(Model model){
        Producto p = new Producto();
        model.addAttribute("producto",p);

        return "formulario";
    }

    @PostMapping("/formulario")
    public String obtenerFormulario(@Valid @ModelAttribute("producto") Producto producto,
                                    BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formulario";
        }
        productoServicio.agregarProducto(producto);
        model.addAttribute("listaProductos", productoServicio.listaProducto());

        return "productos";
    }


}
