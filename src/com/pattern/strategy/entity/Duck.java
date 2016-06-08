package com.pattern.strategy.entity;

import com.pattern.strategy.behavior.fly.FlyBehavior;
import com.pattern.strategy.behavior.quack.QuackBehavior;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * 算法族的客户
 * @author zhuleqi
 */
public abstract class Duck {
    /**
     * 鸭子的飞行行为
     */
    private FlyBehavior flyBehavior;
    /**
     * 鸭子的叫
     */
    private QuackBehavior quackBehavior;
    public abstract void display();
    public abstract void swim();
    public abstract void fly();
    public abstract void quack();

    /**
     * @return the flyBehavior
     */
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    /**
     * @param flyBehavior the flyBehavior to set
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * @return the quackBehavior
     */
    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    /**
     * @param quackBehavior the quackBehavior to set
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
}
