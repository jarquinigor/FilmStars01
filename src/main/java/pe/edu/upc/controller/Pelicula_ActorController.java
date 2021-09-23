package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.entity.Actor;
import pe.edu.upc.entity.Pelicula_Actor;

import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.IActorService;
import pe.edu.upc.service.IPelicula_ActorService;

@Named
@RequestScoped

public class Pelicula_ActorController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private IActorService aService;
	
	@Inject
	private IPelicula_ActorService paService;
	
	private Pelicula pelicula;
	private Actor actor;
	private Pelicula_Actor pelicula_actor;
	
	List<Pelicula> listaPeliculas;
	List<Actor> listaActores;
	List<Pelicula_Actor> listaPelicula_Actor;
	
	@PostConstruct
	public void init() {
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaActores = new ArrayList<Actor>();
		this.listaPelicula_Actor = new ArrayList<Pelicula_Actor>();
		
		this.pelicula = new Pelicula();
		this.actor = new Actor();
		this.pelicula_actor = new Pelicula_Actor();
		
		this.listarPelicula();
		this.listarActor();
		this.listarPelicula_Actor();
	}
	
	public String nuevoPelicula_Actor() {
		this.setPelicula_Actor(new Pelicula_Actor());
		return "pelicula_actor.xhtml";
	}
	
	public void insertar() {
		paService.insertar(pelicula_actor);
		limpiarPelicula_Actor();
		this.listarPelicula_Actor();
	}
	
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarActor() {
		listaActores = aService.listar();
	}
	public void listarPelicula_Actor() {
		listaPelicula_Actor = paService.listar();
	}
	
	public void limpiarPelicula_Actor() {
		this.init();
	}
	
	public void eliminar(Pelicula_Actor pelicula_actor) {
		paService.eliminar(pelicula_actor.getCPelicula_Actor());
		this.listarPelicula_Actor();
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Pelicula_Actor getPelicula_Actor() {
		return pelicula_actor;
	}

	public void setPelicula_Actor(Pelicula_Actor pelicula_actor) {
		this.pelicula_actor = pelicula_actor;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public List<Pelicula_Actor> getListaPelicula_Actor() {
		return listaPelicula_Actor;
	}

	public void setListaPelicula_Actor(List<Pelicula_Actor> listaPelicula_Actor) {
		this.listaPelicula_Actor = listaPelicula_Actor;
	}
}
