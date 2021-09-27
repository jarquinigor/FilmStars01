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
@Table(name="TextoCritica")
public class TextoCritica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cTextoCritica;

	@ManyToOne
	@JoinColumn(name = "cPelicula", nullable = false)
	private Pelicula pelicula;

	@ManyToOne
	@JoinColumn(name = "cCritico", nullable = false)
	private Critico critico;
	
	@Column(name="textoCritica", nullable=false, length=400)
	private String tCritica;

	public TextoCritica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextoCritica(int cTextoCritica, Pelicula pelicula, Critico critico, String tCritica) {
		super();
		this.cTextoCritica = cTextoCritica;
		this.pelicula = pelicula;
		this.critico = critico;
		this.tCritica = tCritica;
	}

	public int getcTextoCritica() {
		return cTextoCritica;
	}

	public void setcTextoCritica(int cTextoCritica) {
		this.cTextoCritica = cTextoCritica;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Critico getCritico() {
		return critico;
	}

	public void setCritico(Critico critico) {
		this.critico = critico;
	}

	public String gettCritica() {
		return tCritica;
	}

	public void settCritica(String tCritica) {
		this.tCritica = tCritica;
	}
}