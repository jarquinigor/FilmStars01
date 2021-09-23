package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PeliculaGenero;

public interface IPeliculaGeneroDao {
	public void insertar(PeliculaGenero peliculaGenero);
	public List<PeliculaGenero> listar();
	public void eliminar(int cPeliculaGenero);
}
