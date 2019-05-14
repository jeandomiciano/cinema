package br.jean.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Poltrona extends AbstratickModel {
	
	@Column(length = 10)
	private String codigo;
	private Integer posicao;
	private Integer fileira;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	public Integer getFileira() {
		return fileira;
	}
	public void setFileira(Integer fileira) {
		this.fileira = fileira;
	}
	

}
