package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Instrument;
import com.example.demo.repository.InstrumentRepo;

public class CreateDataImpl implements CreateData {

	@Autowired
	InstrumentRepo repo;

	@Override
	public List<Instrument> getAllInstrument() {
		return (List<Instrument>) repo.findAll();
	}

	@Override
	public Instrument getById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Instrument instrument) {
		repo.save(instrument);
	}
}
