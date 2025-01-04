package com.example.POS_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer newCustomer){
        if (customerRepository.findAll().contains(newCustomer)){
            throw new RuntimeException("Customer already exists");
        }

        return customerRepository.save(newCustomer);
    }

    @PostMapping("/{id}")
    public Customer getCustomerById(@PathVariable long id){
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer does not exist!"));

    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable long id, @RequestBody Customer updatedCustomer){
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer does not exist!"));
        customer.setName(updatedCustomer.getName());
        customer.setAddress(updatedCustomer.getAddress());
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable long id){
         customerRepository.deleteById(id);
    }


}
