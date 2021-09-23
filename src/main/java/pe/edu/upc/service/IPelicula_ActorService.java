package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Pelicula_Actor;

public interface IPelicula_ActorService {
	public void insertar(Pelicula_Actor pelicula_actor);
	public List<Pelicula_Actor> listar();
	public void eliminar(int CPelicula_Actor);
}
