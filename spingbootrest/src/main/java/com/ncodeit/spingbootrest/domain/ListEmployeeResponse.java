package com.ncodeit.spingbootrest.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEmployeeResponse {
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("data")
	private List<EmployeeConsumer> employeeConsumers;
	
	@JsonProperty("message")
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<EmployeeConsumer> getEmployeeConsumers() {
		return employeeConsumers;
	}

	public void setEmployeeConsumers(List<EmployeeConsumer> employeeConsumers) {
		this.employeeConsumers = employeeConsumers;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
