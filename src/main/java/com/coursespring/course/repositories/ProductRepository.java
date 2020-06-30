package com.coursespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
