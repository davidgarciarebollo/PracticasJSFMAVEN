package main.java.datatableconmybatis.view;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import datatableconmybatis.domain.Student;
import datatableconmybatis.service.StudentService;
import datatableconmybatis.view.DataTableStudentsView;


public class DataTableStudentsViewTest {

    private List<Student> myList;
    private Student estudiante;
    private int NUM;
    private DataTableStudentsView prueba;
    private String cosa= "dataTableStudents";
    
    @Before
    public void crear() throws IOException{
        prueba= new DataTableStudentsView();
        myList= new ArrayList<Student>();
        estudiante= new Student();
        NUM=1;
        estudiante.setStudId(NUM);
        myList = Arrays.asList(estudiante);
        
    }
    
    @Test
    public void testDataTableStudentsView() throws IOException {

     
    }
    
}
