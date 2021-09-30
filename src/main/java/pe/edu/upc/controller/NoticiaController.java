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
	/////////
	static private Noticia noticiaUsuario;   //USAREMOS ESTE PARA VISUALIZAR
	
	@PostConstruct
	public void init() {
		this.listaNoticias = new ArrayList<Noticia>();
		this.noticia = new Noticia();
		this.listarNoticia(); //SE GUARDAN LOS DATOS DE NUEVO
	}
	
	public String verNoticia(Noticia noticia) {
		this.setNoticiaUsuario(noticia);
		System.out.println(noticia.getcNoticia());
		System.out.println(noticia.getnNoticiaTitulo());

		
		return "noticiaUsuario.xhtml";
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
	
	public void update(Noticia noticia) {
		nService.update(noticia);
	}
	
	public String saveNoticia() {
		String view="";
		try {
			nService.update(this.noticia);
			view="/noticiaAdmin";
			limpiarNoticia();
		} catch (Exception e) {
		}
		return view;
	}
	
	public String editNoticia(Noticia noti) {
		String view="";
		try {
			this.noticia = noti;
			view = "/updateNoticia";
		} catch (Exception e) {
		}
		return view;
	}

	public void eliminar(Noticia noticia) {
		nService.eliminar(noticia.getcNoticia());
		this.listarNoticia();
	}
	
	public void findByTitulo() {
		if (noticia.getnNoticiaTitulo().isEmpty()) {
			this.listarNoticia();
		}
		else {
			listaNoticias = this.nService.findByTituloNoticia(this.getNoticia());
		}
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

	////
	public Noticia getNoticiaUsuario() {
		return noticiaUsuario;
	}

	public void setNoticiaUsuario(Noticia noticiaUsuario) {
		NoticiaController.noticiaUsuario = noticiaUsuario;
	}
	
}
