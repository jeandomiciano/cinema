package br.jean.cinema.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.jean.cinema.model.AbstratickModel;

public abstract class AbstratickBean<T extends AbstratickModel> {
	
	@PersistenceContext(unitName="Farmacia")
	protected EntityManager manager;
	
	public T inserir(T obj) throws Exception {
		manager.persist(obj);
		manager.flush();
		return obj;
	}
	
	public abstract Class<T> getClasse();
	
	public T alterar(T obj) throws Exception {
		//busca o objeto do banco com base na classe e ID
		T old = manager.find(getClasse(), obj.getId());
		
		manager.merge(obj);
		
		manager.flush();
		return obj;
	}
	public void deletar(T obj) throws Exception {
		T old = manager.find(getClasse(), obj.getId());
		
		manager.remove(old);
		manager.flush();
	}
	public T buscarPorId(Long id) throws Exception {
		T obj = manager.find(getClasse(), id);
		return obj;
	}
	
	public T salvar(T obj) throws Exception {
		if (obj.getId() == null) {
			return inserir(obj);
		}else {
			return alterar(obj);
		}
	}

}
