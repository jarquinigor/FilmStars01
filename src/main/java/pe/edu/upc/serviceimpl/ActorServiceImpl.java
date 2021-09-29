package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IActorDao;
import pe.edu.upc.entity.Actor;
import pe.edu.upc.service.IActorService;

@Named
@RequestScoped
public class ActorServiceImpl implements IActorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IActorDao mD;
	
	@Override
	public void insertar(Actor actor) {
		mD.insertar(actor);	
	}

	@Override
	public List<Actor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CActor) {
		mD.eliminar(CActor);
	}
	
	@Override
	public List<Actor> findByNameActor(Actor a) {
		return mD.findByNameActor(a);
	}
	
}
