package com.PetClinic.pethealth.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*Class represents pet information
/*
Create table PetInfo
id int primary key auto_increment,
name varchar(256),
gender varchar(256),
age int,
species varhcar(256), 
breed varhcar(256),
demeanor varchar(256),
ownername varchar(256)
)
*/

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer pid;
	
	String name;
	String gender;
	Integer age;
	String species;
	String breed;
	String demeanor;
	String ownername;
	
	public Pet () {
		
	}
	
	public Pet(Integer pid, String name, String gender, Integer age, String species, String breed, String demeanor,
			String ownername) {
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.species = species;
		this.breed = breed;
		this.demeanor = demeanor;
		this.ownername = ownername;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDemeanor() {
		return demeanor;
	}
	public void setDemeanor(String demeanor) {
		this.demeanor = demeanor;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "Pet [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", species=" + species
				+ ", breed=" + breed + ", demeanor=" + demeanor + ", ownername=" + ownername + "]";
	}

}
