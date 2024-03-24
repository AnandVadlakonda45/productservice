package com.scaler.productservice.repositories;

import com.scaler.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {

    List<Product>findByTitleContaining(String word);
    long deleteByTitleIgnoreCase(String title);
    List<Product>findByTitleAndDescription(String title ,String Description);


}
