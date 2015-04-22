package dtlazycoches.domain;

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
        coche1.setCocheid(10);
        coche1.setModelo("modelo1");
        coche1.setFfab(hoy);
        coche1.setMarca("marca1");

    }

    @Test
    public void testCoche() {

        assertTrue(coche1.getCocheid() == NUM);
        assertTrue(coche1.getModelo() == "modelo1");
        assertTrue(coche1.getFfab() == hoy);
        assertTrue(coche1.getMarca() == "marca1");
    }

}
