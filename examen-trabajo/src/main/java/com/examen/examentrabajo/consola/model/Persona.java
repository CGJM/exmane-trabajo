package com.examen.examentrabajo.consola.model;

import lombok.*;

@AllArgsConstructor
@ToString
public class Persona {
    @Getter()
    @Setter()
    private String nombre;
    @Getter()
    @Setter()
    private int edad;
    @Getter()
    private String nss;
    @Getter()
    @Setter()
    private char sexo;
    @Getter()
    @Setter()
    private double peso;
    @Getter()
    @Setter()
    private double altura;

}
