/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.command;

/**
 *
 * @author zhuleqi
 */
public interface Command {
    /**
     * 执行
     */
    public void execute();
    /**
     * 撤销操作
     */
    public void undo();
}
