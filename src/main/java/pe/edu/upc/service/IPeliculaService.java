package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Pelicula;

public interface IPeliculaService {
	public void insertar(Pelicula pelicula);
	public void update(Pelicula pelicula);
	public List<Pelicula> listar();
	public void eliminar(int cPelicula);
	public List<Pelicula> findByNamePelicula(Pelicula p);
}
