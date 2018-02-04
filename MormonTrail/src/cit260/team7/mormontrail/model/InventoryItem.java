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
public class InventoryItem implements Serializable{
    
    private String item;
    private double amount;
    private double itemWeight;
    
    public InventoryItem(){
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.item);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.itemWeight) ^ (Double.doubleToLongBits(this.itemWeight) >>> 32));
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemWeight) != Double.doubleToLongBits(other.itemWeight)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "item=" + item + ", amount=" + amount + ", itemWeight=" + itemWeight + '}';
    }
    
    
}
