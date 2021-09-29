package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDirectorDao;
import pe.edu.upc.entity.Director;
import pe.edu.upc.service.IDirectorService;

@Named
@RequestScoped
public class DirectorServiceImpl implements IDirectorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDirectorDao mD;
	
	@Override
	public void insertar(Director director) {
		mD.insertar(director);	
	}

	@Override
	public List<Director> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CDirector) {
		mD.eliminar(CDirector);
	}
	
	@Override
	public List<Director> findByNameDirector(Director d) {
		return mD.findByNameDirector(d);
	}
	
}

