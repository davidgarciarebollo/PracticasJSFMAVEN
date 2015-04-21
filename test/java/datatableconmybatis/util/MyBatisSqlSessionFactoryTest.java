package java.datatableconmybatis.util;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import datatableconmybatis.util.MyBatisSqlSessionFactory;
import dtlazycoches.domain.Coche;

public class MyBatisSqlSessionFactoryTest {

    private MyBatisSqlSessionFactory factory;
    
    @Before
    public void crear() {
        factory = new  MyBatisSqlSessionFactory();

    }
    
    @Test
    public void testgetSqlSessionFactory() throws IOException{
        assertTrue(factory.getSqlSessionFactory() == factory);
        
    }
    
    @Test
    public void openSession() throws IOException{
        assertTrue(factory.openSession() == factory.getSqlSessionFactory().openSession());
        
    }
}
