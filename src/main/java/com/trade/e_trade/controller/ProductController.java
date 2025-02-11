package com.trade.e_trade.controller;

import com.trade.e_trade.model.Product;
import com.trade.e_trade.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getProducts(Model model){
        List<Product> products=productService.getAllProducts();
        model.addAttribute("products", products);

        // view a aktarılır. bu yüzden model nesnesine eklenir.
        return "products";
    }

    @PostMapping
    public String addProduct(@RequestParam String name){
        productService.addProduct(name);
        return "redirect:/";
    }
}
