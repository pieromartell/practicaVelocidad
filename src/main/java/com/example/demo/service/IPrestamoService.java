package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Prestamo;

public interface IPrestamoService {

	List<Prestamo> getAll();
	
	Prestamo save(Prestamo p);
	
}
