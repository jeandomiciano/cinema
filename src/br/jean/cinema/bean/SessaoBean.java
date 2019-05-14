package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Sessao;
@Stateless
@LocalBean
public class SessaoBean extends AbstratickBean<Sessao>{

	@Override
	public Class<Sessao> getClasse() {
		// TODO Auto-generated method stub
		return Sessao.class;
	}

}
