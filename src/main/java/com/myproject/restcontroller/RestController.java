package com.myproject.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.bo.Customer;
import com.myproject.services.RestService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/myApplication")
public class RestController {

	@Autowired
	private RestService restService;
	
	@RequestMapping("/getCustomer")
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return restService.getCustomer();
	}

	@RequestMapping("/listCustomer")
	public List<Customer> getListOfCustomer() {
		// TODO Auto-generated method stub
		return restService.getListOfCustomer();
	}

	@RequestMapping("/addCustomet/{customer}")
	public Boolean addCustomer(@PathVariable("customer")Customer customer) {
		// TODO Auto-generated method stub
		return restService.addCustomer(customer);
	}
}

