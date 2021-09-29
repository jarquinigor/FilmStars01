package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Critico;

public interface ICriticoDao {
	public void insertar(Critico critico);
	public List<Critico> listar();
	public void eliminar(int CCritico);
	public List<Critico> findByNameCritico(Critico c);
}
