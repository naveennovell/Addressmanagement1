package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Address;

@Transactional
@Repository
public class AddressDaoImpl implements AddressDaoI {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public void create(Address address) {
		entitymanager.persist(address);
		
		
		
	}

	@Override
	public List<Address> retreive() {
		
			Query q=entitymanager.createQuery("from Address s");
			// TODO Auto-generated method stub
			return q.getResultList();
	}

	@Override
	public void delete(Long addressId) {
		Address address = entitymanager.find(Address.class, addressId);
		System.out.println(address.getAddressId()+" "+address.getUser().getUserId());
		entitymanager.remove(address);	
	}

	@Override
	public Address findById(Long addressId) {
		
		
		return entitymanager.find(Address.class, addressId);
	}

	@Override
	public void update(Address address,Long addressId) {
		
		Address address1 = entitymanager.find(Address.class,addressId);
		
		
			address1.setBuildingNo(address.getBuildingNo());
			address1.setCity(address.getCity());
			address1.setFeild(address.getFeild());
			address1.setState(address.getState());
			address1.setZip(address.getZip());
			
		
		
	}

}
