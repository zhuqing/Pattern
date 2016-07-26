/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.factory.store;

import com.pattern.factory.product.NorthTofuJelly;
import com.pattern.factory.product.TofuJelly;

/**
 *
 * @author zhuleqi
 */
public class NorthStore extends Store{

    @Override
    protected TofuJelly createTofuJelly() {
        return new NorthTofuJelly();
    }
    
}
