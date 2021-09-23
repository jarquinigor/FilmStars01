package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Pelicula;

public interface IPeliculaService {
	public void insertar(Pelicula pelicula);
	public List<Pelicula> listar();
	public void eliminar(int CPelicula);
}
