package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPelicula_ActorDao;
import pe.edu.upc.entity.Pelicula_Actor;

public class Pelicula_ActorDaoImpl implements IPelicula_ActorDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Pelicula_Actor pelicula_actor) {
		em.persist(pelicula_actor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pelicula_Actor> listar() {
		List<Pelicula_Actor> lista = new ArrayList<Pelicula_Actor>();
		Query q = em.createQuery("select m from Pelicula_Actor m");
		lista = (List<Pelicula_Actor>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CPelicula_Actor) {
		Pelicula_Actor pelicula_actor = new Pelicula_Actor();
		pelicula_actor = em.getReference(Pelicula_Actor.class, CPelicula_Actor);
		em.remove(pelicula_actor);
	}
}
