package main.java.dtlazycoches.view;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dtlazycoches.view.LOGGER;;

public class LOGGERTest extends LOGGER{
    
    private static LOGGER prueba;
    
    public LOGGERTest(){
        
        super();
    }
    
    @Before
    public void crear(){
        prueba= new LOGGERTest();
        
    }
    
    @Test
    public void testlog(){
        prueba.log();
        assertEquals(prueba.a,1);
        
    }

}
