package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.INoticiaDao;
import pe.edu.upc.entity.Noticia;

public class NoticiaDaoImpl implements INoticiaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Noticia noticia) {
		em.persist(noticia);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Noticia> listar() {
		List<Noticia> lista = new ArrayList<Noticia>();
		Query q = em.createQuery("select n from Noticia n");
		lista = (List<Noticia>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CNoticia) {
		Noticia noticia = new Noticia();
		noticia = em.getReference(Noticia.class, CNoticia);
		em.remove(noticia);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Noticia> findByTituloNoticia(Noticia n) {
		List<Noticia> lista = new ArrayList<Noticia>();
		Query q = em.createQuery("select n from Noticia n where n.nNoticiaTitulo like?1");
		q.setParameter(1, "%" + n.getnNoticiaTitulo() + "%");
		lista = (List<Noticia>) q.getResultList();
		return lista;
	}
	
}
