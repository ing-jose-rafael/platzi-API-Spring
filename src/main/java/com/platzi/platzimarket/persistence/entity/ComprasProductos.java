package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProductos {
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
}
