/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command.comm;

import com.pattern.command.Command;

/**
 *空命令不做任何事
 * @author zhuleqi
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.err.println("我是空命令");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        System.err.println("我是空命令 undo");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
