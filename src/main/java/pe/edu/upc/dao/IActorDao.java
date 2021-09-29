package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Actor;

public interface IActorDao {
	public void insertar(Actor actor);
	public List<Actor> listar();
	public void eliminar(int CActor);
	public List<Actor> findByNameActor(Actor a);
}
