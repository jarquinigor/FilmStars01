package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tema;

public interface ITemaService {
	public void insertar(Tema tema);
	public List<Tema> listar();
	public void eliminar(int CTema);
}
