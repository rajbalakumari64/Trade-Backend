package com.example.demo.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Instrument;

@Service
@Transactional
public interface CreateData {
	
	public List<Instrument> getAllInstrument();
	
	public Instrument getById(Long id);
	
	public void saveOrUpdate(Instrument instrument);
	
	


}
