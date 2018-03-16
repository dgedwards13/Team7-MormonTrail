/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.model.FortTown;
import cit260.team7.mormontrail.model.TrailStopScene;

/**
 *
 * @author Savannah
 */
public class MapControl {
    
    static FortTown loc1;
    static TrailStopScene loc2;
    static FortTown loc3;
    static TrailStopScene loc4;
    static FortTown loc5;
    static TrailStopScene loc6;
    static FortTown loc7;
    static TrailStopScene loc8;
    static FortTown loc9;
    
    public static String getLoc() {
        return "\n=  |        F  ^  ^                F  ^  F          T  T         T  T         X=";
    }
    public static void setLocation(){
        loc1 = new FortTown();
        
    }

}
