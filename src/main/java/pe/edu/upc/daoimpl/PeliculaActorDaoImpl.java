package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPeliculaActorDao;
import pe.edu.upc.entity.PeliculaActor;

public class PeliculaActorDaoImpl implements IPeliculaActorDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PeliculaActor peliculaActor) {
		em.persist(peliculaActor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PeliculaActor> listar() {
		List<PeliculaActor> lista = new ArrayList<PeliculaActor>();
		Query q = em.createQuery("select pa from PeliculaActor pa");
		lista = (List<PeliculaActor>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int cPeliculaActor) {
		PeliculaActor peliculaActor = new PeliculaActor();
		peliculaActor = em.getReference(PeliculaActor.class, cPeliculaActor);
		em.remove(peliculaActor);
	}
}
