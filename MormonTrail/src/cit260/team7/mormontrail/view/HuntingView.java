/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.HarvestAndHunterControl;

/**
 *
 * @author Savannah
 */
public class HuntingView extends View {

    public HuntingView() {
        super("\n"
                + "\n================================================================================"
                + "\n==                             Let's go hunting!                              =="
                + "\n================================================================================"
                + "\nChoose the area out in the field you would like to shoot:"
                + "\n\n1 | Top Left"
                + "\n2 | Top Right"
                + "\n3 | Bottom Left"
                + "\n4 | Bottom Right",
                4, true);
    }

    @Override
    public boolean doAction(String inputs) {
        String hunting = HarvestAndHunterControl.hunt();
        if (inputs.equals(hunting)) {
            //success
            System.out.println("You were successful!");
            DailyTrailStopSceneView dailyTrailStop = new DailyTrailStopSceneView();
            dailyTrailStop.display();
        } else {
            //display try again
            System.out.println("You were not successful, try again.");
            DailyTrailStopSceneView dailyTrailStop = new DailyTrailStopSceneView();
            dailyTrailStop.display();
        }
        return true;
    }
}
