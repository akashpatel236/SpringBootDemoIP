package com.kpn.wip1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.wip1.entity.TieServiceProvider;
import com.kpn.wip1.error.TieWipExceptions;
import com.kpn.wip1.repository.TieServiceProviderRepository;

@Service
public class TieServiceProviderServiceImpl implements TieServiceProviderService{

	@Autowired
	private TieServiceProviderRepository tieServiceProviderRepository;
	
	

	
	public List<TieServiceProvider> findAll() {
		List<TieServiceProvider> wipServices= new ArrayList<>();
		tieServiceProviderRepository.findAll()
		.forEach(wipServices::add);
		return wipServices;
		
	}
	
	/*public TieServiceProvider getWipService(int number) {
		//return students.stream().filter(s -> s.getId() == id).findFirst().get();
		return tieServiceProviderRepository.findOne(number);
	}*/
	
		
	public void addWipService(TieServiceProvider tieServiceProvider) {
		tieServiceProviderRepository.save(tieServiceProvider);
		
	}
	
		
	/*@Override
	public TieServiceProvider findByStraat(String straat) {
		// TODO Auto-generated method stub
		return tieServiceProviderRepository.findByStraat(straat);
	}
	
	@Override
	public TieServiceProvider findByTelephoneNumber(String telephoneNumber) {
		// TODO Auto-generated method stub
		return tieServiceProviderRepository.findByTelephoneNumber(telephoneNumber);
	}*/

	@Override
	public TieServiceProvider findByStatus(String status) {
		return tieServiceProviderRepository.findByStatus(status);
	}

	@Override
	public TieServiceProvider findByTelephone(String telephone) {
		
		return tieServiceProviderRepository.findByTelephone(telephone);
	}

	@Override
	public TieServiceProvider findByTelephonePostalCodeHouseNumber(String telephone, String postalCode, String houseNumber) throws TieWipExceptions {
		
		TieServiceProvider tieServiceProvider = tieServiceProviderRepository.findByTelephonePostalCodeHouseNumber(telephone, postalCode, houseNumber);
		
		if(null == tieServiceProvider) {
			throw new TieWipExceptions(TieServiceProvider.class, "telephone number: "+ telephone+ " and postal code: "+postalCode+ " and house number: "+houseNumber);
		}
		return tieServiceProvider;
	}

	
	
	

}
