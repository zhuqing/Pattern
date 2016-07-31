/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command.entity;

import com.pattern.command.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhuleqi
 */
public class RemoteControl {

    private static final List<Command> COMMANDS = new ArrayList<>();

    public static void addCommand(Command command) {
        COMMANDS.add(command);
    }

    public static void executeCommand(int i) throws Exception {
        if (COMMANDS.size() <= i) {
            throw new Exception(" 没有此命令");
        }

        Command command = COMMANDS.get(i);
        command.execute();
    }

    public static void undo(int i) throws Exception {
        if (COMMANDS.size() <=i) {
            throw new Exception(" 没有此命令");
        }

        Command command = COMMANDS.get(i);
        command.undo();
    }

}
