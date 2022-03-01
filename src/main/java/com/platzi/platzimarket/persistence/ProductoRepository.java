package com.platzi.platzimarket.persistence;

import com.platzi.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.platzimarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository  {
    private  ProductoCrudRepository productoCrudRepository;

    public List<Producto> getProductos(){
        return productoCrudRepository.findAll();
    }
}
