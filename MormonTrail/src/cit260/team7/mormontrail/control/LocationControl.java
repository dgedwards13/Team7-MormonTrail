/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.LocationException;

/**
 *
 * @author rherrerajr
 */
public class LocationControl {

    public static String nearby() {
        return "fort";
    }

    public static String fortTown() throws LocationException {
        String nearby = nearby();
        String output = "";
        if (nearby.equals("town")) {
            output += "\n==                            Welcome to Sometown!                            ==";
            output += "\n================================================================================";
            output += "\n\n1 | Visit the Hotel";
            output += "\n2 | Visit the General Store";
            output += "\n3 | Back to GamePlayView";
        } else if (nearby.equals("fort")) {
            output += "\n==                            Welcome to Somefort!                            ==";
            output += "\n================================================================================";
            output += "\n\n1 | Visit the General Store";
            output += "\n2 | Return to the Trail";
            output += "\n3 | Back to GamePlayView";
            throw new LocationException("You have encountered and error.");
        }
        return output;
    }
}
