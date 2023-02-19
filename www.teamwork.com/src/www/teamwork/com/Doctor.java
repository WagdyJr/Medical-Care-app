/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.teamwork.com;

/**
 *
 * @author q
 */
public class Doctor extends Person {
    
    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Doctor(double Price) {
        this.Price = Price;
    }
    
    
    
    
}
