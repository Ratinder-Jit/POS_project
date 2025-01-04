package com.example.POS_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        order.setOrderDate(LocalDate.now());
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable long id){
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found!"));
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable long id, @RequestBody Order updatedOrder){
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found!"));
        order.setOrderDate(updatedOrder.getOrderDate());
        order.setTotalAmount(updatedOrder.getTotalAmount());
//        order.setCustomer(updatedOrder.getCustomer());
//        order.setOrderDetails(updatedOrder.getOrderDetails());
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable long id){
        orderRepository.deleteById(id);
    }



}
