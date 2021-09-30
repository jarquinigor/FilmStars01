package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.INoticiaDao;
import pe.edu.upc.entity.Noticia;
import pe.edu.upc.service.INoticiaService;

@Named
@RequestScoped
public class NoticiaServiceImpl implements INoticiaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private INoticiaDao mD;
	
	@Override
	public void insertar(Noticia noticia) {
		mD.insertar(noticia);	
	}
	
	@Override
	public void update(Noticia noticia) {
		mD.update(noticia);	
	}

	@Override
	public List<Noticia> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CNoticia) {
		mD.eliminar(CNoticia);
	}
	
	@Override
	public List<Noticia> findByTituloNoticia(Noticia n) {
		return mD.findByTituloNoticia(n);
	}
	
}
