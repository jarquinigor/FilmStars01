package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITemaDao;
import pe.edu.upc.entity.Tema;

public class TemaDaoImpl implements ITemaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Tema tema) {
		em.persist(tema);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tema> listar() {
		List<Tema> lista = new ArrayList<Tema>();
		Query q = em.createQuery("select t from Tema t");
		lista = (List<Tema>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CTema) {
		Tema tema = new Tema();
		tema = em.getReference(Tema.class, CTema);
		em.remove(tema);
	}
}
