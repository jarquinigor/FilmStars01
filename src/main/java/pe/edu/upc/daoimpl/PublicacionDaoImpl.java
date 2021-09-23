package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPublicacionDao;
import pe.edu.upc.entity.Publicacion;

public class PublicacionDaoImpl implements IPublicacionDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Publicacion publicacion) {
		em.persist(publicacion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publicacion> listar() {
		List<Publicacion> lista = new ArrayList<Publicacion>();
		Query q = em.createQuery("select m from Publicacion m");
		lista = (List<Publicacion>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CPublicacion) {
		Publicacion publicacion = new Publicacion();
		publicacion = em.getReference(Publicacion.class, CPublicacion);
		em.remove(publicacion);
	}
}
