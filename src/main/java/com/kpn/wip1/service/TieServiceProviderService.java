package com.kpn.wip1.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.kpn.wip1.entity.TieServiceProvider;
import com.kpn.wip1.error.TieWipExceptions;

public interface TieServiceProviderService {
	/*public TieServiceProvider findByStraat(String straat);
	public TieServiceProvider findByTelephoneNumber(String telephoneNumber);*/
	/*public List<TieServiceProvider> findAll();
	public void addWipService(TieServiceProvider tieServiceProvider);*/
	public TieServiceProvider findByStatus(String status);
	public TieServiceProvider findByTelephone(String telephone);
	public TieServiceProvider findByTelephonePostalCodeHouseNumber(String telephone, String postalCode, String houseNumber) throws TieWipExceptions;
}
