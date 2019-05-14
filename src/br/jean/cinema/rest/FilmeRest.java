package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.FilmeBean;
import br.jean.cinema.model.Filme;
@Path("api/filme")
public class FilmeRest extends AbstratickRest<Filme> {
	@EJB
	private FilmeBean bean;
	@Override
	public AbstratickBean<Filme> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
