package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PeliculaGenero")
public class PeliculaGenero implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cPeliculaGenero;

	@ManyToOne
	@JoinColumn(name = "cPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "cGenero", nullable = false)
	private Genero genero;

	public PeliculaGenero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeliculaGenero(int cPeliculaGenero, Pelicula pelicula, Genero genero) {
		super();
		this.cPeliculaGenero = cPeliculaGenero;
		this.pelicula = pelicula;
		this.genero = genero;
	}

	public int getcPeliculaGenero() {
		return cPeliculaGenero;
	}

	public void setcPeliculaGenero(int cPeliculaGenero) {
		this.cPeliculaGenero = cPeliculaGenero;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
