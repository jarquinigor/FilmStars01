package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICriticoDao;
import pe.edu.upc.entity.Critico;

public class CriticoDaoImpl implements ICriticoDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Critico critico) {
		em.persist(critico);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Critico> listar() {
		List<Critico> lista = new ArrayList<Critico>();
		Query q = em.createQuery("select c from Critico c");
		lista = (List<Critico>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CCritico) {
		Critico critico = new Critico();
		critico = em.getReference(Critico.class, CCritico);
		em.remove(critico);
	}
}
