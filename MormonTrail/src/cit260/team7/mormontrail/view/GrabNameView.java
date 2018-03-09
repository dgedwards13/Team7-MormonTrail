/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import cit260.team7.mormontrail.view.StartProgramView;
/**
 *
 * @author Savannah
 */
public class GrabNameView extends View{
    
    public GrabNameView(){
        super("\n"
                +"Please enter your name" ,0 ,false
        );
    }
    @Override
    public boolean doAction(String inputs){
        System.out.println("Welcome" + inputs);
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return true;
    }
}
