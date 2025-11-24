package org.example.pruebas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaControlador {

    @GetMapping("/saluda")
    public String nombre(Model model){
        model.addAttribute("nombre", "Ana");
        return "saludo";
    }
}
