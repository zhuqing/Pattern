/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer.observer;

/**
 *监听者接口
 * @author zhuleqi
 */
public interface Observer<N extends String> {
    public void  update(N n);
}
