/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;
import java.util.Scanner;
/**
 *z
 * @author Savannah
 */
public class StartProgramView {
    
    public StartProgramView(){
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
        System.out.println("Description of Fred");
        boolean valid = false;
        
        
        while (valid == false){
            throws java.io.IOExeption {
            
        
            char ch, answer = 'j';
        
            
            System.out.println("Fred");
//            static Scanner scanner = new Scanner(System.in);
//            static String inputString = Scanner.;
            ch = (char) System.in.read();
        }
            //String noBlank = new String();
            //Trim off leading and trailing blanks from the value
            
            if(inputs.length < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            inputs[1] = ;
        }

//        System.out.println("*** getInputs() called ***");
        
//        String[] inputs = new String[1];
//        inputs[0] = "testInput";
//        
//        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("*** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }

    public void display() {
        
    }
}
// displayStartProgramView() {
//  endOfView = false
//  DO
// inputs = getInputs()
// IF no inputs were entered OR the first input is Q
//  RETURN
// ENDIF
// endOfView = doAction(inputs)
// WHILE endOfView != true








//        displayStartProgramView(){
//        
//       
//        boolean endOfView = false;
//        do{//        doAction(String[] inputs){
//
//     
//            String[] input = this.getInput();
//           if (input == null || character.length < 1){
//            System.out.println("Error Message" + input + "is invalid");
//            } 
//        
//        
//        private boolean doAction(String[] input){
//            
//        }
//}
////endOfView = doAction(inputs)
//        while (endOfView != true){
//            
//        }