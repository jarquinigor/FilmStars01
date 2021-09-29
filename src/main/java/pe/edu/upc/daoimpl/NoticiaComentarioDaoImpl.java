package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.INoticiaComentarioDao;
import pe.edu.upc.entity.NoticiaComentario;

public class NoticiaComentarioDaoImpl implements INoticiaComentarioDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(NoticiaComentario noticiaComentario) {
		em.persist(noticiaComentario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NoticiaComentario> listar() {
		List<NoticiaComentario> lista = new ArrayList<NoticiaComentario>();
		Query q = em.createQuery("select nc from NoticiaComentario nc");
		lista = (List<NoticiaComentario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CNoticiaComentario) {
		NoticiaComentario noticiaComentario = new NoticiaComentario();
		noticiaComentario = em.getReference(NoticiaComentario.class, CNoticiaComentario);
		em.remove(noticiaComentario);
	}
}
