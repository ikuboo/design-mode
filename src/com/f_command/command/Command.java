package com.f_command.command;

/**
 * 命令接口
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
