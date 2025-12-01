package org.example.pruebas.modelos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Integer id;

    @NotBlank
    private String nombre;

    @Positive
    private double precio;

    private String categoria;

}
