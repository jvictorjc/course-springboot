package com.coursespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursespring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
