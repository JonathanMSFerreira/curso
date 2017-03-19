package com.curso.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cliente implements Serializable {

	
	@Id
	private Long idCliente;
	
	
}
