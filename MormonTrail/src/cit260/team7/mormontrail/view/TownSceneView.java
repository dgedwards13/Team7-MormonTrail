/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.util.Scanner;
/**
 *
 * @author Savannah
 */
public class TownSceneView {
    public TownSceneView() {
        boolean endOfView = false;
        do{
            String[] inputs = this.getInputs();
                if (inputs == null || inputs.length < 1){
                    return;
                }
                endOfView = doAction(inputs);
        }           
        while (endOfView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false){
            Scanner keyboard = new Scanner(System.in);
        }
        
        return inputs;
    }
    
    private boolean doAction(String[] inputs){
        
        return true;
    }
    
    public void display(){
        
    }
}
