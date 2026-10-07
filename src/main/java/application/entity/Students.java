package application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slno;
	
	private String name;
	
	private String afidCode;

	public int getSlno() {
		return slno;
	}

	public String getName() {
		return name;
	}

	public String getAfidCode() {
		return afidCode;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAfidCode(String afidCode) {
		this.afidCode = afidCode;
	}
	
	
}
