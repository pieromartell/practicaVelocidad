package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Amortizaciones;

public interface IAmortizacionService {

	List<Amortizaciones> getAll();
	
	Optional<Amortizaciones> getById(int id);
	
	Amortizaciones save(Amortizaciones a);
	
}
