package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Publicacion;

public interface IPublicacionDao {
	public void insertar(Publicacion publicacion);
	public List<Publicacion> listar();
	public void eliminar(int CPublicacion);
}
