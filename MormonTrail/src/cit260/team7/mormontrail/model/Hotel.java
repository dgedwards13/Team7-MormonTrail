/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */
public class Hotel implements Serializable{
    
    private Character[] availableCharaters;
    
    public Hotel(){
        
    }

    public Character[] getAvailableCharaters() {
        return availableCharaters;
    }

    public void setAvailableCharaters(Character[] availableCharaters) {
        this.availableCharaters = availableCharaters;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Arrays.deepHashCode(this.availableCharaters);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (!Arrays.deepEquals(this.availableCharaters, other.availableCharaters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "availableCharaters=" + availableCharaters + '}';
    }
    
    
}
