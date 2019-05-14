package br.jean.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sessao extends AbstratickModel {
	
	
	private Double horario;
	private Sala sala;
	private Filme filme;
	
	public Double getHorario() {
		return horario;
	}
	public void setHorario(Double horario) {
		this.horario = horario;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

}
