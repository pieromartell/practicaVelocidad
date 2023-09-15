package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Prestamo;
import com.example.demo.repository.IPrestamoRepository;
@Service
public class PrestamoServiceImpl implements IPrestamoService{

	@Autowired
	IPrestamoRepository repository;
	
	@Override
	public List<Prestamo> getAll() {
		return repository.findAll();
	}

	@Override
	public Prestamo save(Prestamo p) {
		return repository.save(p);
	}

}
