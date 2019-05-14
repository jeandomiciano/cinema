package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.SalaBean;
import br.jean.cinema.model.Sala;
@Path("api/sala")
public class SalaRest extends AbstratickRest<Sala> {
	@EJB
	private SalaBean bean; 
	@Override
	public AbstratickBean<Sala> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
