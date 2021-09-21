package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Pelicula_Actor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPelicula_Actor;

	@ManyToOne
	@JoinColumn(name = "CPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "CActor", nullable = false)
	private Actor actor;
	
	@Column(name="nombrePersonaje", nullable=false, length=60)
	private String NPersonaje;

	public Pelicula_Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula_Actor(int cPelicula_Actor, Pelicula pelicula, Actor actor, String nPersonaje) {
		super();
		CPelicula_Actor = cPelicula_Actor;
		this.pelicula = pelicula;
		this.actor = actor;
		NPersonaje = nPersonaje;
	}

	public int getCPelicula_Actor() {
		return CPelicula_Actor;
	}

	public void setCPelicula_Actor(int cPelicula_Actor) {
		CPelicula_Actor = cPelicula_Actor;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public String getNPersonaje() {
		return NPersonaje;
	}

	public void setNPersonaje(String nPersonaje) {
		NPersonaje = nPersonaje;
	}
}
