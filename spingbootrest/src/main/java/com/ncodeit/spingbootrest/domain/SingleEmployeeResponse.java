package com.ncodeit.spingbootrest.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleEmployeeResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("message")
	private String message;	
	
	@JsonProperty("data")
	private EmployeeConsumer employeeConsumers;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeConsumer getEmployeeConsumers() {
		return employeeConsumers;
	}

	public void setEmployeeConsumers(EmployeeConsumer employeeConsumers) {
		this.employeeConsumers = employeeConsumers;
	}

}
