package cn.wqw.service.impl;

import cn.wqw.mapper.ProductMapper;
import cn.wqw.pojo.Product;
import cn.wqw.service.ProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return this.productMapper.findAll();
    }

    @Override
    public void save(Product product) {
        this.productMapper.save(product);
    }

    @Override
    public Product editById(Integer id) {
      return  this.productMapper.editById(id);
    }

    @Override
    public void deleteById(Integer id) {
        this.productMapper.deleteById(id);
    }

    @Override
    public void edit(Product product) {
        this.productMapper.edit(product);

    }
}
