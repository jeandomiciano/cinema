package br.jean.cinema.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.jean.cinema.model.Usuario;
@Stateless
@LocalBean
public class UsuarioBean extends AbstratickBean<Usuario>{

	@Override
	public Class<Usuario> getClasse() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}

}
