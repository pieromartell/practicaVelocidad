package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Amortizaciones;
import com.example.demo.repository.IAmortizacionesRepository;

@Service
public class AmortizacionesServiceImpl implements IAmortizacionService{

	@Autowired
	IAmortizacionesRepository repository;
	
	@Override
	public List<Amortizaciones> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Amortizaciones> getById(int id) {
		return repository.findById(id);
	}

	@Override
	public Amortizaciones save(Amortizaciones a) {
		return repository.save(a);
	}

}
