package com.curso.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Cerveja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCerveja;

	@Pattern(regexp = "[a-zA-Z]{2}\\d{4}", message = "O SKU deve ser do tipo XX9999")
	@NotBlank(message = "O campo SKU é obrigatório")
	private String sku;

	@NotBlank(message = "O nome da cerveja deve ser informado")
	private String nome;

	@Size(max = 50, message = "O tamanho da descrição dever ser de 1 a 50 caracteres!")
	@NotBlank(message = "Insira uma descrição para esta cerveja")
	private String descricao;

	@NotNull(message = "Digite um preço para a cerveja")
	@DecimalMin("0.01")
	@Column(precision = 2, scale = 3)
	private BigDecimal preco;

	private BigDecimal teorAlcoolico;

	private BigDecimal comissao;

	private Integer quantidadeEstoque;

	@Enumerated(EnumType.STRING)
	private Sabor sabor;

	@Enumerated(EnumType.STRING)
	private Origem origem;

	@ManyToOne
	@JoinColumn(name = "fkEstilo")
	private Estilo estilo;

	public Long getIdCerveja() {
		return idCerveja;
	}

	public void setIdCerveja(Long idCerveja) {
		this.idCerveja = idCerveja;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(BigDecimal teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCerveja == null) ? 0 : idCerveja.hashCode());
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
		Cerveja other = (Cerveja) obj;
		if (idCerveja == null) {
			if (other.idCerveja != null)
				return false;
		} else if (!idCerveja.equals(other.idCerveja))
			return false;
		return true;
	}

}
