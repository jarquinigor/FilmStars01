package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Director;
import pe.edu.upc.service.IDirectorService;

@Named
@RequestScoped

public class DirectorController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private IDirectorService dService;
	private Director director;
	List<Director> listaDirectores;

	@PostConstruct
	public void init() {
		this.listaDirectores = new ArrayList<Director>();
		this.director = new Director();
		this.listarDirector();
	}

	public String nuevoDirector() {
		this.setDirector(new Director());
		return "director.xhtml";
	}

	public void insertar() {
		dService.insertar(director);
		limpiarDirector();
	}

	public void listarDirector() {
		listaDirectores = dService.listar();
	}

	public void limpiarDirector() {
		this.init();
	}

	public void eliminar(Director director) {
		dService.eliminar(director.getcDirector());
		this.listarDirector();
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Director> getListaDirectores() {
		return listaDirectores;
	}

	public void setListaDirectores(List<Director> listaDirectores) {
		this.listaDirectores = listaDirectores;
	}
}
