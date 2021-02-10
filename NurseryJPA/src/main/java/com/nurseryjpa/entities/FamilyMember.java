package com.nurseryjpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="family_members")
public class FamilyMember implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NAME_AR")
	private String nameAr;
	
	@Column(name = "NAME_EN")
	private String nameEn;
	
	@Column(name = "FACULTY_SPECIALIZATION")
    private String facultySpecialization;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
	
	@Column(name="WORK_FLAG")
	private boolean workFlag;
	
	@Column(name = "WORK_TYPE")
    private String workType;
	
	@Column(name = "EXTRA_INFO")
    private String extraInfo;
	
	@OneToOne
    @JoinColumn(name = "CONTACT_INFO_ID")
    private ContactInfo contactInfo;
	
	@OneToOne
    @JoinColumn(name = "MEMBER_TYPE_ID")
    private FamilyMemberType familyMemberType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getFacultySpecialization() {
		return facultySpecialization;
	}

	public void setFacultySpecialization(String facultySpecialization) {
		this.facultySpecialization = facultySpecialization;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isWorkFlag() {
		return workFlag;
	}

	public void setWorkFlag(boolean workFlag) {
		this.workFlag = workFlag;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public FamilyMemberType getFamilyMemberType() {
		return familyMemberType;
	}

	public void setFamilyMemberType(FamilyMemberType familyMemberType) {
		this.familyMemberType = familyMemberType;
	}

	@Override
	public String toString() {
		return "FamilyMember [id=" + id + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", facultySpecialization="
				+ facultySpecialization + ", birthDate=" + birthDate + ", workFlag=" + workFlag + ", workType="
				+ workType + ", extraInfo=" + extraInfo + "]";
	}
	
	

}
