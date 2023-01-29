package com.chenwendy.service;

import com.chenwendy.dto.ProductRequest;
import com.chenwendy.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
