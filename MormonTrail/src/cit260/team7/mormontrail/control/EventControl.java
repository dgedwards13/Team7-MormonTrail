/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.Event;
import cit260.team7.mormontrail.control.InventoryControl;
import static cit260.team7.mormontrail.control.InventoryControl.getInventory;
import cit260.team7.mormontrail.model.InventoryItem;
import java.util.Arrays;
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
    static Event event9;
    static Event event10;
    static Event event11;
    static Event event12;
    static Event event13;
    static Event event14;
            
    public static void setEvents(){
        event1 = new Event("It's a miracle! You found a water spring.", "", 0, 0, "", 0, 0, 1);
        event2 = new Event("It's a miracle! You found bread nearby a tree.", "", 0, 0, "", 0, 0, 1);
        event3 = new Event("It's a miracle! You found money along the trail.", "", 0, 0, "", 0, 0, 1);
        event4 = new Event("It's a miracle! A friendly indian led you to a shortcut.", "", 0, 0, "", 0, 0, 1);
        event5 = new Event("It's a miracle! You found a berry bush not far from the campsite.", "", 0, 0, "", 0, 0, 1);
        event6 = new Event("It's a miracle! You found spare supplies.", "", 0, 0, "", 0, 0, 1);
        event7 = new Event("It's a miracle! You were sick, but after a priesthood blessing you were restored to full health.", "", 0, 0, "", 0, 0, 1);
        event8 = new Event("Oh no! You passed by a snake and were bitten.", "", 0, 0, "", 0, 0, 1);
        event9 = new Event("Oh no! You got run over by a wagon and broke your leg.", "", 0, 0, "", 0, 0, 1);
        event10 = new Event("Oh no! Your ox is ill.", "", 0, 0, "", 0, 0, 1);
        event11 = new Event("Oh no! You were raided by indians. Check your inventory to see what they stole.", "", 0, 0, "", 0, 0, 1);
        event12 = new Event("Oh no! Your sister lost faith and left the company.", "", 0, 0, "", 0, 0, 1);
        event13 = new Event("Oh no! You got malaria.", "", 0, 0, "", 0, 0, 1);
        event14 = new Event("Oh no! You died of consumption.", "", 0, 0, "", 0, 0, 1);
    }
    
    public static Event[] getEvents(){
 
        Event[] eventArray = new Event[14];

        eventArray[0] = event1;
        eventArray[1] = event2;
        eventArray[2] = event3;
        eventArray[3] = event4;
        eventArray[4] = event5;
        eventArray[5] = event6;
        eventArray[6] = event7;
        eventArray[7] = event8;
        eventArray[8] = event9;
        eventArray[9] = event10;
        eventArray[10] = event11;
        eventArray[11] = event12;
        eventArray[12] = event13;
        eventArray[13] = event14;
   
        
        return eventArray;
        
    }
    
//    public static int getRandomEvent(Event[] eventArray){
//        int rnd = new Random().nextInt(array.length);
//        return eventArray[rnd];
//    }
    
    //if eventArray[10]{
//        public static int indianRaid(){
//            Integer[] inventoryArray = Arrays.copyOf(a, a.length, Integer[].class);
//            InventoryItem[] a = new Integer[1];
//            Integer b=1;
//a[0]=b;
//Integer[] c = (Integer[]) a;
//            InventoryItem[] inventoryArray = getInventory();
//            int stolenItem = Integer.MIN_VALUE;
//            for(int i=0; i < inventoryArray.length; i++){
//                if(inventoryArray[i] > stolenItem){
//                    stolenItem = inventoryArray[i]; 
//                }
//            }
//            //change # to 0 in supplies
//            System.out.println("The indian's stole your " + stolenItem);
//        }
}
