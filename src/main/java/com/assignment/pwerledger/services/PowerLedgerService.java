package com.assignment.pwerledger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.pwerledger.dao.PowerLedgerRepository;
import com.assignment.pwerledger.models.PowerLedger;

@Service
public class PowerLedgerService {

	@Autowired
	PowerLedgerRepository repo;
	
	
	public List<PowerLedger> fetchAll(){
		return (List<PowerLedger>) repo.findAll();
	}
	

	public PowerLedger save(PowerLedger powerLedger) {
		powerLedger.setSubUrbName(powerLedger.getSubUrbName().toLowerCase());
		return repo.save(powerLedger);
	}
	
	public List<PowerLedger> filterSuburbNamesByPostCodeRange(int fromPasscode,int toPasscode){
		return repo.filterSubUrbNamesBasedOnPasCodeRange(fromPasscode, toPasscode);
	}
	

}
