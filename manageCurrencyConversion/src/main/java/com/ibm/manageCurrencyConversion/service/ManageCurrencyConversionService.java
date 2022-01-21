package com.ibm.manageCurrencyConversion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ibm.manageCurrencyConversion.entity.ManageCurrencyConversion;
import com.ibm.manageCurrencyConversion.repository.ManageCurrencyConversionRepository;

public class ManageCurrencyConversionService implements ManageCurrencyConversionRepository {

	@Autowired
	private ManageCurrencyConversionRepository manageCurrencyConversionRepository;
	
	@Override
	public ManageCurrencyConversion findByCountryCode(String countryCode) {
        return manageCurrencyConversionRepository.findByCountryCode(countryCode);
    }

	@Override
	public List<ManageCurrencyConversion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManageCurrencyConversion> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManageCurrencyConversion> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends ManageCurrencyConversion> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<ManageCurrencyConversion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ManageCurrencyConversion getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageCurrencyConversion getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ManageCurrencyConversion> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ManageCurrencyConversion> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ManageCurrencyConversion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ManageCurrencyConversion> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends ManageCurrencyConversion> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ManageCurrencyConversion> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends ManageCurrencyConversion> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}	
}
