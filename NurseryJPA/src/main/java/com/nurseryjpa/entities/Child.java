package com.nurseryjpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Child implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "CHILD_NAME_AR")
	private String childNameAr;
	
	@Column(name = "CHILD_NAME_EN")
	private String childNameEn;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
	private Date birthDate;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "JOIN_DATE")
	private Date joinDate;
	
	@Column(name = "PHOTO_PATH")
	private String photoPath;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "TERMINATION_DATE")
	private Date terminationDate;	

    @Column(name = "FIRST_LANGUAGE")
	private String firstLanguage;

    @Column(name = "CONCERNS")
	private String concerns;
	
	@ManyToOne
    @JoinColumn(name = "CLASS_ID")
    private Class childClass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChildNameEn() {
		return childNameEn;
	}

	public void setChildNameEn(String childNameEn) {
		this.childNameEn = childNameEn;
	}

	public String getChildNameAr() {
		return childNameAr;
	}

	public void setChildNameAr(String childNameAr) {
		this.childNameAr = childNameAr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getFirstLanguage() {
		return firstLanguage;
	}

	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}

	public String getConcerns() {
		return concerns;
	}

	public void setConcerns(String concerns) {
		this.concerns = concerns;
	}

	public Class getChildClass() {
		return childClass;
	}

	public void setChildClass(Class childClass) {
		this.childClass = childClass;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", childNameAr=" + childNameAr + ", childNameEn=" + childNameEn + ", gender="
				+ gender + ", birthDate=" + birthDate + ", joinDate=" + joinDate + ", photoPath=" + photoPath
				+ ", terminationDate=" + terminationDate + ", firstLanguage=" + firstLanguage + ", concerns=" + concerns
				+ ", childClass=" + childClass + "]";
	}


	
}
