package com.nttdata.escuela.java.projectbank.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.escuela.java.projectbank.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
