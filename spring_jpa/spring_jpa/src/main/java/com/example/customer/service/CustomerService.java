package com.example.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.demo.entity.Customer;

public interface CustomerService {
 public void createCustomer(Customer customer) ;
 
 public void updateCustomer(Customer customer);
 
 public void deleteCustomerById(int custId);
 
 public Customer findCustomerById(int custId);
 
 public List<Customer> findAllCustomer();
 
}
