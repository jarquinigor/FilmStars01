package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IActorDao;
import pe.edu.upc.entity.Actor;

public class ActorDaoImpl implements IActorDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Actor actor) {
		em.persist(actor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> listar() {
		List<Actor> lista = new ArrayList<Actor>();
		Query q = em.createQuery("select a from Actor a");
		lista = (List<Actor>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CActor) {
		Actor actor = new Actor();
		actor = em.getReference(Actor.class, CActor);
		em.remove(actor);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> findByNameActor(Actor a) {
		List<Actor> lista = new ArrayList<Actor>();
		Query q = em.createQuery("select a from Actor a where a.nActor like?1");
		q.setParameter(1, "%" + a.getnActor() + "%");
		lista = (List<Actor>) q.getResultList();
		return lista;
	}
	
}
