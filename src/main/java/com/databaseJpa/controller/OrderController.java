package com.databaseJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.databaseJpa.DTO.OrderRequest;
import com.databaseJpa.DTO.OrderResponse;
import com.databaseJpa.entity.Customer;
import com.databaseJpa.repository.CustomerRepository;
import com.databaseJpa.repository.ProductRepository;

@RestController
@RequestMapping("/v1")
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@PostMapping("/placeOrder")
	private Customer placeOrder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getCustomer());
	}
	
	/*@PostMapping("/saveCustomers")
	private List<Customer> saveCustomers(@RequestBody List<Customer> customers)
	{
		return customerRepository.saveAll(customers);
	}*/
	
	/*@GetMapping("/getCustomer")
	private Customer getCustomer(int id)
	{
		return customerRepository.findById(id).orElse(null);
	}
	*/
	@GetMapping("/findCustomers")
	private List<Customer> findCustomers()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	private List<OrderResponse> getJoinInformation()
	{
		return customerRepository.getJoinInformation();	
	}
	
	
	
	
	
	
	
	
	
}
