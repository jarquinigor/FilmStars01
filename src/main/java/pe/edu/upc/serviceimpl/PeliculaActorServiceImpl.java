package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPeliculaActorDao;
import pe.edu.upc.entity.PeliculaActor;
import pe.edu.upc.service.IPeliculaActorService;

@Named
@RequestScoped
public class PeliculaActorServiceImpl implements IPeliculaActorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPeliculaActorDao mD;
	
	@Override
	public void insertar(PeliculaActor peliculaActor) {
		mD.insertar(peliculaActor);	
	}

	@Override
	public List<PeliculaActor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int cPeliculaActor) {
		mD.eliminar(cPeliculaActor);
	}
}
