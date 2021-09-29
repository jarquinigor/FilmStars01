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
	private int cDirector;
	
	@Column(name="nombreDirector", nullable=false, length=60)
	private String nDirector;

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(int cDirector, String nDirector) {
		super();
		this.cDirector = cDirector;
		this.nDirector = nDirector;
	}

	public int getcDirector() {
		return cDirector;
	}

	public void setcDirector(int cDirector) {
		this.cDirector = cDirector;
	}

	public String getnDirector() {
		return nDirector;
	}

	public void setnDirector(String nDirector) {
		this.nDirector = nDirector;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cDirector;
		result = prime * result + ((nDirector == null) ? 0 : nDirector.hashCode());
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
		if (cDirector != other.cDirector)
			return false;
		if (nDirector == null) {
			if (other.nDirector != null)
				return false;
		} else if (!nDirector.equals(other.nDirector))
			return false;
		return true;
	}
}
