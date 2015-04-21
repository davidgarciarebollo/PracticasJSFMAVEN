package main.java.dtlazycoches.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.SortOrder;

import dtlazycoches.data.LazySorter;
import dtlazycoches.domain.Coche;

public class LazySorterTest {
    private LazySorter sorter;
    private String sortField;
    private SortOrder sortOrder;
    private Coche coche1;
    private Coche coche2;
    private String mensaje = "Not yet implemented";
    
    @Before
    public void crear() {
        sorter = new LazySorter(sortField, sortOrder);
        coche1 = new Coche();
        coche2 = new Coche();

    }
    
    @Test
    public void testLazySorter() {
        LazySorter prueba=new LazySorter(sortField, sortOrder);
        assertTrue (sorter.getSortField() == prueba.getSortField());
        assertTrue (sorter.getSortOrder() == prueba.getSortOrder());
    }

    @Test
    public void testCompare() {
        sorter.compare(coche1,coche2); 
    }

   

}
