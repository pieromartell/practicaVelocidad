package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Amortizaciones;
import com.example.demo.service.IAmortizacionService;

@RestController
@RequestMapping("/Amotizaciones")
public class AmortizacionesController {

	@Autowired
	IAmortizacionService service;
	
	
	@GetMapping("/Listar")
	public List<Amortizaciones> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/Listar/{id}")
	public Optional<Amortizaciones> getOneAmotizacion(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PostMapping("/Agregar")
	public ResponseEntity<Amortizaciones> AgregarAmotizacion(@RequestBody Amortizaciones a){
		return ResponseEntity.ok( service.save(a));
	}
	
}
