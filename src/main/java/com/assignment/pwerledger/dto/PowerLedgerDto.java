package com.assignment.pwerledger.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.assignment.pwerledger.models.PowerLedger;

@Component
public class PowerLedgerDto {

	private List<PowerLedger> powerLedgers;
	
	private Long totalCharactersOfsubUrbName ;
	
	
	public List<PowerLedger> getPowerLedgers() {
		return powerLedgers;
	}
	public void setPowerLedgers(List<PowerLedger> powerLedgers) {
		this.powerLedgers = powerLedgers;
	}
	public Long getTotalCharactersOfsubUrbName() {
		return totalCharactersOfsubUrbName;
	}
	public void setTotalCharactersOfsubUrbName(Long totalCharactersOfsubUrbName) {
		this.totalCharactersOfsubUrbName = totalCharactersOfsubUrbName;
	}

	
	
}
