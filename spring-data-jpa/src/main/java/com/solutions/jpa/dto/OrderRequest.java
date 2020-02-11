package com.solutions.jpa.dto;

import com.solutions.jpa.entity.Customer;


public class OrderRequest {

	private Customer customer;

	public OrderRequest() {
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	
	

}
