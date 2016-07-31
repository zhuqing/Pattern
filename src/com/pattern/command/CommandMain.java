/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command;

import com.pattern.command.comm.LightOffCommand;
import com.pattern.command.comm.LightOnCommand;
import com.pattern.command.comm.NoCommand;
import com.pattern.command.comm.TVOffCommand;
import com.pattern.command.comm.TVOnCommand;
import com.pattern.command.entity.Light;
import com.pattern.command.entity.RemoteControl;
import com.pattern.command.entity.TV;

/**
 *  命令模式:将"请求"封装成对象,以便不同的请求,队列或者日志来参数化其他对象.命令模式也支持可撤销的操作.
 *
 * @author zhuleqi
 */
public class CommandMain {

    public static void main(String[] args) throws Exception {
        RemoteControl.addCommand(new LightOnCommand(new Light("床头灯")));
        RemoteControl.addCommand(new LightOffCommand(new Light("客厅灯")));
        RemoteControl.addCommand(new TVOffCommand(new TV()));
        RemoteControl.addCommand(new TVOnCommand(new TV()));
        RemoteControl.addCommand(new NoCommand());
        
        for(int i = 0 ; i < 5 ; i++){
            RemoteControl.executeCommand(i);
        }
        
        for(int i = 4 ; i>=0 ; i--){
            RemoteControl.undo(i);
        }

    }

}
