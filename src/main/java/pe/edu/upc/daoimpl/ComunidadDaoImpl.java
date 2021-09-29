package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IComunidadDao;
import pe.edu.upc.entity.Comunidad;

public class ComunidadDaoImpl implements IComunidadDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Comunidad comunidad) {
		em.persist(comunidad);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comunidad> listar() {
		List<Comunidad> lista = new ArrayList<Comunidad>();
		Query q = em.createQuery("select c from Comunidad c");
		lista = (List<Comunidad>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CComunidad) {
		Comunidad comunidad = new Comunidad();
		comunidad = em.getReference(Comunidad.class, CComunidad);
		em.remove(comunidad);
	}
}
