/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.control;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rherrerajr
 */
public class PrintStatusControl {
    
    public static void fileName(String filePath) {
       try{
            
            File characterHealth = new File(filePath);
            
            PrintWriter infoToWrite = new PrintWriter( 
                    new BufferedWriter(
                    new FileWriter(characterHealth)));
            
             
        }
        catch(IOException e){
            System.out.println("Error");
            System.exit(0);
        
        }
        
    }

    public boolean doAction(String inputs){
     
//     PrintWriter invOutput;
//        invOutput = createFile("filePath");
        return true;
       
    }

   
}