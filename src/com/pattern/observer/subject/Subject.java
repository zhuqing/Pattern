/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer.subject;

import com.pattern.observer.observer.Observer;

/**
 *主题接口
 * @author zhuleqi
 */
public interface Subject<T extends Observer> {

    
    /**
     *  注册监听者
     */
    public void registerObserver(T t);
    /**
     * 移除监听者
     */
    public void removeObserver(T t);
    /**
     * 通知监听者
     */
    public void notifyObserver();
}
