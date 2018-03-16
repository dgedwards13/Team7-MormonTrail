/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Event;
/**
 *
 * @author Savannah
 */
class EventControl {
    static Event event1;
    static Event event2;
    static Event event3;
    static Event event4;
    static Event event5;
    static Event event6;
    static Event event7;
    static Event event8;
            
    public static void setEvents(){
        event1 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event2 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event3 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event4 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event5 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event6 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event7 = new Event("Description", "", 0, 0, "", 0, 0, 1);
        event8 = new Event("Description", "", 0, 0, "", 0, 0, 1);
    }
    
    public static Event[] getEvents(){
 
        Event[] eventArray = new Event[8];

        eventArray[0] = event1;
        eventArray[1] = event2;
        eventArray[2] = event3;
        eventArray[3] = event4;
        eventArray[4] = event5;
        eventArray[5] = event6;
        eventArray[6] = event7;
        eventArray[7] = event8;
        
        return eventArray;
        
    }
}
