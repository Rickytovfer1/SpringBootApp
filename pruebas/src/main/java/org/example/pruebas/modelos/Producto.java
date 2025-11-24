package org.example.pruebas.modelos;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Integer id;

    private String nombre;

    private double precio;

    private String categoria;

}
