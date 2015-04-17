package dtlazycoches.data;

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
        fail(mensaje);
    }

    @Test
    public void testCompare() {
        fail(mensaje);
    }

    @Test
    public void testObject() {
        fail(mensaje);
    }

    @Test
    public void testGetClass() {
        fail(mensaje);
    }

    @Test
    public void testHashCode() {
        fail(mensaje);
    }

    @Test
    public void testEquals() {
        fail(mensaje);
    }

    @Test
    public void testClone() {
        fail(mensaje);
    }

    @Test
    public void testToString() {
        fail(mensaje);
    }

    @Test
    public void testNotify() {
        fail(mensaje);
    }

    @Test
    public void testNotifyAll() {
        fail(mensaje);
    }

    @Test
    public void testWaitLong() {
        fail(mensaje);
    }

    @Test
    public void testWaitLongInt() {
        fail(mensaje);
    }

    @Test
    public void testWait() {
        fail(mensaje);
    }

    @Test
    public void testFinalize() {
        fail(mensaje);
    }

}
