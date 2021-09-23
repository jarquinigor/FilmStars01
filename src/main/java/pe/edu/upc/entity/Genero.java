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
	private int CGenero;
	
	@Column(name="nombreGenero", nullable=false, length=30)
	private String NGenero;

	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(int cGenero, String nGenero) {
		super();
		CGenero = cGenero;
		NGenero = nGenero;
	}

	public int getCGenero() {
		return CGenero;
	}

	public void setCGenero(int cGenero) {
		CGenero = cGenero;
	}

	public String getNGenero() {
		return NGenero;
	}

	public void setNGenero(String nGenero) {
		NGenero = nGenero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CGenero;
		result = prime * result + ((NGenero == null) ? 0 : NGenero.hashCode());
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
		if (CGenero != other.CGenero)
			return false;
		if (NGenero == null) {
			if (other.NGenero != null)
				return false;
		} else if (!NGenero.equals(other.NGenero))
			return false;
		return true;
	}
}