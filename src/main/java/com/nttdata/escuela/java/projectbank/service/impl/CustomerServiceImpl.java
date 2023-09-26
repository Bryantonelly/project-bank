package com.nttdata.escuela.java.projectbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.escuela.java.projectbank.entity.Customer;
import com.nttdata.escuela.java.projectbank.repository.CustomerRepository;
import com.nttdata.escuela.java.projectbank.service.CustomerService;
import com.nttdata.escuela.java.projectbank.util.ResourceNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomer() {
	    return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long id) {
	    return customerRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));
	}

	@Override
	public Customer createCustomer(Customer cliente) {
	    return customerRepository.save(cliente);
	}

	@Override
	public Customer updateCustomer(Long id, Customer cliente) {
	    Customer customerExists = customerRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));

	    customerExists.setDocumentType(cliente.getDocumentType());
	    customerExists.setDocumentNumber(cliente.getDocumentNumber());
//	    customerExists.setCustomerType(cliente.getCustomerType());

	    return customerRepository.save(customerExists);
	}

	@Override
	public void deleteCustomer(Long id) {
	    Customer customer = customerRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id: " + id));

	    customerRepository.delete(customer);
	}

}
