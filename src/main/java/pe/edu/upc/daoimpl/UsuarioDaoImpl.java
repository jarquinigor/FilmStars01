package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Usuario usuario) {
		em.persist(usuario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		Query q = em.createQuery("select u from Usuario u");
		lista = (List<Usuario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int cUsuario) {
		Usuario usuario = new Usuario();
		usuario = em.getReference(Usuario.class, cUsuario);
		em.remove(usuario);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean verificaUsuario(String email, String password) {
		/*List<Usuario> usuarios = new ArrayList<Usuario>();
		Query q = em.createQuery("select u from Usuario u where u.nombreEmail like ?1 and u.nombrePassword like ?2");
		q.setParameter(1,"%" + email +"%");
		q.setParameter(2, "%" + password +"%");
		
		usuarios = (List<Usuario>)q.getResultList();
		return usuarios.isEmpty();*/
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Query q = em.createQuery("select u from Usuario u where u.nombreEmail = :uemail and u.nombrePassword = :upassword");
		q.setParameter("uemail",email);
		q.setParameter("upassword",password);
		
		usuarios = (List<Usuario>)q.getResultList();
		return usuarios.isEmpty();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Usuario enviarUsuario(String email, String password) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		Query q = em.createQuery("select u from Usuario u where u.nombreEmail = :uemail and u.nombrePassword = :upassword");
		q.setParameter("uemail",email);
		q.setParameter("upassword",password);
		
		usuarios = (List<Usuario>)q.getResultList();
		usuario = usuarios.get(0);
		return usuario;
	}
}
