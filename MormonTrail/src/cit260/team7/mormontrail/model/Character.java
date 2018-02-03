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
public class Character implements Serializable{
 
    private String name;
    private double money;
    private double huntingSkill;
    private double gatheringSkill;
    private double dailyStaminaDraw;
    private double currentHealth;

    
    public Character(){
        
    }
        
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(double huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public double getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(double gatheringSkill) {
        this.gatheringSkill = gatheringSkill;
    }

    public double getDailyStaminaDraw() {
        return dailyStaminaDraw;
    }

    public void setDailyStaminaDraw(double dailyStaminaDraw) {
        this.dailyStaminaDraw = dailyStaminaDraw;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }
  
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.huntingSkill) ^ (Double.doubleToLongBits(this.huntingSkill) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.gatheringSkill) ^ (Double.doubleToLongBits(this.gatheringSkill) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.dailyStaminaDraw) ^ (Double.doubleToLongBits(this.dailyStaminaDraw) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.currentHealth) ^ (Double.doubleToLongBits(this.currentHealth) >>> 32));
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (Double.doubleToLongBits(this.huntingSkill) != Double.doubleToLongBits(other.huntingSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gatheringSkill) != Double.doubleToLongBits(other.gatheringSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dailyStaminaDraw) != Double.doubleToLongBits(other.dailyStaminaDraw)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentHealth) != Double.doubleToLongBits(other.currentHealth)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", money=" + money + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", dailyStaminaDraw=" + dailyStaminaDraw + ", currentHealth=" + currentHealth + '}';
    }

    
    
}

