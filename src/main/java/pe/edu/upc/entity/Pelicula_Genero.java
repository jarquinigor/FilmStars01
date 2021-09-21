package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Pelicula_Genero implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPelicula_Genero;

	@ManyToOne
	@JoinColumn(name = "CPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "CGenero", nullable = false)
	private Genero genero;

	public Pelicula_Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula_Genero(int cPelicula_Genero, Pelicula pelicula, Genero genero) {
		super();
		CPelicula_Genero = cPelicula_Genero;
		this.pelicula = pelicula;
		this.genero = genero;
	}

	public int getCPelicula_Genero() {
		return CPelicula_Genero;
	}

	public void setCPelicula_Genero(int cPelicula_Genero) {
		CPelicula_Genero = cPelicula_Genero;
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
