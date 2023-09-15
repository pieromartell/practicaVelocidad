package com.example.demo.entity;



import java.sql.Date;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="prestamo")
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idprestamo")
	int idprestamo;
	
	@Column(name="fecha_prestamo")
	Date fecha_prestamo;
	
	@Column(name="monto")
	Double monto;
	
	@Column(name="interes")
	int interes;
	
	@Column(name="nrocuotas")
	int nrocuotas;
}
