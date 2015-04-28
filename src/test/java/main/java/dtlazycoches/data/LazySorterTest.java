package main.java.dtlazycoches.data;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.SortOrder;
import dtlazycoches.data.LazySorter;
import dtlazycoches.domain.Coche;

public class LazySorterTest {

    
    private String sortField;
    private SortOrder sortOrder;
    public static final int NUME = 0;
    public static final int NUMER = 1;
    public static final int NUMERO = 2;
    private Coche coche1;
    private Coche coche2;
    private LazySorter sorter;

    @Before
    public void crear() {
        sortField = "prueba";
        coche1 = new Coche();
        coche2 = new Coche();
        coche1.setCocheid(NUMER);
        coche2.setCocheid(NUMERO);
        sorter = new LazySorter(sortField, sortOrder);
        sorter.setSortField("prueba2");
        sorter.setSortOrder(sortOrder);
    }

    @Test
    public void testLazySorter() {
        assertEquals(sorter.getSortField() , "prueba2");
        assertEquals(sorter.getSortOrder() ,sortOrder);
    }

    @Test
    public void testCompare() {
        assertEquals(sorter.compare(coche1, coche2) , NUME);
    }
    
    
    
}
