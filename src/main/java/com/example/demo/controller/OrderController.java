package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import com.example.demo.dao.OrderRepository;
import com.example.demo.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private IdGenerator idGenerator;
    
	@RequestMapping("/add")
    public Object add() {
        //for (int i = 0; i < 20; i++) {
            Order order = new Order();
            Long order_id = idGenerator.generateId().longValue();
            order.setOrderId(order_id);
            order.setUserId(order_id);
            System.out.println(order_id);
            //orderRepository.save(order);
        //}
        return "success";
    }

    @RequestMapping("query")
    private Object queryAll() {
        return orderRepository.findAll();
    }
}
