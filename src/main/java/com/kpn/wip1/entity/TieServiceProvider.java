package com.kpn.wip1.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="TIE_WIP1_SERVICE_PROVIDER_DATA")


public class TieServiceProvider implements Serializable{
	
	private static final long serialVersionUID = 4271920396392435337L;
	
	@Id
	@Column(name="TELEPHONE_NUMBER")
	private String telephone;
	
	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	@Column(name="HOUSE_NUMBER")
	private String houseNumber;
	
	@Column(name="CURRENT_FUTURE")
	private String currentFuture;
	
	@Column(name="HOUSE_NUMBER_ADDITION")
	private String houseNumberAddition;
	
	@Column(name="STRAAT")
	private String straat;
	
	@Column(name="RESIDENCE")
	private String residence;
	
	@Column(name="SERVICE_TYPE_TELEPHONY")
	private String serviceTypeTelephony;
	
	@Column(name="STATUS_CONNECTION")
	private String statusConnection;
	
	@Column(name="MAIN_NUMBER")
	private String mainNumber;
	
	@Column(name="BROADBAND")
	private String broadband;
	
	@Column(name="HIGH_CAPACITY")
	private String highCapacity;
	
	@Column(name="NUMBER_OF_GRID_LINES")
	private String numberOfGridLines;
	
	@Column(name="ROL")
	private String rol;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="ORDER_INFORMATION")
	private String orderInformation;
	
	/*private List<SubscriberNumber> listSubscriberNumber;
	
	public List<SubscriberNumber> getListSubscriberNumber() {
		return listSubscriberNumber;
	}
	public void setListSubscriberNumber(List<SubscriberNumber> listSubscriberNumber) {
		this.listSubscriberNumber = listSubscriberNumber;
	}*/
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCurrentFuture() {
		return currentFuture;
	}
	public void setCurrentFuture(String currentFuture) {
		this.currentFuture = currentFuture;
	}
	public String getHouseNumberAddition() {
		return houseNumberAddition;
	}
	public void setHouseNumberAddition(String houseNumberAddition) {
		this.houseNumberAddition = houseNumberAddition;
	}
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getServiceTypeTelephony() {
		return serviceTypeTelephony;
	}
	public void setServiceTypeTelephony(String serviceTypeTelephony) {
		this.serviceTypeTelephony = serviceTypeTelephony;
	}
	public String getStatusConnection() {
		return statusConnection;
	}
	public void setStatusConnection(String statusConnection) {
		this.statusConnection = statusConnection;
	}
	public String getMainNumber() {
		return mainNumber;
	}
	public void setMainNumber(String mainNumber) {
		this.mainNumber = mainNumber;
	}
	public String getBroadband() {
		return broadband;
	}
	public void setBroadband(String broadband) {
		this.broadband = broadband;
	}
	public String getHighCapacity() {
		return highCapacity;
	}
	public void setHighCapacity(String highCapacity) {
		this.highCapacity = highCapacity;
	}
	public String getNumberOfGridLines() {
		return numberOfGridLines;
	}
	public void setNumberOfGridLines(String numberOfGridLines) {
		this.numberOfGridLines = numberOfGridLines;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderInformation() {
		return orderInformation;
	}
	public void setOrderInformation(String orderInformation) {
		this.orderInformation = orderInformation;
	}
	
	public TieServiceProvider() {
		
	}
	public TieServiceProvider(String telephone, String postalCode, String houseNumber, String currentFuture,
			String houseNumberAddition, String straat, String residence, String serviceTypeTelephony,
			String statusConnection, String mainNumber, String broadband, String highCapacity, String numberOfGridLines,
			String rol, String status, String orderInformation) {
		super();
		this.telephone = telephone;
		this.postalCode = postalCode;
		this.houseNumber = houseNumber;
		this.currentFuture = currentFuture;
		this.houseNumberAddition = houseNumberAddition;
		this.straat = straat;
		this.residence = residence;
		this.serviceTypeTelephony = serviceTypeTelephony;
		this.statusConnection = statusConnection;
		this.mainNumber = mainNumber;
		this.broadband = broadband;
		this.highCapacity = highCapacity;
		this.numberOfGridLines = numberOfGridLines;
		this.rol = rol;
		this.status = status;
		this.orderInformation = orderInformation;
	}

	

	

	
	

	
	
}
