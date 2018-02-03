/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team7.mormontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Astley Shaw, Savannah Fish, Daniel Edwards
 */


public class Game implements Serializable{
    
     
    private double dayOnTrail;
    private double pace;
    private double milesTraveled;
    private double currentMoneyBalance;

 
    
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

    public double getCurrentMoneyBalance() {
        return currentMoneyBalance;
    }

    public void setCurrentMoneyBalance(double currentMoneyBalance) {
        this.currentMoneyBalance = currentMoneyBalance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.dayOnTrail) ^ (Double.doubleToLongBits(this.dayOnTrail) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.pace) ^ (Double.doubleToLongBits(this.pace) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.milesTraveled) ^ (Double.doubleToLongBits(this.milesTraveled) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.currentMoneyBalance) ^ (Double.doubleToLongBits(this.currentMoneyBalance) >>> 32));
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
        if (Double.doubleToLongBits(this.currentMoneyBalance) != Double.doubleToLongBits(other.currentMoneyBalance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "dayOnTrail=" + dayOnTrail + ", pace=" + pace + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" + currentMoneyBalance + '}';
    }
    
 
}
