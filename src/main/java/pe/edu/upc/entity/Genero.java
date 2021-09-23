package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
public class Genero implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cGenero;
	
	@Column(name="nombreGenero", nullable=false, length=30)
	private String nGenero;

	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(int cGenero, String nGenero) {
		super();
		this.cGenero = cGenero;
		this.nGenero = nGenero;
	}

	public int getcGenero() {
		return cGenero;
	}

	public void setcGenero(int cGenero) {
		this.cGenero = cGenero;
	}

	public String getnGenero() {
		return nGenero;
	}

	public void setnGenero(String nGenero) {
		this.nGenero = nGenero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cGenero;
		result = prime * result + ((nGenero == null) ? 0 : nGenero.hashCode());
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
		Genero other = (Genero) obj;
		if (cGenero != other.cGenero)
			return false;
		if (nGenero == null) {
			if (other.nGenero != null)
				return false;
		} else if (!nGenero.equals(other.nGenero))
			return false;
		return true;
	}
}