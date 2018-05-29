package com.kpn.wip1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kpn.wip1.entity.TieServiceProvider;
import com.kpn.wip1.error.TieWipExceptions;
import com.kpn.wip1.service.TieServiceProviderService;
import com.kpn.wip1.service.TieServiceProviderServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/kpn-wholesale")
@Api(value="TieServiceProvider micro services", description="Operations pertaining TieServiceProvider Data ")
public class TieServiceController {

	@Autowired
	private TieServiceProviderServiceImpl tieServiceProviderServiceImpl;
	
	/*@Autowired
	private TieSubscriberNumberServiceImpl tieSubscriberNumberServiceImpl;
	*/
	@RequestMapping(value="/")
    public String showMainPage(){
        return "index";
    }
	
	@ApiOperation(value = "To know whether microservices is up and running or not")
	@RequestMapping(value="/ping", method = RequestMethod.GET)
    public void showApplicationStatus(){
        
		System.out.println("WIP1 Service is UP and Running!!");
		//return true;
		//return "Yes!!! TieServiceProvider micro service is up and running you can send your request";
    }
	
	@ApiOperation(value = "Return result for all excuted services")
	@RequestMapping(value="/wipservices")
	public List<TieServiceProvider> getWipServices() {
		
		return tieServiceProviderServiceImpl.findAll();
	}
	
	@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/telephone/{telephone}")
	public TieServiceProvider getTelephone_Number(@PathVariable String telephone) {
		return tieServiceProviderServiceImpl.findByTelephone(telephone);
	}
	
	@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/telephonepostal/{telephone}/{postalCode}/{houseNumber}")
	public TieServiceProvider getAllData(@PathVariable String telephone, @PathVariable String postalCode, @PathVariable String houseNumber) throws TieWipExceptions{
		return tieServiceProviderServiceImpl.findByTelephonePostalCodeHouseNumber(telephone, postalCode, houseNumber);
	}
	
		
	@ApiOperation(value = "Return result for service")
	@RequestMapping(value="/wipservices/wip1/{telephone}/{postalCode}/{houseNumber}",method=RequestMethod.GET)
	public TieServiceProvider getWip1Response(@PathVariable String telephone, @PathVariable String postalCode, @PathVariable String houseNumber) throws TieWipExceptions{
		TieServiceProvider objTieServiceProvider = new TieServiceProvider(telephone, postalCode, houseNumber, "Future",
				"1", "SOGLAAN", "SOGPLAATS", "Enkelvoudig PSTN (EP)",
				"Linesharing order", telephone, "Breedband aanwezig", "Nee", "00000",
				"T", "1", "OK");
		
		tieServiceProviderServiceImpl.addWipService(objTieServiceProvider);
		return tieServiceProviderServiceImpl.findByTelephonePostalCodeHouseNumber(telephone, postalCode, houseNumber);
	}
	
	/*@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/wipquery/{telephone}")
	public TieServiceProvider getWipquery(@PathVariable String telephone) throws TieWipExceptions{
		String query = "SELECT t.* FROM TIE_WIP1_SERVICE_PROVIDER_DATA t";
		return tieServiceProviderServiceImpl.findByAll(query);
	}*/
	
	/*@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/{strat}")
	public TieServiceProvider getWip(@PathVariable String strat) {
		return tieServiceProviderServiceImpl.findByStraat(strat);
	}*/
	
	@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/status/{status}")
	public TieServiceProvider getWip(@PathVariable String status) {
		return tieServiceProviderServiceImpl.findByStatus(status);
	}
	
	/*@ApiOperation(value = "Return result for service")
	@RequestMapping("/wipservices/{telephoneNumber}")
	public TieServiceProvider getWip(@PathVariable String telephoneNumber) {
		return tieServiceProviderServiceImpl.findByTelephoneNumber(telephoneNumber);
	}*/
	
	@ApiOperation(value = "Add WIP service")
	@RequestMapping(value="/wipservices", method=RequestMethod.POST)
	public void addWipService(@RequestBody TieServiceProvider tieServiceProvider) {
		
		 tieServiceProviderServiceImpl.addWipService(tieServiceProvider);
	}
	
	/*@ApiOperation(value = "Add Subscriber Number")
	@RequestMapping(value="/subscriber", method=RequestMethod.POST)
	public void addSubscriberNumber(@RequestBody SubscriberNumber subscriberNumber) {
		
		tieSubscriberNumberServiceImpl.addSubscriberNumber(subscriberNumber);
	}
	
	@ApiOperation(value = "Return result for all excuted services")
	@RequestMapping(value="/subscriber")
	public List<SubscriberNumber> getSubscriberNumbers() {
		
		return tieSubscriberNumberServiceImpl.getSubscriberNumbers();
	}*/
}
