package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPeliculaGeneroDao;
import pe.edu.upc.entity.PeliculaGenero;

public class PeliculaGeneroDaoImpl implements IPeliculaGeneroDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PeliculaGenero peliculaGenero) {
		em.persist(peliculaGenero);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PeliculaGenero> listar() {
		List<PeliculaGenero> lista = new ArrayList<PeliculaGenero>();
		Query q = em.createQuery("select pg from PeliculaGenero pg");
		lista = (List<PeliculaGenero>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int cPeliculaGenero) {
		PeliculaGenero peliculaGenero = new PeliculaGenero();
		peliculaGenero = em.getReference(PeliculaGenero.class, cPeliculaGenero);
		em.remove(peliculaGenero);
	}
}
