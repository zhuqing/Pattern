/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory.product;

/**
 *北方豆腐脑
 * @author zhuleqi
 */
public class NorthTofuJelly extends TofuJelly{

    @Override
    public void createJuice() {
        System.err.println("浇上汁");
        System.err.println("撒些葱沫,蒜沫,香菜");
        System.err.println("加上垃圾,醋");
    }
    
}
