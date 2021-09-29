package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TextoCritica;

public interface ITextoCriticaService {
	public void insertar(TextoCritica textoCritica);
	public List<TextoCritica> listar();
	public void eliminar(int cTextoCritica);
	public List<TextoCritica> findByTextoTextoCritica(TextoCritica tc);
}
