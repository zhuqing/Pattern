/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command.comm;

import com.pattern.command.Command;
import com.pattern.command.entity.Light;
import com.pattern.command.entity.TV;

/**
 *
 * @author zhuleqi
 */
public class TVOnCommand implements Command{

    private TV tv;
    
    public TVOnCommand(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        this.tv.on();
    }

    @Override
    public void undo() {
       this.tv.off();
    }
    
}
