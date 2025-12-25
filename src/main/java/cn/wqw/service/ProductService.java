package cn.wqw.service;

import cn.wqw.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll(Integer page, Integer size);

    void save(Product product);

    Product editById(Integer id);

    void deleteById(Integer id);

    void edit(Product product);
}
