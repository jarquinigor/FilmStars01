package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Genero;
import pe.edu.upc.service.IGeneroService;

@Named
@RequestScoped

public class GeneroController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private IGeneroService gService;
	private Genero genero;
	List<Genero> listaGeneros;

	@PostConstruct
	public void init() {
		this.listaGeneros = new ArrayList<Genero>();
		this.genero = new Genero();
		this.listarGenero();
	}

	public String nuevoGenero() {
		this.setGenero(new Genero());
		return "genero.xhtml";
	}

	public void insertar() {
		gService.insertar(genero);
		limpiarGenero();
	}

	public void listarGenero() {
		listaGeneros = gService.listar();
	}

	public void limpiarGenero() {
		this.init();
	}

	public void eliminar(Genero genero) {
		gService.eliminar(genero.getcGenero());
		this.listarGenero();
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Genero> getListaGeneros() {
		return listaGeneros;
	}

	public void setListaGeneros(List<Genero> listaGeneros) {
		this.listaGeneros = listaGeneros;
	}
}