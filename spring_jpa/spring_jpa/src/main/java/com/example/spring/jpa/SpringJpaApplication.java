package com.example.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.*")
@EnableJpaRepositories("spring.demo.repository")
@EntityScan("spring.demo.entity")
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		TestCustomerRepo repo =  context.getBean(TestCustomerRepo.class);
		repo.createCustomer();
		repo.createCustomer();
		repo.createCustomer();
		repo.createCustomer();
		repo.deleteCustomer(3);
	}

}
