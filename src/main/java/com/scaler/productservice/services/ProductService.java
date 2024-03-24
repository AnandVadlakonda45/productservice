package com.scaler.productservice.services;

import com.scaler.productservice.exceptions.ProductNotExistsException;
import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id) throws ProductNotExistsException;
    List<Product> getAllProducts();
    Product replaceProduct(Long id, Product product);
    Product updateProduct(Long id, Product product);

    Product addNewProduct(Product product);
}
