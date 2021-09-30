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
	
	public void update(Critico critico) {
		cService.update(critico);
	}
	
	public String saveCritico() {
		String view="";
		try {
			cService.update(this.critico);
			view = "/critico";
			limpiarCritico();
		} catch (Exception e) {
		}
		return view;
	}
	
	public String editCritico(Critico cri) {
		String view="";
		try {
			this.critico = cri;
			view = "/updateCritico";
		} catch (Exception e) {
		}
		return view;
	}
	
	public void eliminar(Critico critico) {
		cService.eliminar(critico.getcCritico());
		this.listarCritico();
	}
	
	public void findByName() {
		if (critico.getnCritico().isEmpty()) {
			this.listarCritico();
		}
		else {
			listaCriticos = this.cService.findByNameCritico(this.getCritico());
		}
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