package main.java.dtlazycoches.data;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import dtlazycoches.domain.Coche;
import dtlazycoches.data.LazyCocheDataModel;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class LazyCocheDataModelTest {


  
    private Date hoy;
    public static final int NUM=10;
    @Mock
    private Coche coche1;
    private LazyCocheDataModel prueba;

    @Before
    public void crear() {

        coche1 = new Coche();
        prueba = mock(LazyCocheDataModel.class);
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
