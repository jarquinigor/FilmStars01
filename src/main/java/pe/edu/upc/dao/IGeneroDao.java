package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Genero;

public interface IGeneroDao {
	public void insertar(Genero genero);
	public List<Genero> listar();
	public void eliminar(int CGenero);
}
