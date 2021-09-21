package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Pelicula implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPelicula;
	
	@ManyToOne
	@JoinColumn(name = "CDirector", nullable = false)
	private Director director;
	
	@Column(name="nombrePelicula", nullable=false, length=60)
	private String NPelicula;
	
	@Column(name="sinopsisPelicula", nullable=false, length=400)
	private String TPeliculaSinopsis;
	
	@Column(name="argumentoPelicula", nullable=false, length=800)
	private String TPeliculaArgumento;
	
	@Column(name="imagenPelicula", nullable=false, length=200)
	private String TPeliculaImagen;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(int cPelicula, Director director, String nPelicula, String tPeliculaSinopsis,
			String tPeliculaArgumento, String tPeliculaImagen) {
		super();
		CPelicula = cPelicula;
		this.director = director;
		NPelicula = nPelicula;
		TPeliculaSinopsis = tPeliculaSinopsis;
		TPeliculaArgumento = tPeliculaArgumento;
		TPeliculaImagen = tPeliculaImagen;
	}

	public int getCPelicula() {
		return CPelicula;
	}

	public void setCPelicula(int cPelicula) {
		CPelicula = cPelicula;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getNPelicula() {
		return NPelicula;
	}

	public void setNPelicula(String nPelicula) {
		NPelicula = nPelicula;
	}

	public String getTPeliculaSinopsis() {
		return TPeliculaSinopsis;
	}

	public void setTPeliculaSinopsis(String tPeliculaSinopsis) {
		TPeliculaSinopsis = tPeliculaSinopsis;
	}

	public String getTPeliculaArgumento() {
		return TPeliculaArgumento;
	}

	public void setTPeliculaArgumento(String tPeliculaArgumento) {
		TPeliculaArgumento = tPeliculaArgumento;
	}

	public String getTPeliculaImagen() {
		return TPeliculaImagen;
	}

	public void setTPeliculaImagen(String tPeliculaImagen) {
		TPeliculaImagen = tPeliculaImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CPelicula;
		result = prime * result + ((NPelicula == null) ? 0 : NPelicula.hashCode());
		result = prime * result + ((TPeliculaArgumento == null) ? 0 : TPeliculaArgumento.hashCode());
		result = prime * result + ((TPeliculaImagen == null) ? 0 : TPeliculaImagen.hashCode());
		result = prime * result + ((TPeliculaSinopsis == null) ? 0 : TPeliculaSinopsis.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
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
		if (CPelicula != other.CPelicula)
			return false;
		if (NPelicula == null) {
			if (other.NPelicula != null)
				return false;
		} else if (!NPelicula.equals(other.NPelicula))
			return false;
		if (TPeliculaArgumento == null) {
			if (other.TPeliculaArgumento != null)
				return false;
		} else if (!TPeliculaArgumento.equals(other.TPeliculaArgumento))
			return false;
		if (TPeliculaImagen == null) {
			if (other.TPeliculaImagen != null)
				return false;
		} else if (!TPeliculaImagen.equals(other.TPeliculaImagen))
			return false;
		if (TPeliculaSinopsis == null) {
			if (other.TPeliculaSinopsis != null)
				return false;
		} else if (!TPeliculaSinopsis.equals(other.TPeliculaSinopsis))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		return true;
	}
}