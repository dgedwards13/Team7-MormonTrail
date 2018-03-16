/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

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
        StartProgramView startProgramView = new StartProgramView(inputs);
        startProgramView.display();
        return true;
    }
}
