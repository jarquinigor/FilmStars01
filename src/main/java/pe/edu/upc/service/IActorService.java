package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Actor;

public interface IActorService {
	public void insertar(Actor actor);
	public List<Actor> listar();
	public void eliminar(int cActor);
	public List<Actor> findByNameActor(Actor a);
}
