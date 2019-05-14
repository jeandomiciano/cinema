package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Ingresso;
@Stateless
@LocalBean
public class IngressoBean extends AbstratickBean<Ingresso> {

	@Override
	public Class<Ingresso> getClasse() {
		// TODO Auto-generated method stub
		return Ingresso.class;
	}

}
