package dtlazycoches.data;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.SortOrder;
import static org.mockito.Mockito.when;
import dtlazycoches.data.LazySorter;
import dtlazycoches.domain.Coche;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class LazySorterTest {

    private String sortField;
    private SortOrder sortOrder;
    private Date hoy;
    public static final int NUME=10;
    public static final int NUMER=20;
    @InjectMocks
    private LazySorter sorter;
    @Mock
    private Coche coche1;
    @Mock
    private Coche coche2;
    @Mock
    LazySorter prueba = new LazySorter(sortField, sortOrder);

    @Before
    public void crear() {
        sorter = new LazySorter(sortField, sortOrder);
        coche1 = new Coche();
        coche2 = new Coche();
        coche1.setCocheid(NUME);
        coche1.setModelo("modelo1");
        coche1.setFfab(hoy);
        coche1.setMarca("marca1");
        coche2.setCocheid(NUMER);
        coche2.setModelo("modelo2");
        coche2.setFfab(hoy);
        coche2.setMarca("marca2");
        when(sorter.compare(coche1, coche2)).thenReturn(NUME);
        when(sorter.getSortField()).thenReturn(prueba.getSortField());
        when(sorter.getSortOrder()).thenReturn(prueba.getSortOrder());

    }

    @Test
    public void testLazySorter() {

        assertTrue(sorter.getSortField() == prueba.getSortField());
        assertTrue(sorter.getSortOrder() == prueba.getSortOrder());
    }

    @Test
    public void testCompare() {
        assertTrue(sorter.compare(coche1, coche2) == NUME);
    }

}
