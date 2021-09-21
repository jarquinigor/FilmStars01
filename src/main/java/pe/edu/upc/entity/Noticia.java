package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Noticia")
public class Noticia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CNoticia;
	
	@Column(name="tituloNoticia", nullable=false, length=80)
	private String NNoticiaTitulo;
	
	@Column(name="subtituloNoticia", nullable=false, length=100)
	private String NNoticiaSubtitulo;
	
	@Column(name="textoNoticia", nullable=false, length=800)
	private String TNoticia;
	
	@Column(name="imagenNoticia", nullable=false, length=200)
	private String TNoticiaImagen;

	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Noticia(int cNoticia, String nNoticiaTitulo, String nNoticiaSubtitulo, String tNoticia,
			String tNoticiaImagen) {
		super();
		CNoticia = cNoticia;
		NNoticiaTitulo = nNoticiaTitulo;
		NNoticiaSubtitulo = nNoticiaSubtitulo;
		TNoticia = tNoticia;
		TNoticiaImagen = tNoticiaImagen;
	}

	public int getCNoticia() {
		return CNoticia;
	}

	public void setCNoticia(int cNoticia) {
		CNoticia = cNoticia;
	}

	public String getNNoticiaTitulo() {
		return NNoticiaTitulo;
	}

	public void setNNoticiaTitulo(String nNoticiaTitulo) {
		NNoticiaTitulo = nNoticiaTitulo;
	}

	public String getNNoticiaSubtitulo() {
		return NNoticiaSubtitulo;
	}

	public void setNNoticiaSubtitulo(String nNoticiaSubtitulo) {
		NNoticiaSubtitulo = nNoticiaSubtitulo;
	}

	public String getTNoticia() {
		return TNoticia;
	}

	public void setTNoticia(String tNoticia) {
		TNoticia = tNoticia;
	}

	public String getTNoticiaImagen() {
		return TNoticiaImagen;
	}

	public void setTNoticiaImagen(String tNoticiaImagen) {
		TNoticiaImagen = tNoticiaImagen;
	}
}