/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.awt.event.MouseEvent;
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
public class BotonFavoritosTest {
    
    public BotonFavoritosTest() {
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
     * Test of getFrecuencia method, of class BotonFavoritos.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        BotonFavoritos instance = null;
        String expResult = "";
        String result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class BotonFavoritos.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        String frecuencia = "";
        BotonFavoritos instance = null;
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class BotonFavoritos.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        BotonFavoritos instance = null;
        float expResult = 0.0F;
        float result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class BotonFavoritos.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        float estacion = 0.0F;
        BotonFavoritos instance = null;
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class BotonFavoritos.
     */
   
    
}
