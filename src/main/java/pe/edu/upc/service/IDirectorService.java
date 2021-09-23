package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Director;

public interface IDirectorService {
	public void insertar(Director director);
	public List<Director> listar();
	public void eliminar(int CDirector);
}
