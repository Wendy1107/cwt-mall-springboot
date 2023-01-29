package com.chenwendy.dao;

import com.chenwendy.dto.ProductRequest;
import com.chenwendy.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
