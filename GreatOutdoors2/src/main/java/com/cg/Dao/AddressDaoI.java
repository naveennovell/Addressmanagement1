package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Address;

@Repository
public interface AddressDaoI {
	public void create(Address address);

	public List<Address> retreive();
	public Address findById(Long addressId);
	
	public void delete(Long addressId);
	public void update(Address address,Long addressId);

	

}
