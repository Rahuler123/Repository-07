package com.mobileApi;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private long Phone1;
	private long Phone2;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone1() {
		return Phone1;
	}
	public void setPhone1(long phone1) {
		Phone1 = phone1;
	}
	public long getPhone2() {
		return Phone2;
	}
	public void setPhone2(long phone2) {
		Phone2 = phone2;
	}
	
	
	@Override
	public String toString() {
		return "mobile [id=" + id + ", name=" + name + ", Phone1=" + Phone1 + ", Phone2=" + Phone2 + "]";
	}
	
	
	
	
	
}
