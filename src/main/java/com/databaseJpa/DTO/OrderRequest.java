package com.databaseJpa.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.databaseJpa.entity.Customer;

public class OrderRequest {

	@Autowired
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

	

	public OrderRequest() {
		super();
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	
	
	
}
