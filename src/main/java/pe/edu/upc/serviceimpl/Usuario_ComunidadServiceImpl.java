package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuario_ComunidadDao;
import pe.edu.upc.entity.Usuario_Comunidad;
import pe.edu.upc.service.IUsuario_ComunidadService;

@Named
@RequestScoped
public class Usuario_ComunidadServiceImpl implements IUsuario_ComunidadService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuario_ComunidadDao mD;
	
	@Override
	public void insertar(Usuario_Comunidad usuario_comunidad) {
		mD.insertar(usuario_comunidad);	
	}

	@Override
	public List<Usuario_Comunidad> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CUsuario_Comunidad) {
		mD.eliminar(CUsuario_Comunidad);
	}
}
