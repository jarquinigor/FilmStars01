package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRatingDao;
import pe.edu.upc.entity.Rating;
import pe.edu.upc.service.IRatingService;

@Named
@RequestScoped
public class RatingServiceImpl implements IRatingService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRatingDao mD;
	
	@Override
	public void insertar(Rating rating) {
		mD.insertar(rating);	
	}

	@Override
	public List<Rating> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CRating) {
		mD.eliminar(CRating);
	}
}
