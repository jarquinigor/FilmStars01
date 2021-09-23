package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRatingDao;
import pe.edu.upc.entity.Rating;

public class RatingDaoImpl implements IRatingDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Rating rating) {
		em.persist(rating);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rating> listar() {
		List<Rating> lista = new ArrayList<Rating>();
		Query q = em.createQuery("select r from Rating r");
		lista = (List<Rating>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CRating) {
		Rating rating = new Rating();
		rating = em.getReference(Rating.class, CRating);
		em.remove(rating);
	}
}
