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
     * Test of establecerFavorito method, of class BotonFavoritos.
     */
    @Test
    public void testEstablecerFavorito() {
        System.out.println("establecerFavorito");
        BotonFavoritos instance = new BotonFavoritos();
        instance.establecerFavorito();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarFavorito method, of class BotonFavoritos.
     */
    @Test
    public void testSeleccionarFavorito() {
        System.out.println("seleccionarFavorito");
        BotonFavoritos instance = new BotonFavoritos();
        instance.seleccionarFavorito();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
