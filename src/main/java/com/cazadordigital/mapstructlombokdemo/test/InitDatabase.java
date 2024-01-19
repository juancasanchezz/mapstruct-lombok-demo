package com.cazadordigital.mapstructlombokdemo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cazadordigital.mapstructlombokdemo.entity.Product;
import com.cazadordigital.mapstructlombokdemo.repository.ProductRepository;

@Configuration
public class InitDatabase {

  @Autowired
  private ProductRepository productRepository;

  @Bean
  public CommandLineRunner testProductMapperCommand() {
    return args -> {
      List<Product> products = productRepository.findAll();

      System.out.println("PRODUCTS");
      products.forEach(System.out::println);
    };
  }

}
