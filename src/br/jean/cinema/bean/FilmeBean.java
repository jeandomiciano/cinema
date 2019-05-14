package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Filme;

@Stateless
@LocalBean
public class FilmeBean extends AbstratickBean<Filme>{

	@Override
	public Class<Filme> getClasse() {
		// TODO Auto-generated method stub
		return Filme.class;
	}

}
