package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Critico")
public class Critico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cCritico;
	
	@Column(name="nombreCritico", nullable=false, length=60)
	private String nCritico;

	public Critico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Critico(int cCritico, String nCritico) {
		super();
		this.cCritico = cCritico;
		this.nCritico = nCritico;
	}

	public int getcCritico() {
		return cCritico;
	}

	public void setcCritico(int cCritico) {
		this.cCritico = cCritico;
	}

	public String getnCritico() {
		return nCritico;
	}

	public void setnCritico(String nCritico) {
		this.nCritico = nCritico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cCritico;
		result = prime * result + ((nCritico == null) ? 0 : nCritico.hashCode());
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
		Critico other = (Critico) obj;
		if (cCritico != other.cCritico)
			return false;
		if (nCritico == null) {
			if (other.nCritico != null)
				return false;
		} else if (!nCritico.equals(other.nCritico))
			return false;
		return true;
	}
}
