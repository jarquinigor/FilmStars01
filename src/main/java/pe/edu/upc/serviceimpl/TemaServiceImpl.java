package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITemaDao;
import pe.edu.upc.entity.Tema;
import pe.edu.upc.service.ITemaService;

@Named
@RequestScoped
public class TemaServiceImpl implements ITemaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITemaDao mD;
	
	@Override
	public void insertar(Tema tema) {
		mD.insertar(tema);	
	}

	@Override
	public List<Tema> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CTema) {
		mD.eliminar(CTema);
	}
}
