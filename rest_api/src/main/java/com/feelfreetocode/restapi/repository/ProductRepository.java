package com.feelfreetocode.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feelfreetocode.restapi.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
