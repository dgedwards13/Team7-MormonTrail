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
public class GeneralStoreItem implements Serializable{
    
    private String itemName;
    private double price;
    private String description; 
    private double recommendation;
    
    public GeneralStoreItem(){
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(double recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.itemName);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.recommendation) ^ (Double.doubleToLongBits(this.recommendation) >>> 32));
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
        final GeneralStoreItem other = (GeneralStoreItem) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.recommendation) != Double.doubleToLongBits(other.recommendation)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GeneralStoreItem{" + "itemName=" + itemName + ", price=" + price + ", description=" + description + ", recommendation=" + recommendation + '}';
    }

    
    
    
    
}
