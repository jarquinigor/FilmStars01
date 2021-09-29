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
@Table(name="PeliculaActor")
public class PeliculaActor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cPeliculaActor;

	@ManyToOne
	@JoinColumn(name = "cPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "cActor", nullable = false)
	private Actor actor;
	
	@Column(name="nombrePersonaje", nullable = false, length=60)
	private String nPersonaje;

	public PeliculaActor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeliculaActor(int cPeliculaActor, Pelicula pelicula, Actor actor, String nPersonaje) {
		super();
		this.cPeliculaActor = cPeliculaActor;
		this.pelicula = pelicula;
		this.actor = actor;
		this.nPersonaje = nPersonaje;
	}

	public int getcPeliculaActor() {
		return cPeliculaActor;
	}

	public void setcPeliculaActor(int cPeliculaActor) {
		this.cPeliculaActor = cPeliculaActor;
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

	public String getnPersonaje() {
		return nPersonaje;
	}

	public void setnPersonaje(String nPersonaje) {
		this.nPersonaje = nPersonaje;
	}
}
