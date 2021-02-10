package com.nurseryjpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classes")
public class Class implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "CLASS_NAME_AR")
	private String classNameAr;
	
	@Column(name = "CLASS_NAME_EN")
	private String classNameEn;
	
	@Column(name = "CLASS_CODE")
	private String classCode;

    @Column(name = "AGE_RANGE_BEGIN")
	private float ageRangeBegin;
    
    @Column(name = "AGE_RANGE_END")
   	private float ageRangeEnd;
    
	
    @Column(name = "ROOM_NUMBER")
	private int roomNumber;
	
	@OneToMany(mappedBy="childClass")
    private List<Child> children;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassNameAr() {
		return classNameAr;
	}

	public void setClassNameAr(String classNameAr) {
		this.classNameAr = classNameAr;
	}

	public String getClassNameEn() {
		return classNameEn;
	}

	public void setClassNameEn(String classNameEn) {
		this.classNameEn = classNameEn;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public float getAgeRangeBegin() {
		return ageRangeBegin;
	}

	public void setAgeRangeBegin(float ageRangeBegin) {
		this.ageRangeBegin = ageRangeBegin;
	}

	public float getAgeRangeEnd() {
		return ageRangeEnd;
	}

	public void setAgeRangeEnd(float ageRangeEnd) {
		this.ageRangeEnd = ageRangeEnd;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", classNameAr=" + classNameAr + ", classNameEn=" + classNameEn + ", classCode="
				+ classCode + ", ageRangeBegin=" + ageRangeBegin + ", ageRangeEnd=" + ageRangeEnd + ", roomNumber="
				+ roomNumber + ", children=" + children + "]";
	}
}
