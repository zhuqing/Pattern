/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory.product;

/**
 *
 * @author zhuleqi
 */
public class BeiJingTofuJelly extends TofuJelly{

    @Override
    public void createJuice() {
        System.err.println("浇上酸汤");
    }
    
}
