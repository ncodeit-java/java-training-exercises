package com.ncodeit.springjdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.ncodeit.springjdbc.dao.CusomerDao;
import com.ncodeit.springjdbc.dao.extractors.CustomerResultsetExtractor;
import com.ncodeit.springjdbc.dao.mappers.CustomerRowMapper;
import com.ncodeit.springjdbc.domain.Customer;

@Repository
public class CustomerDaoImpl implements CusomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public void saveUser(Customer user) throws Exception {
		jdbcTemplate.update("insert into CUSTOMER(firstName,lastName,email) values(?,?,?)"
				,user.getFirstName(),user.getLastName(),user.getEmail());

	}

	@Override
	public Customer getUser(String id) throws Exception {
		String sql="select customerId,firstName,lastName,email from CUSTOMER where customerId=?";
		Customer user=jdbcTemplate.queryForObject(sql, new CustomerRowMapper(),new Object[]{id});
		return user;
	}

	@Override
	public int getTotalCount() throws Exception {
		String sql="select count(*) from CUSTOMER";
		Integer result=jdbcTemplate.queryForObject(sql, Integer.class);
		return result;
	}

	@Override
	public void deleteUser(String id) throws Exception {
		String sql="delete from CUSTOMER where customerId=?";
		int result=jdbcTemplate.update(sql, id);
		System.out.println("records deleted:"+result);
	}

	@Override
	public Customer getUserByEmail(String email) throws Exception {
		
		SqlParameterSource parameterSource=new MapSqlParameterSource().addValue("mail", email);
		
		String sql="select customerId,firstName,lastName,email from CUSTOMER where email=:mail";
		Customer user=namedParameterJdbcTemplate.queryForObject(sql,parameterSource ,new CustomerRowMapper());
		return user;
	}

	@Override
	public List<Customer> getAllUsers() throws Exception {
		String sql="select customerId,firstName,lastName,email from CUSTOMER";
		List<Customer> users=jdbcTemplate.query(sql,new CustomerResultsetExtractor());
		return users;
	}

	@Override
	public Customer getCustomerUsingSP(int id) throws Exception {
		
		SqlParameterSource inParams = new MapSqlParameterSource().addValue("custId", id);
		
		SimpleJdbcCall custSP=simpleJdbcCall.withCatalogName("springjdbc").withProcedureName("getCustomer")
				.returningResultSet("customer", new RowMapper<Customer>() {

					@Override
					public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Customer cust=new Customer();
						cust.setCustomerId(String.valueOf(rs.getInt("customerId")));
						cust.setFirstName(rs.getString("firstName"));
						cust.setLastName(rs.getString("lastName"));
						cust.setEmail(rs.getString("email"));
						return cust;
					}
				});
		
		Map<String, Object> out = custSP.execute(inParams);
		 
		List<Customer> custList = (List<Customer>) out.get("customer");
		
		return custList.get(0);
	}
	
	

}
