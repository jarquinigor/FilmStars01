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
	private int cNoticia;
	
	@Column(name="tituloNoticia", nullable=false, length=80)
	private String nNoticiaTitulo;
	
	@Column(name="subtituloNoticia", nullable=false, length=100)
	private String nNoticiaSubtitulo;
	
	@Column(name="textoNoticia", nullable=false, length=800)
	private String tNoticia;
	
	@Column(name="imagenNoticia", nullable=false, length=200)
	private String tNoticiaImagen;

	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Noticia(int cNoticia, String nNoticiaTitulo, String nNoticiaSubtitulo, String tNoticia,
			String tNoticiaImagen) {
		super();
		this.cNoticia = cNoticia;
		this.nNoticiaTitulo = nNoticiaTitulo;
		this.nNoticiaSubtitulo = nNoticiaSubtitulo;
		this.tNoticia = tNoticia;
		this.tNoticiaImagen = tNoticiaImagen;
	}

	public int getcNoticia() {
		return cNoticia;
	}

	public void setcNoticia(int cNoticia) {
		this.cNoticia = cNoticia;
	}

	public String getnNoticiaTitulo() {
		return nNoticiaTitulo;
	}

	public void setnNoticiaTitulo(String nNoticiaTitulo) {
		this.nNoticiaTitulo = nNoticiaTitulo;
	}

	public String getnNoticiaSubtitulo() {
		return nNoticiaSubtitulo;
	}

	public void setnNoticiaSubtitulo(String nNoticiaSubtitulo) {
		this.nNoticiaSubtitulo = nNoticiaSubtitulo;
	}

	public String gettNoticia() {
		return tNoticia;
	}

	public void settNoticia(String tNoticia) {
		this.tNoticia = tNoticia;
	}

	public String gettNoticiaImagen() {
		return tNoticiaImagen;
	}

	public void settNoticiaImagen(String tNoticiaImagen) {
		this.tNoticiaImagen = tNoticiaImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cNoticia;
		result = prime * result + ((nNoticiaSubtitulo == null) ? 0 : nNoticiaSubtitulo.hashCode());
		result = prime * result + ((nNoticiaTitulo == null) ? 0 : nNoticiaTitulo.hashCode());
		result = prime * result + ((tNoticia == null) ? 0 : tNoticia.hashCode());
		result = prime * result + ((tNoticiaImagen == null) ? 0 : tNoticiaImagen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (cNoticia != other.cNoticia)
			return false;
		if (nNoticiaSubtitulo == null) {
			if (other.nNoticiaSubtitulo != null)
				return false;
		} else if (!nNoticiaSubtitulo.equals(other.nNoticiaSubtitulo))
			return false;
		if (nNoticiaTitulo == null) {
			if (other.nNoticiaTitulo != null)
				return false;
		} else if (!nNoticiaTitulo.equals(other.nNoticiaTitulo))
			return false;
		if (tNoticia == null) {
			if (other.tNoticia != null)
				return false;
		} else if (!tNoticia.equals(other.tNoticia))
			return false;
		if (tNoticiaImagen == null) {
			if (other.tNoticiaImagen != null)
				return false;
		} else if (!tNoticiaImagen.equals(other.tNoticiaImagen))
			return false;
		return true;
	}
}