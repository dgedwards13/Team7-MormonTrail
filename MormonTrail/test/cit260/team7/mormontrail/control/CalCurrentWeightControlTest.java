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
        double invItemWeight =0;
        double wagonSize = 1000;
        double expResult = 40;
        double result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

//System.out.println("\tTest case 2");
//         invItemWeight = 800;
//         wagonSize = 1500;
//         expResult = 800;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//
//System.out.println("\tTest case 3");
//         invItemWeight = 500;
//         wagonSize = 2000;
//         expResult = 500;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//
//System.out.println("\tTest case 4");
//         invItemWeight = -3;
//         wagonSize = 1000;
//         expResult = -1;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//
//System.out.println("\tTest case 5");
//         invItemWeight = 2000;
//         wagonSize = 1500;
//         expResult = -1;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//
//System.out.println("\tTest case 6");
//         invItemWeight = 2031;
//         wagonSize = 2000;
//         expResult = -1;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//
//System.out.println("\tTest case 7");
//         invItemWeight = 0;
//         wagonSize = 0;
//         expResult = 0;
//         result = CalCurrentWeightControl.calCurrentWeight(invItemWeight, wagonSize);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
    }
    
}
