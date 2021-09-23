package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tema;
import pe.edu.upc.service.ITemaService;

@Named
@RequestScoped

public class TemaController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private ITemaService tService;
	private Tema tema;
	List<Tema> listaTemas;

	@PostConstruct
	public void init() {
		this.listaTemas = new ArrayList<Tema>();
		this.tema = new Tema();
		this.listarTema();
	}

	public String nuevoTema() {
		this.setTema(new Tema());
		return "tema.xhtml";
	}

	public void insertar() {
		tService.insertar(tema);
		limpiarTema();
	}

	public void listarTema() {
		listaTemas = tService.listar();
	}

	public void limpiarTema() {
		this.init();
	}

	public void eliminar(Tema tema) {
		tService.eliminar(tema.getCTema());
		this.listarTema();
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public List<Tema> getListaTemas() {
		return listaTemas;
	}

	public void setListaTemas(List<Tema> listaTemas) {
		this.listaTemas = listaTemas;
	}
}
