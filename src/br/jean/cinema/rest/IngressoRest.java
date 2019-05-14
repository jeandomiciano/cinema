package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.IngressoBean;
import br.jean.cinema.model.Ingresso;
@Path("api/ingresso")
public class IngressoRest extends AbstratickRest<Ingresso> {
	@EJB
	private IngressoBean bean;
	@Override
	public AbstratickBean<Ingresso> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
