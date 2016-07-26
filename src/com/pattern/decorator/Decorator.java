/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.decorator;

/**
 * 装饰着模式:动态地将责任附加到对象上. 若要扩展功能,装饰者提供了比继承更有弹性的替代方案
 *
 * @author zhuleqi
 */
public class Decorator {

    public static void main(String[] args) {
        Tax importTax = new ImportTax();
        importTax.setTaxRate(0.15);
        Tax provinceTax = new ProvinceTax(importTax);
        provinceTax.setTaxRate(0.02);
        Tax cityTax = new CityTax(provinceTax);
        cityTax.setTaxRate(0.01);
        
        System.err.print("total:"+cityTax.getFinalPrice(100));

    }
}
