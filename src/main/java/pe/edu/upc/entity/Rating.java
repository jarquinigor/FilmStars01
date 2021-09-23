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
@Table(name="Rating")
public class Rating implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cRating;

	@ManyToOne
	@JoinColumn(name = "cPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="rateRating", nullable=false)
	private int qRate;
	
	@Column(name="comentarioRating", nullable=false, length=400)
	private String tRatingComentario;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(int cRating, Pelicula pelicula, Usuario usuario, int qRate, String tRatingComentario) {
		super();
		this.cRating = cRating;
		this.pelicula = pelicula;
		this.usuario = usuario;
		this.qRate = qRate;
		this.tRatingComentario = tRatingComentario;
	}

	public int getcRating() {
		return cRating;
	}

	public void setcRating(int cRating) {
		this.cRating = cRating;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getqRate() {
		return qRate;
	}

	public void setqRate(int qRate) {
		this.qRate = qRate;
	}

	public String gettRatingComentario() {
		return tRatingComentario;
	}

	public void settRatingComentario(String tRatingComentario) {
		this.tRatingComentario = tRatingComentario;
	}
}
