/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer.observer;

/**
 *新闻订阅者
 * @author zhuleqi
 */
public class NewsReader implements Observer{

    private String name;
    
    public NewsReader(String name){
        this.setName(name);
    }
    
    @Override
    public void update(String n) {
         System.err.println(this.getName()+"\t收到新闻");
        System.err.println(n);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
