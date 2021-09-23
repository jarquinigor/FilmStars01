package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PeliculaGenero;

public interface IPeliculaGeneroService {
	public void insertar(PeliculaGenero peliculaGenero);
	public List<PeliculaGenero> listar();
	public void eliminar(int cPeliculaGenero);
}
