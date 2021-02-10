package com.nurseryjpa.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the CITIES database table.
 * 
 */
@Entity
@Table(name="cities")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="CODE")
	private String code;

	/*@Column(name="NAME_AR")
	private String nameAr;

	@Column(name="NAME_EN")
	private String nameEn;*/

	@Column(name="NAME")
	private String name;
	
	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	public City() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/*public String getNameAr() {
		return this.nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}*/
	

	public Country getCountry() {
		return this.country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", code=" + code + ", name=" + name + ", country=" + country + "]";
	}


}
