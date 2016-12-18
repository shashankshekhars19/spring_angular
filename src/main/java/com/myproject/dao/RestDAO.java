package com.myproject.dao;

import java.util.List;

import com.myproject.bo.Customer;

/**
 * @author shekhar
 *
 */
public interface RestDAO {

	
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
