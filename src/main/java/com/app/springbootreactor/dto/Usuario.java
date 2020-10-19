package com.app.springbootreactor.dto;

import lombok.Data;

@Data
public class Usuario {

    private String nombre;
    private String apellido;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
