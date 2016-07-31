/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.adapter.entity;

/**
 *
 * @author zhuleqi
 */
public class GreenHeadDuck implements Duck{

    @Override
    public void quack() {
       System.err.println("我是绿头鸭,呱呱呱");
    }

    @Override
    public void fly() {
        System.err.println("我正在飞");
    }
    
}
