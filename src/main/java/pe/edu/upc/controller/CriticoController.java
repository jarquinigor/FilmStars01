package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Critico;
import pe.edu.upc.service.ICriticoService;

@Named
@RequestScoped

public class CriticoController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private ICriticoService cService;
	private Critico critico;
	List<Critico> listaCriticos;

	@PostConstruct
	public void init() {
		this.listaCriticos = new ArrayList<Critico>();
		this.critico = new Critico();
		this.listarCritico();
	}

	public String nuevoCritico() {
		this.setCritico(new Critico());
		return "critico.xhtml";
	}

	public void insertar() {
		cService.insertar(critico);
		limpiarCritico();
	}

	public void listarCritico() {
		listaCriticos = cService.listar();
	}

	public void limpiarCritico() {
		this.init();
	}

	public void eliminar(Critico critico) {
		cService.eliminar(critico.getCCritico());
		this.listarCritico();
	}

	public Critico getCritico() {
		return critico;
	}

	public void setCritico(Critico critico) {
		this.critico = critico;
	}

	public List<Critico> getListaCriticos() {
		return listaCriticos;
	}

	public void setListaCriticos(List<Critico> listaCriticos) {
		this.listaCriticos = listaCriticos;
	}
}