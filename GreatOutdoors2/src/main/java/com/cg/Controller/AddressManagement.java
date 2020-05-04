package com.cg.Controller;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.cg.entity.Address;
import com.cg.exception.AddressNotFoundException;
import com.cg.service.AddressService;
@SuppressWarnings("unused")
@CrossOrigin(origins= "http://localhost:4200")
@RestController
public class AddressManagement {
	@Autowired
	AddressService addresservice;
	
	
	@PostMapping(value="/address/add",consumes = {"application/json"})
	public  String addAddress(@RequestBody Address address) 
	{
		addresservice.create(address);
		
		return "Address ADDED";
		
	}
	
	
	@GetMapping(value="/address")
	public List<Address> fetchAddress() throws AddressNotFoundException
	{
		List<Address> address = addresservice.retreive();
		if(address!=null)
		{
			return  addresservice.retreive();
		}
		else
		{
			throw new AddressNotFoundException("Address not found");
		}
		
	}
	
	
	@DeleteMapping(value="/address/delete/{id}")
	public String deleteAddress(@PathVariable Long id) throws AddressNotFoundException
	{
		Address address1 =  addresservice.fingById(id);
		if(address1!=null)
		{
			addresservice.delete(id);
			return "Address deleted";
		}
		else
		{
			throw new AddressNotFoundException("Id does Not exist");
		}
		
	   
	}
	
	
	@PutMapping(value="/address/update/{id}",consumes= {"application/json"})
	public String updateAddress(@PathVariable Long id,@RequestBody Address address) throws AccountNotFoundException
	{
		if(id!=null)
		{
			addresservice.update(address, id);
			return "address Updated";
		}
		else
		{
			throw new AccountNotFoundException("AddressId is required for update ");
		}
			
		
		
		
		
		
		
	}
}
