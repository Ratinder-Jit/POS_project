//package com.example.POS_System;
//
//import jakarta.persistence.GeneratedValue;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/orderItem")
//public class OrderItemController {
//
//    @Autowired
//    private OrderItemRepository orderItemRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//
//
////new method, not sure if it is functioning properly or not
//    @PostMapping
//    public OrderItem addOrderItem(@RequestBody OrderItem orderItem){
//        // Fetch the associated Product
//        Product product = productRepository.findById(orderItem.getProduct().getProductId())
//                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + orderItem.getProduct().getProductId()));
//
//        // Fetch the associated Order
//        Order order = orderRepository.findById(orderItem.getOrder().getOrderId())
//                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + orderItem.getOrder().getOrderId()));
//
//        orderItem.setProduct(product);
//        orderItem.setOrder(order);
//        return orderItemRepository.save(orderItem);
//    }
//
//    //the old method, not trying a new method
////    @PostMapping
////    public OrderItem addOrderItem(@RequestBody OrderItem orderItem){
////        return orderItemRepository.save(orderItem);
////    }
//
//    @GetMapping
//    public List<OrderItem> getAllOrderItems(){
//        return orderItemRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public OrderItem getOrderItemById(@PathVariable long id){
//        return orderItemRepository.findById(id).orElseThrow(() -> new RuntimeException("OrderItem not found!"));
//    }
//
//    @PutMapping("/{id}")
//    public OrderItem updateOrderItem(@PathVariable long id, @RequestBody OrderItem updatedOrderItem){
//        OrderItem orderItem = orderItemRepository.findById(id).orElseThrow(() -> new RuntimeException("OrderItem not found!"));
//        orderItem.setQuantity(updatedOrderItem.getQuantity());
//        orderItem.setPrice(updatedOrderItem.getPrice());
//        orderItem.setOrder(updatedOrderItem.getOrder());
//        orderItem.setProduct(updatedOrderItem.getProduct());
//        return orderItemRepository.save(orderItem);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteOrderItem(@PathVariable long id){
//        orderItemRepository.deleteById(id);
//    }
//
//}
