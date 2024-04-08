package com.example.mscatalogo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private String celular;
    private String codigo;
    private String detalle;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
