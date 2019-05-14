package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.UsuarioBean;
import br.jean.cinema.model.Usuario;
@Path("api/Usuario")
public class UsuarioRest extends AbstratickRest<Usuario> {
	@EJB
	private UsuarioBean bean;
	@Override
	public AbstratickBean<Usuario> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
