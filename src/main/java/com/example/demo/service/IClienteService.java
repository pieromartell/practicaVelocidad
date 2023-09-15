package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cliente;

public interface IClienteService {
	
	List<Cliente> getAll();
	
	Optional<Cliente> findOne(int id);
	
	Cliente save(Cliente c);
	
	Cliente edit(Cliente c);
	
	Cliente Delete(Cliente c);

}
