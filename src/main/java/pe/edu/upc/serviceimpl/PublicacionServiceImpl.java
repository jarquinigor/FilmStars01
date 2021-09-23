package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPublicacionDao;
import pe.edu.upc.entity.Publicacion;
import pe.edu.upc.service.IPublicacionService;

@Named
@RequestScoped
public class PublicacionServiceImpl implements IPublicacionService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPublicacionDao mD;
	
	@Override
	public void insertar(Publicacion publicacion) {
		mD.insertar(publicacion);	
	}

	@Override
	public List<Publicacion> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CPublicacion) {
		mD.eliminar(CPublicacion);
	}
}
