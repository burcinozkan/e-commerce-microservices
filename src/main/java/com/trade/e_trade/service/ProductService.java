package com.trade.e_trade.service;

import com.trade.e_trade.model.Product;
import com.trade.e_trade.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        System.out.println(productRepository.findAll());  // Verilerin doğru çekilip çekilmediğini kontrol et
        return productRepository.findAll();
    }
    public void addProduct(String name){
        Product product=new Product();
        product.setName(name);
        product.setCreatedAt(LocalDate.now());
        productRepository.save(product);
        System.out.println(product.getName());
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
    @RestController
    @RequestMapping("/api/products")
    public class ProductController {

        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }
    }


}
