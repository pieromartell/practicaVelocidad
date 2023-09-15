package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Prestamo;
import com.example.demo.repository.IPrestamoRepository;
import com.example.demo.service.IPrestamoService;

@RestController
@RequestMapping("/Prestamo")
public class PrestamoController {
	
	@Autowired
	IPrestamoService service;
	
	@GetMapping("/Listar")
	public List<Prestamo> ListarPrestamos(){
		List<Prestamo> pres = service.getAll();
		return pres;
	}
	
	@PostMapping("/AgregarPrestamo")
	public ResponseEntity<Prestamo> AgregarPrestamo(@RequestBody Prestamo p){
		Prestamo pre = service.save(p);
		return ResponseEntity.ok(pre);
	}

}
