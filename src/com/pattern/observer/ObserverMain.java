/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.observer;

import com.pattern.observer.observer.NewsReader;
import com.pattern.observer.observer.Observer;
import com.pattern.observer.subject.CCTVNews;

/**
 * 观察者模式:定义了对象的一对多的依赖,这样一来,当一个对象的状态改变时,它的所有依赖者都会收到通知并自动更新.
 *
 * @author zhuleqi
 */
public class ObserverMain {

    public static void main(String[] args) {
        //有三个新闻订阅者
        Observer zhangSan = new NewsReader("zhangSan");
        Observer liSi = new NewsReader("liSi");
        Observer wanwu = new NewsReader("wanwu");

        CCTVNews cctvNews = new CCTVNews();
        //三个人都订阅新闻
        cctvNews.registerObserver(zhangSan);
        cctvNews.registerObserver(liSi);
        cctvNews.registerObserver(wanwu);
        
        cctvNews.setNews("今天有雨.");
        cctvNews.notifyObserver();
        
        //liSi 取消订阅新闻
        cctvNews.removeObserver(liSi);
        cctvNews.setNews("今天阳光明媚");
        cctvNews.notifyObserver();
    }

}
