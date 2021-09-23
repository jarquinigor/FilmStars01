package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDirectorDao;
import pe.edu.upc.entity.Director;

public class DirectorDaoImpl implements IDirectorDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Director director) {
		em.persist(director);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Director> listar() {
		List<Director> lista = new ArrayList<Director>();
		Query q = em.createQuery("select d from Director d");
		lista = (List<Director>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CDirector) {
		Director director = new Director();
		director = em.getReference(Director.class, CDirector);
		em.remove(director);
	}
}