package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Util.Message;
import pe.edu.upc.entity.Actor;
import pe.edu.upc.service.IActorService;

@Named
@RequestScoped

public class ActorController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IActorService aService;
	private Actor actor;
	List<Actor> listaActores;
	
	@PostConstruct
	public void init() {
		this.listaActores = new ArrayList<Actor>();
		this.actor = new Actor();
		this.listarActor();
	}
	
	public String nuevoActor() {
		this.setActor(new Actor());
		return "actor.xhtml";
	}
	
	public void insertar() {
		aService.insertar(actor);
		limpiarActor();
	}
	
	public void listarActor() {
		listaActores = aService.listar();
	}
	
	public void limpiarActor() {
		this.init();
	}
	
	public void update(Actor actor) {
		aService.update(actor);
	}
	
	public String saveActor() {
		String view = "";
		try {
			aService.update(this.actor);
			view = "/actor";
			limpiarActor();
		} 
		catch (Exception e) {
		}
		return view;
	}
	
	public String editActor(Actor act) {
		String view = "";
		try 
		{
			this.actor = act;
			view = "/updateActor";
		} 
		catch (Exception e) {
		}
		return view;
	}
	
	public void eliminar(Actor actor) {
		aService.eliminar(actor.getcActor());
		this.listarActor();
	}
	
	public void findByName() {
		if (actor.getnActor().isEmpty()) {
			this.listarActor();
		}
		else {
			listaActores = this.aService.findByNameActor(this.getActor());
		}
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}
	
}
