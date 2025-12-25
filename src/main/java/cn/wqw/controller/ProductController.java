package cn.wqw.controller;

import cn.wqw.pojo.Product;
import cn.wqw.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @RequestMapping("findById")
    public String findById(@RequestParam("id") Integer id,Model model){
     Product product = this.productService.editById(id);
     model.addAttribute("product",product);
     return "product-show";
    }





    @RequestMapping("edit")
public String edit(Product product){
       this.productService.edit(product);
       return "redirect:/product/findAll";
    }




@RequestMapping("deleteById")
    public String deleteById(@RequestParam("id") Integer id){
        productService.deleteById(id);
        return "redirect:/product/findAll";
    }


@RequestMapping("editById")
    public String editById(@RequestParam("id") Integer id,Model model){
    Product product = this.productService.editById(id);
    model.addAttribute("product",product);
    this.productService.editById(id);

    return "product-edit";
}



    @RequestMapping("save")
    public  String save(Product product){
        this.productService.save(product);
        return "redirect:/product/findAll";


    }


    @RequestMapping("findAll")
    public String findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                          @RequestParam(value = "size",defaultValue = "5") Integer size,
                          Model model){

        this.productService.findAll(page,size);
        List<Product> list= this.productService.findAll(page,size);
        PageInfo pageInfo= new PageInfo(list);
        model.addAttribute("pageInfo",pageInfo);
        return "product-list";


    }
}
