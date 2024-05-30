package com.PetClinic.pethealth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/*Class represents Owner information
/*
Create table Owner
id int primary key auto_increment,
firstname varchar(256),
lastname varchar(256),
phone varchar(11),
address varchar(256),
city varchar(256),
state varchar(2),
zip varchar(5)
)
*/


@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer oid;
	
	String firstName;
	String lastName;
	String phone;
	String email;
	String Address;
	String City;
	String State;
	String Zip;
	
public Owner () {
		
	}
	
	public Owner(Integer oid, String firstName, String lastName, String phone, String email, String address,
			String city, String state, String zip) {
		this.oid = oid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	@Override
	public String toString() {
		return "Owner [oid=" + oid + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", Address=" + Address + ", City=" + City + ", State=" + State + ", Zip=" + Zip
				+ "]";
	}

}
