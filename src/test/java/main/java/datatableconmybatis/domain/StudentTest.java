package main.java.datatableconmybatis.domain;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import datatableconmybatis.domain.Student;

public class StudentTest {

    private Integer studId;
    private String name;
    private String email;
    private Integer studIdb;
    private String nameb;
    private String emailb;
    private Date dob;
    private Student estudiante;
    
    @Before
    public void crear() {
       
        studId=1;
        name="prueba";
        email="prueba@prueba";
        studIdb=2;
        nameb="pruebab";
        emailb="pruebab@pruebab";
        estudiante = new Student(studId, name, email, dob);
        
    }

    @Test
    public void testStudent() {

        assertEquals(estudiante.getStudId() , studId);
        assertEquals(estudiante.getName() , name);
        assertEquals(estudiante.getEmail() , email);
        assertEquals(estudiante.getDob() , dob);
        estudiante.setStudId(studIdb);
        estudiante.setName(nameb);
        estudiante.setEmail(emailb);
        estudiante.setDob(dob);
        assertEquals(estudiante.getStudId() , studIdb);
        assertEquals(estudiante.getName() , nameb);
        assertEquals(estudiante.getEmail() , emailb);
        assertEquals(estudiante.getDob() , dob);
              
    }
    
}
