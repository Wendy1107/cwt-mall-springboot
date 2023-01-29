package com.chenwendy.dao;

import com.chenwendy.constant.ProductCategory;
import com.chenwendy.dto.ProductRequest;
import com.chenwendy.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
