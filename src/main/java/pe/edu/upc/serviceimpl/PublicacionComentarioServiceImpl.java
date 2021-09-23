package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPublicacionComentarioDao;
import pe.edu.upc.entity.PublicacionComentario;
import pe.edu.upc.service.IPublicacionComentarioService;

@Named
@RequestScoped
public class PublicacionComentarioServiceImpl implements IPublicacionComentarioService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPublicacionComentarioDao mD;
	
	@Override
	public void insertar(PublicacionComentario publicacionComentario) {
		mD.insertar(publicacionComentario);	
	}

	@Override
	public List<PublicacionComentario> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CPublicacionComentario) {
		mD.eliminar(CPublicacionComentario);
	}
}
