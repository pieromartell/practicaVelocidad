package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	IClienteRepository repository;
	
	@Override
	public List<Cliente> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Cliente> findOne(int id) {
		return repository.findById(id);
	}

	@Override
	public Cliente save(Cliente c) {
		if(c == null) {
			throw new IllegalArgumentException("Cliente no puede ser null");
		}
		return repository.save(c);
	}

	@Override
	public Cliente edit(Cliente c) {
		Cliente obj = repository.getById(c.getDniCliente());
		BeanUtils.copyProperties(c, obj);
		return repository.save(obj);
	}

	@Override
	public Cliente Delete(Cliente c) {
		Cliente obj = repository.getById(c.getDniCliente());
		obj.setEstado(false);
		return repository.save(obj);
	}

}
