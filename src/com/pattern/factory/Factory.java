/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory;

import com.pattern.factory.store.BeiJingStore;
import com.pattern.factory.store.NorthStore;
import com.pattern.factory.store.SouthStore;
import com.pattern.factory.store.Store;

/**
 *工厂方法模式:定义了一个创建对象的接口,但由子类决定要实例化的类是哪一个,工厂方法让类把实例化推迟到了子类
 * @author zhuleqi
 */
public class Factory {
     public static void main(String[] args) {
         Store store = new BeiJingStore();
         store.orderTofuJelly();
         
          store = new NorthStore();
         store.orderTofuJelly();
         
          store = new SouthStore();
         store.orderTofuJelly();
     }
}
