package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITextoCriticaDao;
import pe.edu.upc.entity.TextoCritica;
import pe.edu.upc.service.ITextoCriticaService;

@Named
@RequestScoped
public class TextoCriticaServiceImpl implements ITextoCriticaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITextoCriticaDao mD;
	
	@Override
	public void insertar(TextoCritica textoCritica) {
		mD.insertar(textoCritica);	
	}

	@Override
	public List<TextoCritica> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CTextoCritica) {
		mD.eliminar(CTextoCritica);
	}
	
	@Override
	public List<TextoCritica> findByPelicula(TextoCritica tc) {
		return mD.findByPelicula(tc);
	}
	
	@Override
	public List<TextoCritica> findByCritico(TextoCritica tc) {
		return mD.findByCritico(tc);
	}
	
}
