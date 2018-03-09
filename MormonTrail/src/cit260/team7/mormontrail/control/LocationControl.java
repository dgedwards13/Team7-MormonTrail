/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import java.util.Arrays;

/**
 *
 * @author rherrerajr
 */
public class LocationControl {

    public static String nearby() {
        return "fort";
    }
    
    public static String fortTown(){
        String nearby = nearby();
        String output = "";
            if (nearby.equals("town")){
                output += "==                            Welcome to Sometown!                            ==";
                output += "1 | Visit the Hotel";
                output += "2 | Visit the General Store";
                output += "4 | Back to GamePlayView";
            }
 
             else if (nearby.equals("fort")){
                output += "==                            Welcome to Somefort!                            ==";
                output += "1 | Visit the General Store";
                output += "2 | Return to the Trail";
                output += "3 | Back to GamePlayView";
             }
            return output;
    }
}