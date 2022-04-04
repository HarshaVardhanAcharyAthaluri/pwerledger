package com.assignment.pwerledger.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.pwerledger.dto.PowerLedgerDto;
import com.assignment.pwerledger.models.PowerLedger;
import com.assignment.pwerledger.services.PowerLedgerService;

@RestController
public class PowerLedgerController {

	@Autowired
	PowerLedgerService service;
	
	@Autowired
	PowerLedgerDto dto;
	
	@GetMapping("/powerledgers")
	public ResponseEntity<List<PowerLedger>> poserledgersList(){
		return new ResponseEntity<List<PowerLedger>>(service.fetchAll(),HttpStatus.OK);
	}
	
	@PostMapping("/powerledger/add")
	public ResponseEntity<PowerLedger> insert(@RequestBody PowerLedger powerLedger){
		
		return new ResponseEntity<PowerLedger>(service.save(powerLedger),HttpStatus.CREATED);
	}
	
	@GetMapping("/suburbnames")
	public ResponseEntity<PowerLedgerDto> filterSubUrbNamesByPascodeRange(@RequestParam int fromPassCode,@RequestParam int toPasscode){
		List<PowerLedger> sortedPowerLegerList= service.filterSuburbNamesByPostCodeRange(fromPassCode,toPasscode);
		sortedPowerLegerList.sort(Comparator.comparing(PowerLedger::getSubUrbName));
		
		dto.setPowerLedgers(sortedPowerLegerList);
		
		int temp[] = {0};
		sortedPowerLegerList.stream().forEach(powerLedger->{
			int subUrnNamelength= powerLedger.getSubUrbName().length();
			temp[0] = temp[0] + subUrnNamelength;
			
		});
		if(temp[0]>0) {
			dto.setTotalCharactersOfsubUrbName((long) temp[0]);
		}
		return new ResponseEntity<PowerLedgerDto>(dto,HttpStatus.OK);
	}
}
