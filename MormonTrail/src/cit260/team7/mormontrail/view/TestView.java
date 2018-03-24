/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import cit260.team7.mormontrail.exception.EventException;
import cit260.team7.mormontrail.control.EventControl;
import cit260.team7.mormontrail.control.HarvestAndHunterControl;
import cit260.team7.mormontrail.exception.HarvestAndHunterException;
import cit260.team7.mormontrail.exception.LocationException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shaw-Laptop
 */
public class TestView extends View {

    public TestView() throws EventException, HarvestAndHunterException, LocationException {
        super("\n"
                + "\n================================================================================"
                + "\n==                             Test Menu                                      =="
                + "\n================================================================================"
                + "\n\n1 | River Crossing View"
                + "\n2 | Pace View"
                + "\n3 | Daily Trail Stop Scene"
                + "\n4 | General Store View"
                + "\n5 | Fort or Town Scene"
                + "\n6 | Map View"
                + "\n7 | Daily Rest View"
                + "\n8 | Hunting View"
                + "\n9 | indianRaid Test"
                + "\n10 | Hotel View"
                + "\n" + EventControl.indianRaid()
                + "\nHarvestAndHunterControl Test"
                + "\n" + HarvestAndHunterControl.calCarryingCapacity(1500, 300, 20),
                8, true);
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "1":
                RiverCrossingView riverCrossingView = new RiverCrossingView();
                riverCrossingView.display();
                break;
            case "2":
                PaceView paceView = new PaceView();
                paceView.display();
                break;
            case "3":
                DailyTrailStopSceneView dailyTrailStopSceneView = new DailyTrailStopSceneView();
                dailyTrailStopSceneView.display();
                break;
            case "4":
                GeneralStoreView generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
            case "5":
                FortTownSceneView fortTownSceneView = null;
        try {
            fortTownSceneView = new FortTownSceneView();
        } catch (LocationException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
                fortTownSceneView.display();
                break;
            case "6":
                MapView mapView = new MapView();
                mapView.display();
                break;
            case "7":
                DailyRestView dailyRestView = new DailyRestView();
                dailyRestView.display();
                break;
            case "8":
                HuntingView huntingView = new HuntingView();
                huntingView.display();
                break;
            case "9":
                dailyTrailStopSceneView = new DailyTrailStopSceneView();
                dailyTrailStopSceneView.display();
                break;
            case "10":
                HotelSceneView hotelSceneView = new HotelSceneView();
                hotelSceneView.display();
        }

        return true;
    }
}
