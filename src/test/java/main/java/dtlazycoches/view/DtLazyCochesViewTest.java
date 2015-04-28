package main.java.dtlazycoches.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dtlazycoches.domain.Coche;
import dtlazycoches.services.CocheService;
import dtlazycoches.view.DtLazyCochesView;

import org.junit.Before;
import org.junit.Test;

public class DtLazyCochesViewTest {

    private DtLazyCochesView prueba;
    private Coche coche1;
    private CocheService cocheService;
    private List<Coche> myList;
    
    @Before
    public void crear() throws IOException {

        coche1 = new Coche();
        coche1.setCocheid(1);
        myList = new ArrayList<Coche>();
        myList = Arrays.asList(coche1);
        prueba = new DtLazyCochesView();
        prueba.setCoche(coche1);
        cocheService = new CocheService();
        prueba.setCocheService(cocheService);
        prueba.setSelectedCoche(coche1);
        prueba.setCoches(myList);
    }
    
    @Test
    public void testCocheService() throws IOException {
        assertEquals(prueba.getCoche(), coche1);
        assertEquals(prueba.getSelectedCoche(), coche1);
        assertEquals(prueba.getCocheService(), cocheService);
        assertEquals(prueba.getCoches(), myList);
        assertEquals(prueba.insertCoche(), "dtLazyCoches");
    }
}
