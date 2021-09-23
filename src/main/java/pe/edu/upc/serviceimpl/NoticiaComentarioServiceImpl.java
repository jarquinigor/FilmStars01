package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.INoticiaComentarioDao;
import pe.edu.upc.entity.NoticiaComentario;
import pe.edu.upc.service.INoticiaComentarioService;

@Named
@RequestScoped
public class NoticiaComentarioServiceImpl implements INoticiaComentarioService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private INoticiaComentarioDao mD;
	
	@Override
	public void insertar(NoticiaComentario noticiaComentario) {
		mD.insertar(noticiaComentario);	
	}

	@Override
	public List<NoticiaComentario> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CNoticiaComentario) {
		mD.eliminar(CNoticiaComentario);
	}
}
