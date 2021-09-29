package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IGeneroDao;
import pe.edu.upc.entity.Genero;
import pe.edu.upc.service.IGeneroService;

@Named
@RequestScoped
public class GeneroServiceImpl implements IGeneroService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IGeneroDao mD;
	
	@Override
	public void insertar(Genero genero) {
		mD.insertar(genero);	
	}

	@Override
	public List<Genero> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CGenero) {
		mD.eliminar(CGenero);
	}
}
