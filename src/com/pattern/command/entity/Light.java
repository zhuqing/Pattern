/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command.entity;

/**
 *
 * @author zhuleqi
 */
public class Light {
    private String name;
    public Light(String name){
        this.name = name;
    }
    public void on(){
        System.err.println("打开"+name);
    }
    
    public void off(){
        System.err.println("关闭"+name);
    }
}
