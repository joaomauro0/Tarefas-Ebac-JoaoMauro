package com.joaomauro0controller;

import com.joaomauro0Model.Customer;
import com.joaomauro0Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customerDetails) {
        return repository.findById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            return repository.save(customer);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
