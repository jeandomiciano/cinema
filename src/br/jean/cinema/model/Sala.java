package br.jean.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sala extends AbstratickModel {
	
	private Integer numeroPoltronas;
	private Integer numerSala;
	
	public Integer getNumeroPoltronas() {
		return numeroPoltronas;
	}
	public void setNumeroPoltronas(Integer numeroPoltronas) {
		this.numeroPoltronas = numeroPoltronas;
	}
	public Integer getNumerSala() {
		return numerSala;
	}
	public void setNumerSala(Integer numerSala) {
		this.numerSala = numerSala;
	}

}
