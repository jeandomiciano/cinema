package br.jean.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Filme extends AbstratickModel {
	
	@Column(length = 50)
	private String nome;
	@Column(length = 50)
	private String genero;
	private Float duracao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Float getDuracao() {
		return duracao;
	}
	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	}
	
}
