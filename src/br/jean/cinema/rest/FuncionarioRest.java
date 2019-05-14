package br.jean.cinema.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.FuncionarioBean;
import br.jean.cinema.model.Funcionario;
@Path("api/funcionaro")
public class FuncionarioRest extends AbstratickRest<Funcionario> {
	@EJB
	private FuncionarioBean bean;
	@Override
	public AbstratickBean<Funcionario> getBean() {
		// TODO Auto-generated method stub
		return bean;
	}

}
