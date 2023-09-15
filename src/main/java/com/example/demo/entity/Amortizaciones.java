package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Amotizaciones")
public class Amortizaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idamotizaciones")
	int idamotizaciones;
	
	@Column(name="FechaVencimiento")
	Date FechaVencimiento;
	
	@Column(name="Mensualidad")
	@Nonnull
	Double Mensualidad;
	
	@Column(name="Intereses")
	Double Intereses;
	
	@Column(name="Capital")
	Double Capital;
	
	@Column(name="Saldo")
	Double Saldo;
	
	@ManyToOne
	@JoinColumn(name="idprestamo")
	private Prestamo prestamo;

}
