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
 * @author Savannah
 */
public class HarvestAndHunterControlTest {
    
    public HarvestAndHunterControlTest() {
    }

    /**
     * Test of calCarryingCapacity method, of class HarvestAndHunterControl.
     */
    @Test
    public void testCalCarryingCapacity() {
        System.out.println("\tTest case 1");
        double wagonCapacity = 1500;
        double currentWeight = 1000;
        double huntGatheredItem = 1200;
        double expResult = 500;
        double result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("\tTest case 2");
        wagonCapacity = 1000;
        currentWeight = 1000;
        huntGatheredItem = 1500;
        expResult = 0;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 3");
        wagonCapacity = 1500;
        currentWeight = 2000;
        huntGatheredItem = 10;
        expResult = -1;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 4");
        wagonCapacity = 2000;
        currentWeight = -3;
        huntGatheredItem = 200;
        expResult = -1;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 5");
        wagonCapacity = 1000;
        currentWeight = 0;
        huntGatheredItem = 1;
        expResult = 1;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 6");
        wagonCapacity = 1500;
        currentWeight = 0;
        huntGatheredItem = 1;
        expResult = 1;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 7");
        wagonCapacity = 2000;
        currentWeight = 2000;
        huntGatheredItem = 1;
        expResult = 0;
        result = HarvestAndHunterControl.calCarryingCapacity(wagonCapacity, currentWeight, huntGatheredItem);
        assertEquals(expResult, result, 0.0);
    }
    
}
