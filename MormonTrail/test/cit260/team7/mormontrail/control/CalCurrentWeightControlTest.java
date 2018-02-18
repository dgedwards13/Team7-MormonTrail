/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shaw-Laptop
 */
public class CalCurrentWeightControlTest {
    
    public CalCurrentWeightControlTest() {
    }

    /**
     * Test of calCurrentWeight method, of class CalCurrentWeightControl.
     */
    @Test
    public void testCalCurrentWeight() {
        System.out.println("\tTest case 1");
        double wagonSize = 1000;
        double expResult = 54;
        double result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

System.out.println("\tTest case 2");
        wagonSize = 50;
        expResult = -1;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

System.out.println("\tTest case 3");
        wagonSize = 54;
        expResult = 54;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

System.out.println("\tTest case 4");
        wagonSize = 30;
        expResult = -1;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
