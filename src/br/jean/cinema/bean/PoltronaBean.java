package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Poltrona;
@Stateless
@LocalBean
public class PoltronaBean extends AbstratickBean<Poltrona>{

	@Override
	public Class<Poltrona> getClasse() {
		// TODO Auto-generated method stub
		return Poltrona.class;
	}

}
