package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITextoCriticaDao;
import pe.edu.upc.entity.TextoCritica;

public class TextoCriticaDaoImpl implements ITextoCriticaDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(TextoCritica textoCritica) {
		em.persist(textoCritica);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TextoCritica> listar() {
		List<TextoCritica> lista = new ArrayList<TextoCritica>();
		Query q = em.createQuery("select tc from TextoCritica tc");
		lista = (List<TextoCritica>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int CTextoCritica) {
		TextoCritica textoCritica = new TextoCritica();
		textoCritica = em.getReference(TextoCritica.class, CTextoCritica);
		em.remove(textoCritica);
	}
}
