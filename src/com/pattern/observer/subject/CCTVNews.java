/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer.subject;

import com.pattern.observer.observer.Observer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *中央电视台新闻发布者
 * @author zhuleqi
 */
public class CCTVNews<T extends Observer> implements Subject<T> {

    /**
     * 新闻内容
     */
    private String news;

    /**
     * 监听者的集合
     */
    private List<T> observers;

    /**
     * 获取监听者的集合
     * @return 
     */
    public List<T> getObservers() {
        if (this.observers == null) {
            //生成线程安全的集合
            this.observers = Collections.synchronizedList(new ArrayList<T>());
        }
        return this.observers;
    }

    @Override
    public void registerObserver(T t) {
        this.getObservers().add(t);
    }

    @Override
    public void removeObserver(T t) {
       this.getObservers().remove(t);
    }

    @Override
    public void notifyObserver() {
        System.err.println("====================\n开始发布新闻");
       for(T t : this.getObservers()){
           t.update(this.news);
       }
         System.err.println("发布新闻结束\n==================");
    }

    /**
     * @return the news
     */
    public String getNews() {
        return news;
    }

    /**
     * @param news the news to set
     */
    public void setNews(String news) {
        this.news = news;
    }
}
