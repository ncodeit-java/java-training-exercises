package com.ncodeit.springjdbc.dao.extractors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ncodeit.springjdbc.domain.Customer;

public class CustomerResultsetExtractor implements ResultSetExtractor<List<Customer>> {

	@Override
	public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Customer> users=new ArrayList<>();
		while(rs.next()){
			Customer user=new Customer();
			user.setCustomerId(rs.getString("customerId"));
			user.setFirstName(rs.getString("firstName"));
			user.setLastName(rs.getString("lastName"));
			user.setEmail(rs.getString("email"));
			users.add(user);
		}
		return users;
	}

}
