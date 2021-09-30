package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPeliculaDao;
import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.service.IPeliculaService;

@Named
@RequestScoped
public class PeliculaServiceImpl implements IPeliculaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IPeliculaDao mD;

	@Override
	public void insertar(Pelicula pelicula) {
		mD.insertar(pelicula);
	}
	
	@Override
	public void update(Pelicula pelicula) {
		mD.update(pelicula);
	}

	@Override
	public List<Pelicula> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CPelicula) {
		mD.eliminar(CPelicula);
	}
	
	@Override
	public List<Pelicula> findByNamePelicula(Pelicula p) {
		return mD.findByNamePelicula(p);
	}
	
}
