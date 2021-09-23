package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Publicacion;

public interface IPublicacionService {
	public void insertar(Publicacion publicacion);
	public List<Publicacion> listar();
	public void eliminar(int CPublicacion);
}
