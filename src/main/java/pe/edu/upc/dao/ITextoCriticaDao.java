package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TextoCritica;

public interface ITextoCriticaDao {
	public void insertar(TextoCritica textoCritica);
	public List<TextoCritica> listar();
	public void eliminar(int CTextoCritica);
}
