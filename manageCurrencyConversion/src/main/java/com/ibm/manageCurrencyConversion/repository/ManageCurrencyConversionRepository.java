package com.ibm.manageCurrencyConversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibm.manageCurrencyConversion.entity.ManageCurrencyConversion;


@Repository
public interface ManageCurrencyConversionRepository extends JpaRepository<ManageCurrencyConversion, Long> {

	//@Query(value = "FROM ManageCurrencyConversion m where m.countryCode = :1")
	@Query("select m from ManageCurrencyConversion m where m.countryCode = ?1")
	ManageCurrencyConversion findByCountryCode(@Param("countryCode") String countryCode);
	
}