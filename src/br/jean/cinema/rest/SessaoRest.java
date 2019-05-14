package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.SessaoBean;
import br.jean.cinema.model.Sessao;
@Path("api/Sessao")
public class SessaoRest extends AbstratickRest<Sessao> {
	@EJB
	private SessaoBean bean;
	@Override
	public AbstratickBean<Sessao> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
