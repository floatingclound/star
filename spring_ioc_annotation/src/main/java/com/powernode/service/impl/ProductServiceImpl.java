package com.powernode.service.impl;

import com.powernode.dao.ProductDao;
import com.powernode.pojo.Product;
import com.powernode.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    public void save(Product product) {
        productDao.save(product);
    }

    public void delete(Serializable id) {
        productDao.delete(id);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public Product query(Serializable id) {
        return productDao.query(id);
    }

    public List<Product> query() {
        return productDao.query();
    }
}
