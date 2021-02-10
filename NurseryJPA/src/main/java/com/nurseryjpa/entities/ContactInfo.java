package com.nurseryjpa.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="contacts_info")
public class ContactInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="TEL")
	private String tel;
	
	@Column(name="MOB1")
	private String mob1;
	
	@Column(name="MOB2")
	private String mob2;
	
	@Column(name="ADDRESS")
	private String address;



	@Column(name="LANDLINE")
	private String landline;
	
	@Column(name="EMAIL")
	private String email;
   
	public ContactInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandline() {
		return this.landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob1() {
		return this.mob1;
	}

	public void setMob1(String mob1) {
		this.mob1 = mob1;
	}

	public String getMob2() {
		return this.mob2;
	}

	public void setMob2(String mob2) {
		this.mob2 = mob2;
	}
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
@Override
public int hashCode()
{
	// TODO Auto-generated method stub
	return this.address.hashCode()*7+this.tel.hashCode()*5+this.mob1.hashCode()*11+this.email.hashCode()*13;
}




}