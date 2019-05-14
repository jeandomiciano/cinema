package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Funcionario;

@Stateless
@LocalBean
public class FuncionarioBean extends AbstratickBean<Funcionario> {

	@Override
	public Class<Funcionario> getClasse() {
		// TODO Auto-generated method stub
		return Funcionario.class;
	}

}
