package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPelicula_GeneroDao;
import pe.edu.upc.entity.Pelicula_Genero;

public class Pelicula_GeneroDaoImpl implements IPelicula_GeneroDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Pelicula_Genero pelicula_genero) {
		em.persist(pelicula_genero);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pelicula_Genero> listar() {
		List<Pelicula_Genero> lista = new ArrayList<Pelicula_Genero>();
		Query q = em.createQuery("select m from Pelicula_Genero m");
		lista = (List<Pelicula_Genero>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CPelicula_Genero) {
		Pelicula_Genero pelicula_genero = new Pelicula_Genero();
		pelicula_genero = em.getReference(Pelicula_Genero.class, CPelicula_Genero);
		em.remove(pelicula_genero);
	}
}
