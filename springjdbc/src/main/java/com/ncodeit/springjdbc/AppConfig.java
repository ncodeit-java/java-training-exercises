package com.ncodeit.springjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
public class AppConfig {
	
	@Value("${database.url}")
	private String url;
	
	@Value("${database.driver}")
	private String dbDriver;
	
	@Value("${database.userId}")
	private String userId;
	
	@Value("${database.password}")
	private String password;	
    
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(dbDriver);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(userId);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }
    
    @Bean
    public JdbcTemplate getJdbcTemplate(){
    	JdbcTemplate template=new JdbcTemplate(getDataSource());
    	return template;
    }
    
    @Bean
    public NamedParameterJdbcTemplate getNamedParamaterJdbcTemplate(){
    	NamedParameterJdbcTemplate template=new NamedParameterJdbcTemplate(getDataSource());
    	return template;
    }
    
    @Bean
    public SimpleJdbcCall getSimpleJdbcCall(){
    	SimpleJdbcCall jdbcCall=new SimpleJdbcCall(getDataSource());
    	return jdbcCall;
    } 
}
