package main.java.dtlazycoches.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import dtlazycoches.domain.Coche;

public class CocheTest {

    private Coche coche1;
    private Date hoy;
    public static final int NUM=10;

    @Before
    public void crear() {
        coche1 = new Coche();
        coche1.setCocheid(NUM);
        coche1.setModelo("modelo1");
        coche1.setFfab(hoy);
        coche1.setMarca("marca1");

    }

    @Test
    public void testCoche() {

        assertTrue(coche1.getCocheid() == NUM);
        assertEquals(coche1.getModelo() , "modelo1");
        assertEquals(coche1.getFfab() , hoy);
        assertEquals(coche1.getMarca() , "marca1");
        
    }

}
