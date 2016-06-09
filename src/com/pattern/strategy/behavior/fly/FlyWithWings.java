/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.strategy.behavior.fly;

/**
 *使用翅膀飞行
 * @author zhuleqi
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.err.println("fly with wing");
    }
    
}
