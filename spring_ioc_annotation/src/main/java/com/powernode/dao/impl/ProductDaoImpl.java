package com.powernode.dao.impl;

import com.powernode.dao.ProductDao;
import com.powernode.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

   @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(Product product) {
        String sql = "insert into product values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, product.getId(), product.getName(),
                product.getTid(), product.getPrice(),
                product.getNum(), product.getImgurl(),
                product.getDescription());
    }

    public void delete(Serializable id) {
        String sql = "delete from product where id=?";
        jdbcTemplate.update(sql, id);
    }

    public void update(Product product) {
        String sql = "update product set name=?,tid=?,num=?,price=?,imgurl=?,description=? where id=?";
        jdbcTemplate.update(sql, product.getName(), product.getTid(), product.getNum(),
                product.getPrice(), product.getImgurl(),
                product.getDescription(), product.getId());
    }

    public Product query(Serializable id) {
        String sql = "select * from product where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Product.class), id);
    }

    public List<Product> query() {
        String sql = "select * from product";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }
}
