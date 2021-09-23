package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPeliculaGeneroDao;
import pe.edu.upc.entity.PeliculaGenero;
import pe.edu.upc.service.IPeliculaGeneroService;

@Named
@RequestScoped
public class PeliculaGeneroServiceImpl implements IPeliculaGeneroService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPeliculaGeneroDao mD;
	
	@Override
	public void insertar(PeliculaGenero peliculaGenero) {
		mD.insertar(peliculaGenero);	
	}

	@Override
	public List<PeliculaGenero> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int cPeliculaGenero) {
		mD.eliminar(cPeliculaGenero);
	}
}
