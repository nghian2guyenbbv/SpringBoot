package spring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.demo.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
