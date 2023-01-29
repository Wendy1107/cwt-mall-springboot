package com.chenwendy.service.ipml;

import com.chenwendy.dao.ProductDao;
import com.chenwendy.dto.ProductRequest;
import com.chenwendy.model.Product;
import com.chenwendy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
