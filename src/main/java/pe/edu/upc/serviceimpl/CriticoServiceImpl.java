package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICriticoDao;
import pe.edu.upc.entity.Critico;
import pe.edu.upc.service.ICriticoService;

@Named
@RequestScoped
public class CriticoServiceImpl implements ICriticoService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICriticoDao mD;
	
	@Override
	public void insertar(Critico critico) {
		mD.insertar(critico);	
	}
	
	@Override
	public void update(Critico critico) {
		mD.update(critico);	
	}

	@Override
	public List<Critico> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CCritico) {
		mD.eliminar(CCritico);
	}
	
	@Override
	public List<Critico> findByNameCritico(Critico c) {
		return mD.findByNameCritico(c);
	}
	
}
