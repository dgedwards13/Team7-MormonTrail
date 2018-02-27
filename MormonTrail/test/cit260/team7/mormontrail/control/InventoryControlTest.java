/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.InventoryItem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dgedw
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of setInventory method, of class InventoryControl.
     */
    @Test
    public void testSetInventory() {
        System.out.println("setInventory");
        InventoryControl.setInventory();
    }

    /**
     * Test of getInventory method, of class InventoryControl.
     */
    @Test
    public void testGetInventory() {
        System.out.println("getInventory");
        InventoryControl.setInventory();
        InventoryItem[] expResult = new InventoryItem[4];
        expResult[0] = new InventoryItem("Wheat", 4, 3, 2.25);
        expResult[1] = new InventoryItem("Water", 8, 5, 4.00);
        expResult[2] = new InventoryItem("Medicine", 2, 1, 9.50);
        expResult[3] = new InventoryItem("Money", 1000, 0, 0);
        InventoryItem[] result = InventoryControl.getInventory();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of changeInventory method, of class InventoryControl.
     */
    @Test
    public void testChangeInventory() {
        System.out.println("changeInventory");
        String itemName = "Wheat";
        double amount = 5;
        boolean purchase = true;
        String expResult = "Success!";
        String result = InventoryControl.changeInventory(itemName, amount, purchase);
        assertEquals(expResult, result);
    }

    /**
     * Test of calCurrentWeight method, of class InventoryControl.
     */
    @Test
    public void testCalCurrentWeight() {
        System.out.println("\tTest case 1");
        double wagonSize = 1000;
        double expResult = 54;
        double result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);

        System.out.println("\tTest case 2");
        wagonSize = 50;
        expResult = -1;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 3");
        wagonSize = 54;
        expResult = 54;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
       
        System.out.println("\tTest case 4");
        wagonSize = 30;
        expResult = -1;
        result = CalCurrentWeightControl.calCurrentWeight(wagonSize);
        assertEquals(expResult, result, 0.0);
    }
}
