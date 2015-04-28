package main.java.dtlazycoches.data;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import dtlazycoches.data.MyOwnRuntimeException;

public class MyOwnRuntimeExceptionTest {

    private MyOwnRuntimeException prueba;
    
    @Before
    public void crear() {
        prueba = new MyOwnRuntimeException();
    }

    @Test
    public void testMyOwnRuntimeException() {
        assertNull(prueba.myOwnRuntimeException()); 
    }

}
