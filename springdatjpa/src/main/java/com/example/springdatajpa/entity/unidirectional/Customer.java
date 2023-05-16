package com.example.springdatajpa.entity.unidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	/*@OneToOne(cascade=CascadeType.ALL,
			fetch=FetchType.EAGER)
	@JoinColumn(name="address_id", referencedColumnName="adressId")
	private Address address;*/
	
	 /* @OneToMany(cascade=CascadeType.ALL,
				fetch=FetchType.EAGER)
	  @JoinTable(name = "Customer_address",
	          joinColumns = {@JoinColumn(name = "customerId")},
	          inverseJoinColumns = {@JoinColumn(name = "adressId")}
	  )*/
	
	@ManyToMany(cascade = {
	        CascadeType.ALL
	    })
	@JoinTable(name="Customer_address",
			joinColumns = {@JoinColumn(name = "customerId",referencedColumnName="customerId")},
			inverseJoinColumns={@JoinColumn(name = "adressId",referencedColumnName="adressId")}
			)
	private List<Address> addresses;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, List<Address> addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresses = addresses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


}
