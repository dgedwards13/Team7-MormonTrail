/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;

import cit260.team7.mormontrail.exception.MapException;
import cit260.team7.mormontrail.model.FortTown;
import cit260.team7.mormontrail.model.RiverCrossing;
import cit260.team7.mormontrail.model.TrailStopScene;
import java.util.ArrayList;

/**
 *
 * @author Savannah
 */
public class MapControl {

    static FortTown loc1;
    static TrailStopScene loc2;
    static RiverCrossing loc3;
    static FortTown loc4;
    static RiverCrossing loc5;
    static TrailStopScene loc6;
    static FortTown loc7;
    static RiverCrossing loc8;
    static TrailStopScene loc9;
    static FortTown loc10;
    static RiverCrossing loc11;
    static TrailStopScene loc12;
    static FortTown loc13;
    static FortTown loc14;
    static TrailStopScene loc15;
    static RiverCrossing loc16;
    static FortTown loc17;
    static RiverCrossing loc18;
    static TrailStopScene loc19;
    static FortTown loc20;
    static RiverCrossing loc21;
    static TrailStopScene loc22;
    static FortTown loc23;
    static RiverCrossing loc24;
    static TrailStopScene loc25;
    static FortTown loc26;

    public static String getLoc() {
        return "\n=  |        F  ^  ^ R              F R ^  F   R     T  T   R     T  T         X=";
    }

    public static void setLocation() {
        loc1 = new FortTown();
        loc2 = new TrailStopScene();
        loc3 = new RiverCrossing();
        loc4 = new FortTown();
        loc5 = new RiverCrossing();
        loc6 = new TrailStopScene();
        loc7 = new FortTown();
        loc8 = new RiverCrossing();
        loc9 = new TrailStopScene();
        loc10 = new FortTown();
        loc11 = new RiverCrossing();
        loc12 = new TrailStopScene();
        loc13 = new FortTown();
        loc14 = new FortTown();
        loc15 = new TrailStopScene();
        loc16 = new RiverCrossing();
        loc17 = new FortTown();
        loc18 = new RiverCrossing();
        loc19 = new TrailStopScene();
        loc20 = new FortTown();
        loc21 = new RiverCrossing();
        loc22 = new TrailStopScene();
        loc23 = new FortTown();
        loc24 = new RiverCrossing();
        loc25 = new TrailStopScene();
        loc26 = new FortTown();
    }
    
    public static ArrayList getLocations() throws MapException{
        ArrayList locs = new ArrayList(); 
        locs.add(loc1);
        locs.add(loc2);
        locs.add(loc3);
        locs.add(loc4);
        locs.add(loc5);
        locs.add(loc6);
        locs.add(loc7);
        locs.add(loc8);
        locs.add(loc9);
        locs.add(loc10);
        locs.add(loc11);
        locs.add(loc12);
        locs.add(loc13);
        locs.add(loc14);
        locs.add(loc15);
        locs.add(loc16);
        locs.add(loc17);
        locs.add(loc18);
        locs.add(loc19);
        locs.add(loc20);
        locs.add(loc21);
        locs.add(loc22);
        locs.add(loc23);
        locs.add(loc24);
        locs.add(loc25);
        locs.add(loc26);
        if (locs.isEmpty()) {
            throw new MapException("There has been an error.");
        } else {
            return locs;
        }
    }

}
