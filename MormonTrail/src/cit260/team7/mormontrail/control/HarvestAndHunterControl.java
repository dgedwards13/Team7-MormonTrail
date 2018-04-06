/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;
import cit260.team7.mormontrail.exception.HarvestAndHunterException;
/**
 *
 * @author Savannah
 */
public class HarvestAndHunterControl {

    public static double calCarryingCapacity(double wagonCapacity, double currentWeight, double huntGatheredItem) throws HarvestAndHunterException {
        double carryCapacity;
//Get wagonCapacity
//Check the currentWeight
//If invalid return error message
        if (currentWeight < 0 || currentWeight > wagonCapacity){
            throw new HarvestAndHunterException("Error: Please restart game.");
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
        
        //create random function for hunting success from user input
        
        return "2";
    }
}
