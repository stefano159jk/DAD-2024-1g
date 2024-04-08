package com.example.mspedido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class PedidoDetalle {
    @Id
    @GeneratedValue
    private String detalle;
    private String Producto;
    private String fecha;
    private Integer cantidad;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}
