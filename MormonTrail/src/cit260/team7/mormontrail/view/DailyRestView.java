/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;

/**
 *
 * @author rherrerajr
 */
public class DailyRestView extends View {

    public DailyRestView() {

        super("\n"
                + "\n================================================================================"
                + "\n==                              Daily Rest                                    =="
                + "\n================================================================================"
                + "\n\n" + GameControl.buildRestMenu()
                + "\nHow many days of rest?", GameControl.countRestMenu(), true);
    }

    @Override
    public boolean doAction(String inputs) {

        int result = Integer.parseInt(inputs);
        this.console.println(result);

        GameControl.setDailyRest(result);
        this.console.println("Successful rest day");
        return true;
    }

}
