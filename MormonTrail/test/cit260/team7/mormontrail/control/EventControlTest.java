/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Event;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Savannah
 */
public class EventControlTest {
    
    public EventControlTest() {
    }

    /**
     * Test of setEvents method, of class EventControl.
     */
    @Test
    public void testSetEvents() {
        System.out.println("setEvents");
        EventControl.setEvents();
        // TODO review the generated test code and remove the default call to fail.
        }

    /**
     * Test of getEvents method, of class EventControl.
     */
    @Test
    public void testGetEvents() {
        System.out.println("getEvents");
        Event[] expResult = EventControl.getEvents();;
        Event[] result = EventControl.getEvents();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of indianRaid method, of class EventControl.
     */
    @Test
    public void testIndianRaid() {
        System.out.println("indianRaid");
        String expResult = "money";
        String result = EventControl.indianRaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
