package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPeliculaDao;
import pe.edu.upc.entity.Pelicula;

public class PeliculaDaoImpl implements IPeliculaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Pelicula pelicula) {
		em.persist(pelicula);
	}
	
	@Transactional
	@Override
	public void update(Pelicula pelicula) {
		em.merge(pelicula);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pelicula> listar() {
		List<Pelicula> lista = new ArrayList<Pelicula>();
		Query q = em.createQuery("select p from Pelicula p");
		lista = (List<Pelicula>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CPelicula) {
		Pelicula pelicula = new Pelicula();
		pelicula = em.getReference(Pelicula.class, CPelicula);
		em.remove(pelicula);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pelicula> findByNamePelicula(Pelicula p) {
		List<Pelicula> lista = new ArrayList<Pelicula>();
		Query q = em.createQuery("select p from Pelicula p where p.nPelicula like?1");
		q.setParameter(1, "%" + p.getnPelicula() + "%");
		lista = (List<Pelicula>) q.getResultList();
		return lista;
	}
	
}
