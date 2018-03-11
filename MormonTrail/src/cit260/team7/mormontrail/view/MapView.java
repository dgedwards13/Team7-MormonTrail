/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

/**
 *
 * @author dgedw
 */
public class MapView extends View{
    public MapView() {
        super("\n================================================================================"
            + "\n==                           Map of the Mormon Trail                          =="
            + "\n================================================================================"
            + "\n=          Fort Bridger           Fort Laramie     Winter Quarters             ="
            + "\n=           | Martin's Cove        | Chimney Rock   |           Mount Pigsah   ="
            + "\n= Salt Lake |  | Independence Rock |  | Fort Kearny | Kanesville | Garden Grove="
            + "\n=  | Valley |  |  |                |  |  |          |  |         |  |          ="
            + "\n=  |        F  ^  ^                F  ^  F          T  T         T  T         X="
            + "\n=------------------------------------------------------------------------------="
            + "\n================================================================================"
            + "\nKey:"
            + "\nX = You are Here"
            + "\nT = Town"
            + "\nF = Fort"
            + "\n^ = Landmark"
            + "\n\n1| Return to previous menu", 1, true);
    }
    
@Override
    public boolean doAction(String inputs) {
        if(inputs.equalsIgnoreCase("1")) {
            GamePlayView gamePlayView = new GamePlayView();
            gamePlayView.display();
            return true;
        } else {
            return false;
        }
    }
}
