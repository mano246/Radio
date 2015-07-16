/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.awt.event.ActionEvent;
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
public class BotonIniFavTest {
    
    public BotonIniFavTest() {
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
     * Test of defBoton method, of class BotonIniFav.
     */
    @Test
    public void testDefBoton() {
        System.out.println("defBoton");
        String frecuencia = "";
        double estacion = 0.0;
        int boton = 0;
        BotonIniFav instance = new BotonIniFav();
        instance.defBoton(frecuencia, estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoFavorito method, of class BotonIniFav.
     */
    @Test
    public void testNuevoFavorito() {
        System.out.println("nuevoFavorito");
        String frecuencia = "";
        double estacion = 0.0;
        int boton = 0;
        BotonIniFav instance = new BotonIniFav();
        instance.nuevoFavorito(frecuencia, estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verFavorito method, of class BotonIniFav.
     */
    @Test
    public void testVerFavorito() {
        System.out.println("verFavorito");
        String frecuencia = "";
        int boton = 0;
        BotonIniFav instance = new BotonIniFav();
        instance.verFavorito(frecuencia, boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIniciarFav method, of class BotonIniFav.
     */
    @Test
    public void testIsIniciarFav() {
        System.out.println("isIniciarFav");
        BotonIniFav instance = new BotonIniFav();
        boolean expResult = false;
        boolean result = instance.isIniciarFav();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIniciarFav method, of class BotonIniFav.
     */
    @Test
    public void testSetIniciarFav() {
        System.out.println("setIniciarFav");
        boolean iniciarFav = false;
        BotonIniFav instance = new BotonIniFav();
        instance.setIniciarFav(iniciarFav);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionFM method, of class BotonIniFav.
     */
    @Test
    public void testGetEstacionFM() {
        System.out.println("getEstacionFM");
        BotonIniFav instance = new BotonIniFav();
        double[] expResult = null;
        double[] result = instance.getEstacionFM();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionAM method, of class BotonIniFav.
     */
    @Test
    public void testGetEstacionAM() {
        System.out.println("getEstacionAM");
        BotonIniFav instance = new BotonIniFav();
        double[] expResult = null;
        double[] result = instance.getEstacionAM();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class BotonIniFav.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        BotonIniFav instance = new BotonIniFav();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
