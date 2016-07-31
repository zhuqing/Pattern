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
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.err.println("我是火鸡,呜呜呜");
    }

    @Override
    public void fly() {
        System.err.println("我能飞一会");
    }
    
}
