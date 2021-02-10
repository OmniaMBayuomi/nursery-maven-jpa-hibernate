package com.nurseryjpa;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.nurseryjpa.entities.*;
import com.nurseryjpa.enums.EmployeeState;
import com.nurseryjpa.enums.Gender;
import com.nurseryjpa.enums.MaritalStatus;
import com.nurseryjpa.enums.MilitaryStatus;
import com.nurseryjpa.enums.WorkType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
      	EntityManager em = emf.createEntityManager();
      	
      	
      	EmployeeType empType = em.find(EmployeeType.class, 4);
      	System.out.println(empType);
        
        Employee emp = new Employee();
        emp.setNameAr("توران وحيد");
        emp.setNameEn("Nouran Wahid");
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1989);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        emp.setBirthDate(cal.getTime());
        
        emp.setEmployeeSalary(5000);
        emp.setEmployeeType(empType);
        emp.setGender(Gender.FEMALE);
        emp.setGraduationYear(2010);
        
        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        emp.setHiringDate(cal.getTime());
        
        emp.setMaritalStatus(MaritalStatus.MARRIED);
        emp.setState(EmployeeState.INACTIVE);
        emp.setWorkType(WorkType.PART_TIME);
        emp.setPasswd("password");

        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }
}
