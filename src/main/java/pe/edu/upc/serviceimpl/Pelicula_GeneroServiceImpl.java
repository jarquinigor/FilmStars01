package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPelicula_GeneroDao;
import pe.edu.upc.entity.Pelicula_Genero;
import pe.edu.upc.service.IPelicula_GeneroService;

@Named
@RequestScoped
public class Pelicula_GeneroServiceImpl implements IPelicula_GeneroService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPelicula_GeneroDao mD;
	
	@Override
	public void insertar(Pelicula_Genero pelicula_genero) {
		mD.insertar(pelicula_genero);	
	}

	@Override
	public List<Pelicula_Genero> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CPelicula_Genero) {
		mD.eliminar(CPelicula_Genero);
	}
}
