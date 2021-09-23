package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Tema;

public interface ITemaDao {
	public void insertar(Tema tema);
	public List<Tema> listar();
	public void eliminar(int CTema);
}