package com.kpn.wip1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.wip1.entity.TieServiceProvider;

@Repository
public interface TieServiceProviderRepository extends JpaRepository<TieServiceProvider, Integer>{
/*	TieServiceProvider findByStraat(String straat);
	TieServiceProvider findByTelephoneNumber(String telephoneNumber);*/
	/*List<TieServiceProvider> findAll();
	void addWipService(TieServiceProvider tieServiceProvider);*/
	TieServiceProvider findByStatus(String status);
	TieServiceProvider findByTelephone(String telephone);
	 @Query(value ="SELECT t.* FROM TIE_WIP1_SERVICE_PROVIDER_DATA t where t.TELEPHONE_NUMBER = :telephone AND t.POSTAL_CODE = :postalCode AND t.HOUSE_NUMBER = :houseNumber", nativeQuery=true)
	TieServiceProvider findByTelephonePostalCodeHouseNumber(@Param("telephone") String telephone, @Param("postalCode") String postalCode, @Param("houseNumber") String houseNumber);
	//TieServiceProvider findByTelephoneStatus(String telephone, String status);
	
}
