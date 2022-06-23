package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.entity.Customer;
import spring.demo.repository.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
CustomerRepo customerRepo;
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
	}

	@Override
	public void deleteCustomerById(int custId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(custId);
	}

	@Override
	public Customer findCustomerById(int custId) {
		// TODO Auto-generated method stub
		Customer cust = null;
		Optional<Customer> opCust = customerRepo.findById(custId);
		if(opCust.isPresent()) {
			cust = opCust.get();
		}
		return cust;
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> listCust = customerRepo.findAll();
		return listCust;
	}
	
}
