package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IGeneroDao;
import pe.edu.upc.entity.Genero;

public class GeneroDaoImpl implements IGeneroDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Genero genero) {
		em.persist(genero);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Genero> listar() {
		List<Genero> lista = new ArrayList<Genero>();
		Query q = em.createQuery("select m from Genero m");
		lista = (List<Genero>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CGenero) {
		Genero genero = new Genero();
		genero = em.getReference(Genero.class, CGenero);
		em.remove(genero);
	}
}
