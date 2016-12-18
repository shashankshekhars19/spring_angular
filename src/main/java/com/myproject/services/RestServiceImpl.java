package com.myproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.bo.Customer;
import com.myproject.dao.RestDAO;

@Service
public class RestServiceImpl implements RestService {

	@Autowired
	private RestDAO restDAO;
	
	
	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return restDAO.getCustomer();
	}

	@Override
	public List<Customer> getListOfCustomer() {
		// TODO Auto-generated method stub
		return restDAO.getListOfCustomer();
	}

	@Override
	public Boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return restDAO.addCustomer(customer);
	}

}
