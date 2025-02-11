package com.trade.e_trade.model;


import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "products")  // Eğer tablo adı farklıysa burayı güncelle

@Data
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private Integer categoryId;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
