package com.myproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.myproject.bo.Customer;

@Repository
public class RestDAOImpl implements RestDAO {

	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate mysqlTemplate;

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM customer WHERE name LIKE 'shashank'";
		return mysqlTemplate.query(sql, new ResultSetExtractor<Customer>() {

			@Override
			public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Customer customer = new Customer();
					customer.setName(rs.getString("name"));
					customer.setPhoneNo(rs.getString("phoneNo"));
					customer.setZipCode(rs.getString("zipCode"));
					customer.setState(rs.getString("state"));

					return customer;
				}

				return null;
			}

		});
		/*
		 * customer.setName("shashank"); customer.setPhoneNo("919019239");
		 * customer.setState("BIHAR"); customer.setZipCode("813221"); return
		 * customer;
		 */
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
