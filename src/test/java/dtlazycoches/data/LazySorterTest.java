 package main.java.dtlazycoches.data;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.primefaces.model.SortOrder;
import dtlazycoches.data.LazySorter;
import dtlazycoches.domain.Coche;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class LazySorterTest {

    private String sortField;
    private SortOrder sortOrder;
    private Date hoy;
    public static final int NUME = 10;
    public static final int NUMER = 20;

    @Mock
    private Coche coche1;
    @Mock
    private Coche coche2;
    private LazySorter sorter;

    @Before
    public void crear() {
        sorter = new LazySorter(sortField, sortOrder);
        sortField = "prueba";
        coche1 = new Coche();
        coche2 = new Coche();
        sorter = mock(LazySorter.class);
        when(sorter.getSortOrder()).thenReturn(sortOrder);
        when(sorter.getSortField()).thenReturn(sortField);
        when(sorter.compare(coche1, coche2)).thenReturn(NUME);
    }

    @Test
    public void testLazySorter() {
        assertTrue(sorter.getSortField() == sortField);
        assertTrue(sorter.getSortOrder() == sortOrder);
    }

    @Test
    public void testCompare() {
        assertTrue(sorter.compare(coche1, coche2) == NUME);
    }

}
