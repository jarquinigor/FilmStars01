package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Pelicula_Actor;

public interface IPelicula_ActorDao {
	public void insertar(Pelicula_Actor pelicula_actor);
	public List<Pelicula_Actor> listar();
	public void eliminar(int CPelicula_Actor);
}