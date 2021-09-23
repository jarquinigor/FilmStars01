package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PeliculaActor;

public interface IPeliculaActorService {
	public void insertar(PeliculaActor peliculaActor);
	public List<PeliculaActor> listar();
	public void eliminar(int cPeliculaActor);
}
