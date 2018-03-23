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
public class InventoryException extends Exception {

    public InventoryException() {
    }

    public InventoryException(String message) {
        super(message);
    }

    public InventoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryException(Throwable cause) {
        super(cause);
    }

    public InventoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
