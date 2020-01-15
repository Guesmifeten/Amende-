package com.example.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)

public class User {
    public User() {
		super();
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotBlank
    private String fname;

    @NotBlank
    private String lname;
    
    private String address;
    
    private String country;

    private String city;
    
    private String cin;
    
    private String SérieCar;
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getSérieCar() {
		return SérieCar;
	}


	public void setSérieCar(String sérieCar) {
		SérieCar = sérieCar;
	}


	public String getAmende() {
		return amende;
	}


	public void setAmende(String amende) {
		this.amende = amende;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public User(Long id, @NotBlank String fname, @NotBlank String lname, String address, String country, String city,
			String cin, String sérieCar, String amende, Date createdAt) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.country = country;
		this.city = city;
		this.cin = cin;
		SérieCar = sérieCar;
		this.amende = amende;
		this.createdAt = createdAt;
	}


	private String amende;
    
  
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    

}
