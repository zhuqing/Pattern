/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.strategy.behavior.quack;

/**
 *
 * @author zhuleqi
 */
public class NormalQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.err.println("我是一只正常叫的鸭子");
    }
    
}
