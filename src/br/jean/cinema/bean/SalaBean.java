package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Sala;
@Stateless
@LocalBean
public class SalaBean extends AbstratickBean<Sala> {

	@Override
	public Class<Sala> getClasse() {
		// TODO Auto-generated method stub
		return Sala.class;
	}

}
