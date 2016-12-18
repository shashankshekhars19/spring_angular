package com.myproject.services;

import java.util.List;

import com.myproject.bo.Customer;

/**
 * @author shekhar
 *
 */
public interface RestService {
	
	/**
	 * @return 
	 */
	Customer getCustomer();
	
	/**
	 * @return
	 */
	List<Customer> getListOfCustomer();
	
	/**
	 * @param customer
	 * @return 
	 */
	Boolean addCustomer(Customer customer);

}
