package br.jean.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ingresso extends AbstratickModel {
	
	private Double preco;
	private Sessao sessao;
	@Column(length = 4)
	private String codPoltrona;
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Sessao getSessao() {
		return sessao;
	}
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	public String getCodPoltrona() {
		return codPoltrona;
	}
	public void setCodPoltrona(String codPoltrona) {
		this.codPoltrona = codPoltrona;
	}

}
