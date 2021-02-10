package com.nurseryjpa.entities;

import java.io.Serializable;

import javax.persistence.*;
import com.nurseryjpa.enums.EmployeeState;
import com.nurseryjpa.enums.Gender;
import com.nurseryjpa.enums.MaritalStatus;
import com.nurseryjpa.enums.MilitaryStatus;
import com.nurseryjpa.enums.WorkType;

import java.util.Date;

@Entity
@Table(name = "employees")

public class Employee implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME_AR")
    private String nameAr;

    @Column(name = "NAME_EN")
    private String nameEn;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "MARITAL_STATUS")
    private MaritalStatus maritalStatus;
    
  

    @Enumerated(EnumType.STRING)
    @Column(name = "MILITARY_STATUS")
    private MilitaryStatus militaryStatus;
    
    @Column(name = "FACULTY_SPECIALIZATION")
    private String facultySpecialization;
    
    @Column(name = "GRADUATION_YEAR")
    private int graduationYear;

    @Temporal(TemporalType.DATE)
    @Column(name = "HIRING_DATE")
    private Date hiringDate;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "EMPLOYEE_STATE")
    private EmployeeState state;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "WORK_TYPE")
    private WorkType workType;
    
    @Column(name = "NATIONAL_ID_NUMBER")
    private String nationalIdNumber;

    @Column(name = "PASSWD")
    private String passwd;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "TERMINATION_DATE")
    private Date terminationDate;
    
    @Column(name = "PHOTO_PATH")
    private String photoPath;
    
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_TYPE_ID")
    private EmployeeType employeeType;

    @Column(name = "EMPLOYEE_SALARY")
    private int employeeSalary;
    
    
    @OneToOne
    @JoinColumn(name = "CONTACT_INFO_ID")
    private ContactInfo contactInfo;
   
     
    public Employee()
    {
    }


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


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}


	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}


	public MilitaryStatus getMilitaryStatus() {
		return militaryStatus;
	}


	public void setMilitaryStatus(MilitaryStatus militaryStatus) {
		this.militaryStatus = militaryStatus;
	}


	public String getFacultySpecialization() {
		return facultySpecialization;
	}


	public void setFacultySpecialization(String facultySpecialization) {
		this.facultySpecialization = facultySpecialization;
	}


	public int getGraduationYear() {
		return graduationYear;
	}


	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}


	public Date getHiringDate() {
		return hiringDate;
	}


	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}


	public EmployeeState getState() {
		return state;
	}


	public void setState(EmployeeState state) {
		this.state = state;
	}


	public WorkType getWorkType() {
		return workType;
	}


	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}


	public String getNationalIdNumber() {
		return nationalIdNumber;
	}


	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public Date getTerminationDate() {
		return terminationDate;
	}


	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}


	public String getPhotoPath() {
		return photoPath;
	}


	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}


	public EmployeeType getEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	
	public int getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}


	public Employee(int id, Date birthDate, int code, String facultySpecialization, Gender gender, int graduationYear, Date hiringDate, MaritalStatus maritalStatus, MilitaryStatus militaryStatus, 
			String nameAr, String nameEn, String nationalIdNumber, String passwd, String photoPath, EmployeeState state, boolean workAsPartTime, EmployeeType employeeType, ContactInfo contactInfo, WorkType workType)
    {
        this.id = id;
        this.birthDate = birthDate;
        this.facultySpecialization = facultySpecialization;
        this.gender = gender;
        this.graduationYear = graduationYear;
        this.hiringDate = hiringDate;
        this.maritalStatus = maritalStatus;
        this.militaryStatus = militaryStatus;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.nationalIdNumber = nationalIdNumber;
        this.passwd = passwd;
        this.photoPath = photoPath;
        this.workType = workType;
        this.employeeType = employeeType;
        this.contactInfo = contactInfo;
    }


	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritalStatus=" + maritalStatus + ", militaryStatus=" + militaryStatus
				+ ", facultySpecialization=" + facultySpecialization + ", graduationYear=" + graduationYear
				+ ", hiringDate=" + hiringDate + ", state=" + state + ", workType=" + workType + ", nationalIdNumber="
				+ nationalIdNumber + ", passwd=" + passwd + ", terminationDate=" + terminationDate + ", photoPath="
				+ photoPath + ", employeeType=" + employeeType + ", employeeSalary=" + employeeSalary + ", contactInfo="
				+ contactInfo + "]";
	}

	
	
}
