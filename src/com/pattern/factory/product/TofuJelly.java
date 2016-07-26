/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory.product;

/**
 *豆腐脑
 * @author zhuleqi
 */
public abstract class TofuJelly {
    public abstract void createJuice();
    
    public void createTofu(){
        System.err.println("拿一碗豆腐脑");
    }
    
    
}
