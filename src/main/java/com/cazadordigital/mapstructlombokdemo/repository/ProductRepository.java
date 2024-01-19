package com.cazadordigital.mapstructlombokdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cazadordigital.mapstructlombokdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
