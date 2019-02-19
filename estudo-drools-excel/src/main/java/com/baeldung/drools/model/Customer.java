package com.baeldung.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private CustomerType type;

	private int years;

	private int discount;

	public Customer() {
	}

	public enum CustomerType {
		INDIVIDUAL, BUSINESS;
	}

}
