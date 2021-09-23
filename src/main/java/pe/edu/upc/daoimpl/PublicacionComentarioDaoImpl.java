package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPublicacionComentarioDao;
import pe.edu.upc.entity.PublicacionComentario;

public class PublicacionComentarioDaoImpl implements IPublicacionComentarioDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PublicacionComentario publicacionComentario) {
		em.persist(publicacionComentario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PublicacionComentario> listar() {
		List<PublicacionComentario> lista = new ArrayList<PublicacionComentario>();
		Query q = em.createQuery("select m from PublicacionComentario m");
		lista = (List<PublicacionComentario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CPublicacionComentario) {
		PublicacionComentario publicacionComentario = new PublicacionComentario();
		publicacionComentario = em.getReference(PublicacionComentario.class, CPublicacionComentario);
		em.remove(publicacionComentario);
	}
}
