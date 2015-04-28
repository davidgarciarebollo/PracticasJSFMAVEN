package main.java.dtlazycoches.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;
import dtlazycoches.data.LazyCocheDataModel;

public class LazyCocheDataModelTest {

    private Date hoy;
    public static final int NUM=10;
    private Coche coche1;
    private LazyCocheDataModel prueba;
    private LazyCocheDataModel pruebab;
    private List<Coche> myList;
    public static final int NUMB=1;
    public static final int NUMC=1;

    @Before
    public void crear() {

        coche1 = new Coche();
        coche1.setCocheid(1);
        myList = new ArrayList<Coche>();
        myList = Arrays.asList(coche1);
        prueba = new LazyCocheDataModel(myList);
        pruebab = new LazyCocheDataModel();
    }

    @Test
    public void testgetRowData() {
        assertNull(prueba.getRowData("1"));

    }

    @Test
    public void testgetRowKey() {
        assertNotNull(prueba.getRowKey(coche1));
    }
    
    


}
