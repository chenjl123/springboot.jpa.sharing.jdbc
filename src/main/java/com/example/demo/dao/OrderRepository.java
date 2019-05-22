package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
