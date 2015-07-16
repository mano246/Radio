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
public class BotonOnOffTest {
    
    public BotonOnOffTest() {
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
     * Test of encender method, of class BotonOnOff.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        BotonOnOff instance = new BotonOnOff();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class BotonOnOff.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        BotonOnOff instance = new BotonOnOff();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class BotonOnOff.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        BotonOnOff instance = new BotonOnOff();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
