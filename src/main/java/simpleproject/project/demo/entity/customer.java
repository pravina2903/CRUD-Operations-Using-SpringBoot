package simpleproject.project.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {
	
	@Id
	private int id;
	private String name;
	private String mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public customer(int id, String name, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
