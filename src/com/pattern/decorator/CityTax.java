/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.decorator;

/**
 *
 * @author zhuleqi
 */
public class CityTax extends Tax{

    public CityTax(){
        this(null);
    }
    public CityTax(Tax tax) {
        super(tax);
    }

    @Override
    public double getFinalPrice(double price) {
         if(this.getTax() == null){
            return price + price*this.getTaxRate();
        }
        
        return this.getTax().getFinalPrice(price + price*this.getTaxRate());
    }
    
}
