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


public class Game implements Serializable{
    
     
    private double dayOnTrail;
    private double pace;
    private double milesTraveled;
    private String player;
    private InventoryItem[] InventoryArray;
    private Event[] EventArray;

    public Game(){
        
    }

    public double getDayOnTrail() {
        return dayOnTrail;
    }

    public void setDayOnTrail(double dayOnTrail) {
        this.dayOnTrail = dayOnTrail;
    }

    public double getPace() {
        return pace;
    }

    public void setPace(double pace) {
        this.pace = pace;
    }

    public double getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(double milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public InventoryItem[] getInventoryArray() {
        return InventoryArray;
    }

    public void setInventoryArray(InventoryItem[] InventoryArray) {
        this.InventoryArray = InventoryArray;
    }

    public Event[] getEventArray() {
        return EventArray;
    }

    public void setEventArray(Event[] EventArray) {
        this.EventArray = EventArray;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.dayOnTrail) ^ (Double.doubleToLongBits(this.dayOnTrail) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.pace) ^ (Double.doubleToLongBits(this.pace) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.milesTraveled) ^ (Double.doubleToLongBits(this.milesTraveled) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + Arrays.deepHashCode(this.InventoryArray);
        hash = 89 * hash + Arrays.deepHashCode(this.EventArray);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.dayOnTrail) != Double.doubleToLongBits(other.dayOnTrail)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pace) != Double.doubleToLongBits(other.pace)) {
            return false;
        }
        if (Double.doubleToLongBits(this.milesTraveled) != Double.doubleToLongBits(other.milesTraveled)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.InventoryArray, other.InventoryArray)) {
            return false;
        }
        if (!Arrays.deepEquals(this.EventArray, other.EventArray)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "dayOnTrail=" + dayOnTrail + ", pace=" + pace + ", milesTraveled=" + milesTraveled + ", player=" + player + ", InventoryArray=" + InventoryArray + ", EventArray=" + EventArray + '}';
    }

   

   
}
