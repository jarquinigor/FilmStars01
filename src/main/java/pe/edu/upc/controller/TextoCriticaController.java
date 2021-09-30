package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Critico;
import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.entity.TextoCritica;

import pe.edu.upc.service.ICriticoService;
import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.ITextoCriticaService;

@Named
@RequestScoped

public class TextoCriticaController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private ICriticoService cService;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private ITextoCriticaService tcService;
	
	private Critico critico;
	private Pelicula pelicula;
	private TextoCritica textoCritica;
	
	List<Critico> listaCriticos;
	List<Pelicula> listaPeliculas;
	List<TextoCritica> listaTextoCriticas;
	
	@PostConstruct
	public void init() {
		this.listaCriticos = new ArrayList<Critico>();
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaTextoCriticas = new ArrayList<TextoCritica>();
		
		this.critico = new Critico();
		this.pelicula = new Pelicula();
		this.textoCritica = new TextoCritica();
		
		this.listarCritico();
		this.listarPelicula();
		this.listarTextoCritica();
	}
	
	public String nuevoTextoCritica() {
		this.setTextoCritica(new TextoCritica());
		return "textoCritica.xhtml";
	}
	
	public void insertar() {
		tcService.insertar(textoCritica);
		limpiarTextoCritica();
		this.listarTextoCritica();
	}
	
	public void listarCritico() {
		listaCriticos = cService.listar();
	}
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarTextoCritica() {
		listaTextoCriticas = tcService.listar();
	}
	
	public void limpiarTextoCritica() {
		this.init();
	}
	
	public void update(TextoCritica textoCritica) {
		tcService.update(textoCritica);
	}
	
	public String saveTextoCritica() {
		String view="";
		try {			
			this.textoCritica.setPelicula(this.pelicula);
			this.textoCritica.setCritico(this.critico);
			
			tcService.update(this.textoCritica);
			view="/textoCritica";
			limpiarTextoCritica();
		} catch (Exception e) {
		}
		return view;
	}
	
	public String editTextoCritica(TextoCritica tex) {
		String view="";
		try {
			this.pelicula=tex.getPelicula();
			this.critico=tex.getCritico();
			this.textoCritica=tex;
			view="/updateTextoCritica";
		} catch (Exception e) {
		}
		return view;
	}
	
	public void eliminar(TextoCritica textoCritica) {
		tcService.eliminar(textoCritica.getcTextoCritica());
		this.listarTextoCritica();
	}
	
	public void findByTexto() {
		if (textoCritica.gettCritica().isEmpty()) {
			this.listarTextoCritica();
		}
		else {
			listaTextoCriticas = this.tcService.findByTextoTextoCritica(this.getTextoCritica());
		}
	}

	public Critico getCritico() {
		return critico;
	}

	public void setCritico(Critico critico) {
		this.critico = critico;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public TextoCritica getTextoCritica() {
		return textoCritica;
	}

	public void setTextoCritica(TextoCritica textoCritica) {
		this.textoCritica = textoCritica;
	}

	public List<Critico> getListaCriticos() {
		return listaCriticos;
	}

	public void setListaCriticos(List<Critico> listaCriticos) {
		this.listaCriticos = listaCriticos;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public List<TextoCritica> getListaTextoCriticas() {
		return listaTextoCriticas;
	}

	public void setListaTextoCriticas(List<TextoCritica> listaTextoCriticas) {
		this.listaTextoCriticas = listaTextoCriticas;
	}
}
