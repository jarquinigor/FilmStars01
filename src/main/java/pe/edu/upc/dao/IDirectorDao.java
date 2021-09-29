package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Director;

public interface IDirectorDao {
	public void insertar(Director director);
	public List<Director> listar();
	public void eliminar(int CDirector);
	public List<Director> findByNameDirector(Director d);
}
