package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Director")
public class Director implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CDirector;
	
	@Column(name="nombreDirector", nullable=false, length=60)
	private String NDirector;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(int cDirector, String nDirector) {
		super();
		CDirector = cDirector;
		NDirector = nDirector;
	}

	public int getCDirector() {
		return CDirector;
	}

	public void setCDirector(int cDirector) {
		CDirector = cDirector;
	}

	public String getNDirector() {
		return NDirector;
	}

	public void setNDirector(String nDirector) {
		NDirector = nDirector;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CDirector;
		result = prime * result + ((NDirector == null) ? 0 : NDirector.hashCode());
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
		Director other = (Director) obj;
		if (CDirector != other.CDirector)
			return false;
		if (NDirector == null) {
			if (other.NDirector != null)
				return false;
		} else if (!NDirector.equals(other.NDirector))
			return false;
		return true;
	}
}
