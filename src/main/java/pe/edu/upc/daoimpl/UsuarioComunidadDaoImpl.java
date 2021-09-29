package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioComunidadDao;
import pe.edu.upc.entity.UsuarioComunidad;

public class UsuarioComunidadDaoImpl implements IUsuarioComunidadDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(UsuarioComunidad usuarioComunidad) {
		em.persist(usuarioComunidad);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UsuarioComunidad> listar() {
		List<UsuarioComunidad> lista = new ArrayList<UsuarioComunidad>();
		Query q = em.createQuery("select uc from UsuarioComunidad uc");
		lista = (List<UsuarioComunidad>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int cUsuarioComunidad) {
		UsuarioComunidad usuarioComunidad = new UsuarioComunidad();
		usuarioComunidad = em.getReference(UsuarioComunidad.class, cUsuarioComunidad);
		em.remove(usuarioComunidad);
	}
}
