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
public abstract class Tax {

    private Tax tax;
    private Double taxRate;

    public Tax(Tax tax) {
        this.tax = tax;
    }

    
    
    public abstract double getFinalPrice(double price);

    /**
     * @return the tax
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    /**
     * @return the taxRate
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
