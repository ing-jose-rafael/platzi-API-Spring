package com.platzi.platzimarket.persistence.crud;

import com.platzi.platzimarket.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoCrudRepository extends JpaRepository<Producto,Integer> {
}
