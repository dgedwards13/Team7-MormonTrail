/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.view;

import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author rherrerajr
 */
public class ErrorView {
    //getOutFile?
    private static PrintWriter console = MormonTrail.getOutFile();
    private static PrintWriter log = MormonTrail.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        console.println(
            "\n---ERROR------------------------------------------------------"
        +   "\n" + errorMessage            
        +   "\n--------------------------------------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}