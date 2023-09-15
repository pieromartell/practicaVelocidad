package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Cliente;
import com.example.demo.service.IClienteService;

import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {
	/*Este es el service integrado*/
	@Autowired
	IClienteService service;
	
	/*Este es el metodo en RestController*/
	@GetMapping("/Listar")
	@ResponseBody
	public List<Cliente> ListarCliente(){
		return service.getAll();
	}
	
	
	/*Esto es para llamar una vista*/
	@GetMapping("/ListarMostrar")
	public String ListarClientea(Model model){
		List<Cliente> Cli = service.getAll();
		model.addAttribute("Cliente", Cli);
		return "Listar";
	}
	
	@PostMapping("/Agregar")
	public ResponseEntity<String> AgregarCliente(@RequestBody Cliente c){
		try {
			Cliente clien = service.save(c);
			return ResponseEntity.ok("Cliente Registrado");			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/AgregarMostrar")
	public String AgregarClienteMostrar(Model model){
		Cliente cli  = new Cliente();
		model.addAttribute("Cli", cli);
		return "Agregar";
	}
	
	@PostMapping("/save")
	public String Save(Model model, Cliente cli){
		cli.setEstado(true);
		service.save(cli);
		return "redirect:/Cliente/ListarMostrar";
	}
	
	
	@PutMapping("/Actualziar/{id}")
	public ResponseEntity<Cliente> Actualizar(@PathVariable  int id ,@RequestBody Cliente c){
		c.setDniCliente(id);
		Cliente clien = service.edit(c);
		return ResponseEntity.ok(clien);
	}
	
	@DeleteMapping("/Eliminar/{id}")
	public ResponseEntity<Cliente> Eliminar(@PathVariable  int id){
		Cliente cli = new Cliente();
		cli.setDniCliente(id);
		cli.setEstado(false);
		service.Delete(cli);
		return ResponseEntity.ok(service.Delete(cli));
	}

}
