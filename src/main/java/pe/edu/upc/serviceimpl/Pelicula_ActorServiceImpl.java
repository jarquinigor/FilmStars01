package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPelicula_ActorDao;
import pe.edu.upc.entity.Pelicula_Actor;
import pe.edu.upc.service.IPelicula_ActorService;

@Named
@RequestScoped
public class Pelicula_ActorServiceImpl implements IPelicula_ActorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPelicula_ActorDao mD;
	
	@Override
	public void insertar(Pelicula_Actor pelicula_actor) {
		mD.insertar(pelicula_actor);	
	}

	@Override
	public List<Pelicula_Actor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CPelicula_Actor) {
		mD.eliminar(CPelicula_Actor);
	}
}
