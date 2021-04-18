package com.sha.springbootmicroservice1product.service;

import com.sha.springbootmicroservice1product.model.Product;

import java.util.List;

/**
 * @author sa
 * @date 11.04.2021
 * @time 18:23
 */
public interface IProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
