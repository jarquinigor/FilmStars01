package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Comunidad;

public interface IComunidadService {
	public void insertar(Comunidad comunidad);
	public List<Comunidad> listar();
	public void eliminar(int CComunidad);
}
