package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PeliculaActor;

public interface IPeliculaActorDao {
	public void insertar(PeliculaActor peliculaActor);
	public List<PeliculaActor> listar();
	public void eliminar(int cPeliculaActor);
}
