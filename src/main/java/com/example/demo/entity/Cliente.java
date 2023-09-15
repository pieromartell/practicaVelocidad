package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@Column(name="DniCliente")
	int DniCliente;
	
	@Column(name="Nombre")
	String Nombre;
	
	@Column(name="Apellido")
	String Apellido;
	
	@Column(name="direccion")
	String direccion;
	
	@Column(name="distrito")
	String distrito;
	
	@Column(name="provincia")
	String provincia;
	
	@Column(name="telefono")
	int telefono;
	
	@Column(name="correo")
	String correo;
	
	@Column(name="estado")
	Boolean estado;

}
