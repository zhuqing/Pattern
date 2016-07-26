/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory.product;

/**
 *南方豆腐脑是甜的
 * @author zhuleqi
 */
public class SouthTofuJelly extends TofuJelly{

    @Override
    public void createJuice() {
        System.err.println("放一把糖");
    }
    
}
