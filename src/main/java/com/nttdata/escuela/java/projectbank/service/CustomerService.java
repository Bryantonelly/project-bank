package com.nttdata.escuela.java.projectbank.service;

import java.util.List;

import com.nttdata.escuela.java.projectbank.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
