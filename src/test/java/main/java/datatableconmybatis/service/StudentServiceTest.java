package main.java.datatableconmybatis.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datatableconmybatis.domain.Student;
import datatableconmybatis.service.StudentService;


public class StudentServiceTest {

    private List<Student> myList;
    private Student estudiante;
    private int NUM;
    private StudentService prueba;
    
    @Before
    public void crear(){
        prueba= new StudentService();
        myList= new ArrayList<Student>();
        estudiante= new Student();
        NUM=1;
        estudiante.setStudId(NUM);
        myList = Arrays.asList(estudiante);
        
    }
    
    @Test
    public void testCocheService() throws IOException {
     
    }
    
    
}
