package main.java.dtlazycoches.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import dtlazycoches.services.CocheService;
import dtlazycoches.domain.Coche;

@RunWith(MockitoJUnitRunner.class)
public class CocheServiceTestb {

    private List<Coche> myList = new ArrayList<Coche>();
    
    @Mock
    private Coche coche1;
    private CocheService prueba;
    
    @Before
    public void crear() throws IOException {

        coche1 = new Coche();
        myList = Arrays.asList(coche1);
        prueba = mock(CocheService.class);
        when(prueba.findAllCoches()).thenReturn(myList);
        when(prueba.paginar(1, 1) ).thenReturn(myList);
    }
    
    @Test
    public void testCocheService() throws IOException {
        assertEquals(prueba.findAllCoches() , myList);
        assertEquals(prueba.paginar(1, 1) , myList);
    }
    
}
    

