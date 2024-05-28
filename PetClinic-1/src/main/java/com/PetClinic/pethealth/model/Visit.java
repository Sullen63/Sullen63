package com.PetClinic.pethealth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Visit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer vid;
	
	String date;
	String time;
	String purpose;
	@OneToOne
	@JoinColumn(name="pid")
	Pet pet;
	@OneToOne
	@JoinColumn(name="oid")
	Owner owner;
	
public Visit () {
		
	}

	public Visit(Integer vid, String date, String time, String purpose, Pet pet, Owner owner) {
		this.vid = vid;
		this.date = date;
		this.time = time;
		this.purpose = purpose;
		this.pet = pet;
		this.owner = owner;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Visit [vid=" + vid + ", date=" + date + ", time=" + time + ", purpose=" + purpose + ", pet=" + pet
				+ ", owner=" + owner + "]";
	}


}
