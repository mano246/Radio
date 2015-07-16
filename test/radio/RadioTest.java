/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manolo
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Radio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Radio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class Radio.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        String frecuencia = "";
        Radio instance = new Radio();
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class Radio.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class Radio.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 0.0;
        Radio instance = new Radio();
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Radio.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Radio.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Radio instance = new Radio();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
