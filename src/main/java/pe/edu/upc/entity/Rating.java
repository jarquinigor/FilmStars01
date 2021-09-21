package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Rating implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CRating;

	@ManyToOne
	@JoinColumn(name = "CPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="rateRating", nullable=false)
	private int QRate;
	
	@Column(name="comentarioRating", nullable=false, length=400)
	private String TRatingComentario;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(int cRating, Pelicula pelicula, Usuario usuario, int qRate, String tRatingComentario) {
		super();
		CRating = cRating;
		this.pelicula = pelicula;
		this.usuario = usuario;
		QRate = qRate;
		TRatingComentario = tRatingComentario;
	}

	public int getCRating() {
		return CRating;
	}

	public void setCRating(int cRating) {
		CRating = cRating;
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

	public int getQRate() {
		return QRate;
	}

	public void setQRate(int qRate) {
		QRate = qRate;
	}

	public String getTRatingComentario() {
		return TRatingComentario;
	}

	public void setTRatingComentario(String tRatingComentario) {
		TRatingComentario = tRatingComentario;
	}
}
