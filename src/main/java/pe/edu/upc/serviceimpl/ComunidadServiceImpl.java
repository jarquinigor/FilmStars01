package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IComunidadDao;
import pe.edu.upc.entity.Comunidad;
import pe.edu.upc.service.IComunidadService;

@Named
@RequestScoped
public class ComunidadServiceImpl implements IComunidadService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IComunidadDao mD;
	
	@Override
	public void insertar(Comunidad comunidad) {
		mD.insertar(comunidad);	
	}

	@Override
	public List<Comunidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CComunidad) {
		mD.eliminar(CComunidad);
	}
}