package br.jean.cinema.model;

import br.jean.cinema.bean.AbstratickBean;
import br.jean.cinema.bean.PoltronaBean;
import br.jean.cinema.rest.AbstratickRest;

public class PoltronaRest extends AbstratickRest<Poltrona> {

	private PoltronaBean bean;
	@Override
	public AbstratickBean<Poltrona> getBean() {
		// TODO Auto-generated method stub
		return  bean;
	}

}
