package dtlazycoches.data;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import dtlazycoches.domain.Coche;
import dtlazycoches.data.LazyCocheDataModel;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class LazyCocheDataModelTest {


    private List<Coche> coches;
    private Date hoy;
    public static final int NUM=10;
    @InjectMocks
    private LazyCocheDataModel prueba;
    @Mock
    private Coche coche1;

    @Before
    public void crear() {

        coche1 = new Coche();
        coche1.setCocheid(NUM);
        coche1.setModelo("modelo1");
        coche1.setFfab(hoy);
        coche1.setMarca("marca1");
        coches = new ArrayList<Coche>();
        coches.add(coche1);
        prueba = new LazyCocheDataModel(coches);
        when(prueba.getRowData("10")).thenReturn(coche1);
        when(prueba.getRowKey(coche1)).thenReturn("10");
    }

    @Test
    public void testgetRowData() {

        assertTrue(prueba.getRowData("10") == coche1);

    }

    @Test
    public void testgetRowKey() {
        assertTrue(prueba.getRowKey(coche1) == "10");
    }

}
