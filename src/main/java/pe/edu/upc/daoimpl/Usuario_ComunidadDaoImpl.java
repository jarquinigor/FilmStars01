package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuario_ComunidadDao;
import pe.edu.upc.entity.Usuario_Comunidad;

public class Usuario_ComunidadDaoImpl implements IUsuario_ComunidadDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Usuario_Comunidad usuario_comunidad) {
		em.persist(usuario_comunidad);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario_Comunidad> listar() {
		List<Usuario_Comunidad> lista = new ArrayList<Usuario_Comunidad>();
		Query q = em.createQuery("select m from Usuario_Comunidad m");
		lista = (List<Usuario_Comunidad>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CUsuario_Comunidad) {
		Usuario_Comunidad usuario_comunidad = new Usuario_Comunidad();
		usuario_comunidad = em.getReference(Usuario_Comunidad.class, CUsuario_Comunidad);
		em.remove(usuario_comunidad);
	}
}
