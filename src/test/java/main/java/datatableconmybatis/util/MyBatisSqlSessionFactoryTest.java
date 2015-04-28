package main.java.datatableconmybatis.util;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import datatableconmybatis.util.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest extends MyBatisSqlSessionFactory{
    
    private static MyBatisSqlSessionFactoryTest prueba;
  
    
    public MyBatisSqlSessionFactoryTest() {
        super();
    }

    @Before
    public void crear(){
        prueba= new MyBatisSqlSessionFactoryTest();
        
    }
    
    @Test
    public void testMyBatisSqlSessionFactory() throws IOException{
        assertEquals(prueba.openSession()  , null );
        assertEquals(prueba.getSqlSessionFactory()  , null );
    }
    

}
