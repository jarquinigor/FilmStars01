package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Critico;

public interface ICriticoService {
	public void insertar(Critico critico);
	public List<Critico> listar();
	public void eliminar(int cCritico);
}
