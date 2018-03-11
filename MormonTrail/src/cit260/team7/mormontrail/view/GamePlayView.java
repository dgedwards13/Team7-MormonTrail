/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import cit260.team7.mormontrail.control.GameControl;
/**
 *
 * @author dgedw
 */
public class GamePlayView extends View {
    
    public GamePlayView(){
        
        super( "\n"
            +"\n================================================================================"
            +"\n==                             Game Menu                                      ==" 
//            This function will get the play information and display it.    
            + GameControl.playerData()    
            +"\n================================================================================"
            + "\n"
            + "\n1 | Team Status"
            + "\n2 | Team Supplies"
            + "\n3 | Set Team Pace"
            + "\n4 | Main Menu"
            + "\n5 | Help Menu"
            + "\n6 | View map"
            + "\n7 | Test menu"    
            , 7, true);
    }
    
@Override
    public boolean doAction(String inputs) {
        
        
        switch(inputs) {
            case "1":
//                TeamStatusView teamStatusView = new TeamStatusView();
//                teamStatusView.display();
                break;
            case "2":
                TeamSuppliesView teamSuppliesView = new TeamSuppliesView();
                teamSuppliesView.display();
                break;
            case "3":
                PaceView paceView = new PaceView();
                paceView.display();
                break;
            case "4":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            case"5":
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case"6":
                MapView mapView = new MapView();
                mapView.display();
                break;
            case"7":
                TestView testView = new TestView();
                testView.display();
        }
           
        return true;
    }
}
