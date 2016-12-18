package com.myproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myproject.bo.Customer;

@Repository
public class RestDAOImpl implements RestDAO {

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName("shashank");
		customer.setPhoneNo("919019239");
		customer.setState("BIHAR");
		customer.setZipCode("813221");
		return customer;
	}

	@Override
	public List<Customer> getListOfCustomer() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName("shashank");
		customer.setPhoneNo("919019239");
		customer.setState("BIHAR");
		customer.setZipCode("813221");
		
		Customer customer1 = new Customer();
		customer1.setName("shekhar");
		customer1.setPhoneNo("9124219239");
		customer1.setState("BIHAR");
		customer1.setZipCode("813221");
		List<Customer> list = new ArrayList<>();
		list.add(customer1);
		list.add(customer);
		
 		return list;
	}

	@Override
	public Boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
