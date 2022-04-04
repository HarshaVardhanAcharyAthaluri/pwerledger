package com.assignment.pwerledger.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.assignment.pwerledger.models.PowerLedger;

public interface PowerLedgerRepository extends CrudRepository<PowerLedger, Integer>{

	@Query(value = "SELECT * FROM POWER_LEDGER WHERE POST_CODES BETWEEN :fromPascode AND :toPasscode",nativeQuery = true)
	public List<PowerLedger> filterSubUrbNamesBasedOnPasCodeRange(@Param("fromPascode") int frompascode,@Param("toPasscode") int toPasscode);
}
