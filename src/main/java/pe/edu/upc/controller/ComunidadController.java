package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tema;
import pe.edu.upc.entity.Comunidad;

import pe.edu.upc.service.ITemaService;
import pe.edu.upc.service.IComunidadService;

@Named
@RequestScoped

public class ComunidadController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private ITemaService tService;
	
	@Inject
	private IComunidadService cService;
	
	private Tema tema;
	private Comunidad comunidad;
	
	List<Tema> listaTemas;
	List<Comunidad> listaComunidades;
	
	@PostConstruct
	public void init() {
		this.listaTemas = new ArrayList<Tema>();
		this.listaComunidades = new ArrayList<Comunidad>();
		
		this.tema = new Tema();
		this.comunidad = new Comunidad();
		
		this.listarTema();
		this.listarComunidad();
	}
	
	public String nuevoComunidad() {
		this.setComunidad(new Comunidad());
		return "comunidad.xhtml";
	}
	
	public void insertar() {
		cService.insertar(comunidad);
		limpiarComunidad();
		this.listarComunidad();
	}
	
	public void listarTema() {
		listaTemas = tService.listar();
	}
	public void listarComunidad() {
		listaComunidades = cService.listar();
	}
	
	public void limpiarComunidad() {
		this.init();
	}
	
	public void eliminar(Comunidad comunidad) {
		cService.eliminar(comunidad.getCComunidad());
		this.listarComunidad();
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Comunidad getComunidad() {
		return comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public List<Tema> getListaTemas() {
		return listaTemas;
	}

	public void setListaTemas(List<Tema> listaTemas) {
		this.listaTemas = listaTemas;
	}

	public List<Comunidad> getListaComunidades() {
		return listaComunidades;
	}

	public void setListaComunidades(List<Comunidad> listaComunidades) {
		this.listaComunidades = listaComunidades;
	}
}
