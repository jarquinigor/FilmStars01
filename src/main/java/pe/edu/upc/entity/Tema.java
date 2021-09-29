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
	private int cTema;
	
	@Column(name="nombreTema", nullable=false, length=30)
	private String nTema;

	public Tema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tema(int cTema, String nTema) {
		super();
		this.cTema = cTema;
		this.nTema = nTema;
	}

	public int getcTema() {
		return cTema;
	}

	public void setcTema(int cTema) {
		this.cTema = cTema;
	}

	public String getnTema() {
		return nTema;
	}

	public void setnTema(String nTema) {
		this.nTema = nTema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cTema;
		result = prime * result + ((nTema == null) ? 0 : nTema.hashCode());
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
		Tema other = (Tema) obj;
		if (cTema != other.cTema)
			return false;
		if (nTema == null) {
			if (other.nTema != null)
				return false;
		} else if (!nTema.equals(other.nTema))
			return false;
		return true;
	}
}