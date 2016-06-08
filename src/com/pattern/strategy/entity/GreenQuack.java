/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.strategy.entity;

import com.pattern.strategy.behavior.fly.FlyWithWings;
import com.pattern.strategy.behavior.quack.NoQuack;

/**
 *
 * @author zhuleqi
 */
public class GreenQuack extends Duck{

    public GreenQuack(){
        
        
      
        
    }
    @Override
    public void display() {
        System.err.println(" 我是绿头鸭");
    }

    @Override
    public void swim() {
        System.err.println(" 我可以在水里游");
    }

    @Override
    public void fly() {
        if(this.getFlyBehavior() == null){
            return;
        }
        this.getFlyBehavior().fly();
    }

    @Override
    public void quack() {
        if(this.getQuackBehavior() == null){
            return ;
        }
        this.getQuackBehavior().quack();
    }
    
}
