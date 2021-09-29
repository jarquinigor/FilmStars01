package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioComunidadDao;
import pe.edu.upc.entity.UsuarioComunidad;
import pe.edu.upc.service.IUsuarioComunidadService;

@Named
@RequestScoped
public class UsuarioComunidadServiceImpl implements IUsuarioComunidadService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioComunidadDao mD;
	
	@Override
	public void insertar(UsuarioComunidad usuarioComunidad) {
		mD.insertar(usuarioComunidad);	
	}

	@Override
	public List<UsuarioComunidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int cUsuarioComunidad) {
		mD.eliminar(cUsuarioComunidad);
	}
}
