package com.pattern.strategy;

import com.pattern.strategy.behavior.fly.FlyWithWings;
import com.pattern.strategy.behavior.quack.NoQuack;
import com.pattern.strategy.behavior.quack.NormalQuack;
import com.pattern.strategy.entity.Duck;
import com.pattern.strategy.entity.GreenQuack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *  策略模式定义了算法族,分别封装起来,让它们之间相互替换,此模式让算法的变化独立于算法的客户
 *
 * @author zhuleqi
 */
public class Strategy {

    public static void main(String[] args) {
        Duck duck = new GreenQuack();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new NormalQuack());
        print(duck);
    }

    private static void print(Duck duck) {
        duck.display();
        duck.fly();
        duck.quack();
    }
}
