package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Noticia;
import pe.edu.upc.service.INoticiaService;

@Named
@RequestScoped

public class NoticiaController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private INoticiaService nService;
	private Noticia noticia;
	List<Noticia> listaNoticias;

	@PostConstruct
	public void init() {
		this.listaNoticias = new ArrayList<Noticia>();
		this.noticia = new Noticia();
		this.listarNoticia();
	}

	public String nuevoNoticia() {
		this.setNoticia(new Noticia());
		return "noticia.xhtml";
	}

	public void insertar() {
		nService.insertar(noticia);
		limpiarNoticia();
	}

	public void listarNoticia() {
		listaNoticias = nService.listar();
	}

	public void limpiarNoticia() {
		this.init();
	}

	public void eliminar(Noticia noticia) {
		nService.eliminar(noticia.getCNoticia());
		this.listarNoticia();
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public List<Noticia> getListaNoticias() {
		return listaNoticias;
	}

	public void setListaNoticias(List<Noticia> listaNoticias) {
		this.listaNoticias = listaNoticias;
	}
}
