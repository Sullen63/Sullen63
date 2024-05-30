package com.PetClinic.pethealth.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PetClinic.pethealth.model.Owner;
import com.PetClinic.pethealth.model.Pet;
import com.PetClinic.pethealth.model.Response;
import com.PetClinic.pethealth.model.Scheduled;
import com.PetClinic.pethealth.model.Success;
import com.PetClinic.pethealth.model.Visit;
import com.PetClinic.pethealth.repository.OwnerRepository;
import com.PetClinic.pethealth.repository.PetRepository;
import com.PetClinic.pethealth.repository.VisitRepository;

@Controller
@RequestMapping(path = "/")
public class PetController {

	@Autowired
	PetRepository repository;
	
	@PostMapping("/register")
	public ResponseEntity<Response> registerPet(@RequestParam String name, @RequestParam String gender, @RequestParam int age, 
			@RequestParam String species, @RequestParam String breed, 
			@RequestParam String demeanor, @RequestParam String ownername) {
		
		Pet pet = new Pet(null, name, gender, age, species, breed, demeanor, ownername);
			
		System.out.println("Pet: "+pet);
		
		try {
		repository.save(pet);
		
		Response response = new Response(100, "Pet "+name+" Saved Successfully");
		
		return new ResponseEntity<Response>(response, HttpStatus.OK);
		
		}catch(Exception exception) {
			Response response = new Response(911, "Pet "+name+" Not Saved Successfully. Exception: "+exception.getMessage());
			
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
			}

	@Autowired
	OwnerRepository repos;
	
	@PostMapping("/addOwner")
	public ResponseEntity<Success> addOwner (@RequestParam String firstName, @RequestParam String lastName, @RequestParam String phone, 
			@RequestParam String email, @RequestParam String Address, 
			@RequestParam String City, @RequestParam String State, @RequestParam String Zip) {
		
		Owner owner = new Owner(null, firstName, lastName, phone, email, Address, City, State, Zip);
			
		System.out.println("Owner: "+owner);
		
		try {
		repos.save(owner);
		
		Success success = new Success(100, "Owner "+firstName+" Saved Successfully");
		
		return new ResponseEntity<Success>(success, HttpStatus.OK);
		
		}catch(Exception exception) {
			Success success = new Success(911, "Owner "+firstName+" Not Saved Successfully. Exception: "+exception.getMessage());
			
			return new ResponseEntity<Success>(success, HttpStatus.OK);
		}
			}

	@Autowired
	VisitRepository vstlog;
	
	@PostMapping("/logVisit")
	public ResponseEntity<Scheduled> logVisit (@RequestParam String date, @RequestParam String time, 
			@RequestParam String purpose, @RequestParam Pet pet, @RequestParam Owner owner) {
		
		Visit visit = new Visit(null, date, time, purpose, pet, owner);
			
		System.out.println("Visit: "+visit);
		
		try {
		vstlog.save(visit);
		
		Scheduled scheduled = new Scheduled(100, "Visit "+date+ "Time "+time+" Scheduled Successfully");
		
		return new ResponseEntity<Scheduled>(scheduled, HttpStatus.OK);
		
		}catch(Exception exception) {
			Scheduled scheduled = new Scheduled(911, "Visit "+date+ "Time "+time+" Not Scheduled Successfully. Exception: "+exception.getMessage());
			
			return new ResponseEntity<Scheduled>(scheduled, HttpStatus.OK);
		}
			}
	
	
	
}
