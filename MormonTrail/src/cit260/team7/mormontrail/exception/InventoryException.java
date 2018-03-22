/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.exception;

/**
 *
 * @author Shaw-Laptop
 */
public class InventoryException extends Exception{

    public InventoryException() {
    }

    public InventoryException(String string) {
        super(string);
    }

    public InventoryException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InventoryException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InventoryException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
