package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tema")
public class Tema implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTema;
	
	@Column(name="nombreTema", nullable=false, length=30)
	private String NTema;

	public Tema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tema(int cTema, String nTema) {
		super();
		CTema = cTema;
		NTema = nTema;
	}

	public int getCTema() {
		return CTema;
	}

	public void setCTema(int cTema) {
		CTema = cTema;
	}

	public String getNTema() {
		return NTema;
	}

	public void setNTema(String nTema) {
		NTema = nTema;
	}
}