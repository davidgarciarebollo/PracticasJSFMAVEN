package main.java.dtlazycoches.services;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import dtlazycoches.domain.Coche;
import dtlazycoches.services.CocheService;

public class CocheServiceTest {

 private List<Coche> myList = new ArrayList<Coche>();
    
 
    private Coche coche1;
    private CocheService prueba;
    
    @Before
    public void crear() throws IOException {

        coche1 = new Coche();
        myList = Arrays.asList(coche1);
        prueba = new CocheService();
       
    }
    
    @Test
    public void testCocheService() throws IOException {
       
    }
    
}
