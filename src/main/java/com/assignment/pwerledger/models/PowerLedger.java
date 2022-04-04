package com.assignment.pwerledger.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PowerLedger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String subUrbName;
	private Integer postCodes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubUrbName() {
		return subUrbName;
	}
	public void setSubUrbName(String subUrbName) {
		this.subUrbName = subUrbName;
	}
	public Integer getPostCodes() {
		return postCodes;
	}
	public void setPostCodes(Integer postCodes) {
		this.postCodes = postCodes;
	}

	
	
	
	
}
