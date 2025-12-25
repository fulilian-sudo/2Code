package cn.wqw.mapper;

import cn.wqw.pojo.Product;

import java.util.List;


public interface ProductMapper {
    List<Product> findAll();

    void save(Product product);

    Product editById(Integer id);

    void deleteById(Integer id);

    void edit(Product product);
}
