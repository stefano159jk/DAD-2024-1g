package com.example.mspedido.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Pedido {
    @Id
    @GeneratedValue
    private Integer id;
    private String pedido;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<PedidoDetalle> pedidoDetalle;
}
