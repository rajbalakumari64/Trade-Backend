package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Instrument;
import com.example.demo.service.CreateData;
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class InstrumentController {

	@Autowired(required=true)
	private CreateData data;
	
	@PostMapping("/save")
	public Instrument save(@RequestBody Instrument instrument) {
		data.saveOrUpdate(instrument);
		return instrument;
	}
	
	@GetMapping("/show")
	public List<Instrument> showData() {
		return data.getAllInstrument();
	}
}
