package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pelicula")
public class Pelicula implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cPelicula;
	
	@ManyToOne
	@JoinColumn(name = "cDirector", nullable = false)
	private Director director;
	
	@Column(name="nombrePelicula", nullable=false, length=60)
	private String nPelicula;
	
	@Column(name="sinopsisPelicula", nullable=false, length=400)
	private String tPeliculaSinopsis;
	
	@Column(name="argumentoPelicula", nullable=false, length=800)
	private String tPeliculaArgumento;
	
	@Column(name="portadaPelicula", nullable=false, length=200)
	private String tPeliculaPortada;
	
	@Column(name="imagenPelicula", nullable=false, length=200)
	private String tPeliculaImagen;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(int cPelicula, Director director, String nPelicula, String tPeliculaSinopsis,
			String tPeliculaArgumento, String tPeliculaPortada, String tPeliculaImagen) {
		super();
		this.cPelicula = cPelicula;
		this.director = director;
		this.nPelicula = nPelicula;
		this.tPeliculaSinopsis = tPeliculaSinopsis;
		this.tPeliculaArgumento = tPeliculaArgumento;
		this.tPeliculaPortada = tPeliculaPortada;
		this.tPeliculaImagen = tPeliculaImagen;
	}

	public int getcPelicula() {
		return cPelicula;
	}

	public void setcPelicula(int cPelicula) {
		this.cPelicula = cPelicula;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getnPelicula() {
		return nPelicula;
	}

	public void setnPelicula(String nPelicula) {
		this.nPelicula = nPelicula;
	}

	public String gettPeliculaSinopsis() {
		return tPeliculaSinopsis;
	}

	public void settPeliculaSinopsis(String tPeliculaSinopsis) {
		this.tPeliculaSinopsis = tPeliculaSinopsis;
	}

	public String gettPeliculaArgumento() {
		return tPeliculaArgumento;
	}

	public void settPeliculaArgumento(String tPeliculaArgumento) {
		this.tPeliculaArgumento = tPeliculaArgumento;
	}

	public String gettPeliculaPortada() {
		return tPeliculaPortada;
	}

	public void settPeliculaPortada(String tPeliculaPortada) {
		this.tPeliculaPortada = tPeliculaPortada;
	}

	public String gettPeliculaImagen() {
		return tPeliculaImagen;
	}

	public void settPeliculaImagen(String tPeliculaImagen) {
		this.tPeliculaImagen = tPeliculaImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cPelicula;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((nPelicula == null) ? 0 : nPelicula.hashCode());
		result = prime * result + ((tPeliculaArgumento == null) ? 0 : tPeliculaArgumento.hashCode());
		result = prime * result + ((tPeliculaImagen == null) ? 0 : tPeliculaImagen.hashCode());
		result = prime * result + ((tPeliculaPortada == null) ? 0 : tPeliculaPortada.hashCode());
		result = prime * result + ((tPeliculaSinopsis == null) ? 0 : tPeliculaSinopsis.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (cPelicula != other.cPelicula)
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (nPelicula == null) {
			if (other.nPelicula != null)
				return false;
		} else if (!nPelicula.equals(other.nPelicula))
			return false;
		if (tPeliculaArgumento == null) {
			if (other.tPeliculaArgumento != null)
				return false;
		} else if (!tPeliculaArgumento.equals(other.tPeliculaArgumento))
			return false;
		if (tPeliculaImagen == null) {
			if (other.tPeliculaImagen != null)
				return false;
		} else if (!tPeliculaImagen.equals(other.tPeliculaImagen))
			return false;
		if (tPeliculaPortada == null) {
			if (other.tPeliculaPortada != null)
				return false;
		} else if (!tPeliculaPortada.equals(other.tPeliculaPortada))
			return false;
		if (tPeliculaSinopsis == null) {
			if (other.tPeliculaSinopsis != null)
				return false;
		} else if (!tPeliculaSinopsis.equals(other.tPeliculaSinopsis))
			return false;
		return true;
	}
}