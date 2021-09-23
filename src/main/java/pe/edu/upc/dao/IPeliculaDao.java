package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Pelicula;

public interface IPeliculaDao {
	public void insertar(Pelicula pelicula);
	public List<Pelicula> listar();
	public void eliminar(int CPelicula);
}