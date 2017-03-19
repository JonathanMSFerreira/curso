package com.curso.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Estilo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEstilo;
	
	
	@NotBlank
	private String nome;

	@OneToMany(mappedBy="estilo")
	private List<Cerveja> cervejas;
	

	public Long getIdEstilo() {
		return idEstilo;
	}


	public void setIdEstilo(Long idEstilo) {
		this.idEstilo = idEstilo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Cerveja> getCervejas() {
		return cervejas;
	}


	public void setCervejas(List<Cerveja> cervejas) {
		this.cervejas = cervejas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEstilo == null) ? 0 : idEstilo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estilo other = (Estilo) obj;
		if (idEstilo == null) {
			if (other.idEstilo != null)
				return false;
		} else if (!idEstilo.equals(other.idEstilo))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
