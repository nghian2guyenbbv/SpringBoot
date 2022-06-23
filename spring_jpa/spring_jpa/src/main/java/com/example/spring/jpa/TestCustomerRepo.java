package com.example.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.customer.service.CustomerService;

import spring.demo.entity.Customer;
@Component
public class TestCustomerRepo {
 @Autowired
 private CustomerService customerService;
 Customer customer = new Customer("n", "n","n");
 public void createCustomer() {
	 customerService.createCustomer(customer);
 }
 public void deleteCustomer(int idCustomer) {
	 customerService.deleteCustomerById(idCustomer);
 }
}

