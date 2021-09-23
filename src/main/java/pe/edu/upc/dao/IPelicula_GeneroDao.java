package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Pelicula_Genero;

public interface IPelicula_GeneroDao {
	public void insertar(Pelicula_Genero pelicula_genero);
	public List<Pelicula_Genero> listar();
	public void eliminar(int CPelicula_Genero);
}