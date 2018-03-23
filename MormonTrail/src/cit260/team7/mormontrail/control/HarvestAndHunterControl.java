/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

/**
 *
 * @author Savannah
 */
public class HarvestAndHunterControl {

    public static double calCarryingCapacity(double wagonCapacity, double currentWeight, double huntGatheredItem) {
        double carryCapacity;
//Get wagonCapacity
//Check the currentWeight
//If invalid return error message
        if (currentWeight < 0 || currentWeight > wagonCapacity) {
            carryCapacity = -1;
            return carryCapacity;
        }
////Get space available
        double spaceAvailable = wagonCapacity - currentWeight;
        ////Check huntGatheredItem weight to see if it is less than the spaceAvailable
        if (huntGatheredItem > spaceAvailable) {
            carryCapacity = spaceAvailable;
            return carryCapacity;
        } else {
            carryCapacity = huntGatheredItem;
            return carryCapacity;
        }
        //return carryCapacity;
    }

    public static String hunt() {
        return "2";
    }
}
