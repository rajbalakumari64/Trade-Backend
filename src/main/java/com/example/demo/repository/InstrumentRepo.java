package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Instrument;

public interface InstrumentRepo extends CrudRepository<Instrument, Long> {

}
