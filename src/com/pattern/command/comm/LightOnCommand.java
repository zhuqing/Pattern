/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command.comm;

import com.pattern.command.Command;
import com.pattern.command.entity.Light;

/**
 *
 * @author zhuleqi
 */
public class LightOnCommand implements Command{

    private Light light;
    
    public LightOnCommand(Light light){
        this.light = light;
    }
    
    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
       this.light.off();
    }
    
}
