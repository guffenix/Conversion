/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion.multiples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Labs-DECC
 */
public class DecameterMeterTest {
    
    public DecameterMeterTest() {
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
     * Test of calculate method, of class DecameterMeter.
     */
    @Test
    public void testCalculate() {
        //Referente a los submúltiplos:   1 m = 10 dm
        System.out.println("calculate");
        DecameterMeter instance = new DecameterMeter(5f);
        Float expResult = 10*5f;
        Float result = instance.calculate();
        assertEquals(expResult, result);
    }

}
