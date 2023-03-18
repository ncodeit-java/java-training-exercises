package com.example.springdatjpa.entity.oneToOne.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int passportId;
	
	@Column(name="Passport_Number")
	private String passportNumber;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="citizen_id",referencedColumnName="citizenId")
	private Citizen citizen;
	
	public Passport() {
		super();
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	
}
