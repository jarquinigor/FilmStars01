package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TextoCritica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTextoCritica;

	@ManyToOne
	@JoinColumn(name = "CPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "CCritico", nullable = false)
	private Genero critico;
	
	@Column(name="textoCritica", nullable=false, length=400)
	private String TCritica;

	public TextoCritica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextoCritica(int cTextoCritica, Pelicula pelicula, Genero critico, String tCritica) {
		super();
		CTextoCritica = cTextoCritica;
		this.pelicula = pelicula;
		this.critico = critico;
		TCritica = tCritica;
	}

	public int getCTextoCritica() {
		return CTextoCritica;
	}

	public void setCTextoCritica(int cTextoCritica) {
		CTextoCritica = cTextoCritica;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Genero getCritico() {
		return critico;
	}

	public void setCritico(Genero critico) {
		this.critico = critico;
	}

	public String getTCritica() {
		return TCritica;
	}

	public void setTCritica(String tCritica) {
		TCritica = tCritica;
	}
}