package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Genero;

public interface IGeneroService {
	public void insertar(Genero genero);
	public List<Genero> listar();
	public void eliminar(int cGenero);
}
