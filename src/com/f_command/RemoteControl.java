package com.f_command;

import com.f_command.command.Command;
import com.f_command.command.impl.NoCommand;

/**
 * 遥控器
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */
 public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();

    }

    /**
     * 设置命令
     * @param solt 卡槽
     * @param onCommand on命令
     * @param offCommand off命令
     */
    public void setCommand(int solt,Command onCommand, Command offCommand){
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }

    /**
     * on开关按下
     * @param solt 卡槽
     */
    public void onButtonWasPushed(int solt){
        onCommands[solt].execute();
        undoCommand = onCommands[solt];
    }


    /**
     * off开关按下
     * @param solt 卡槽
     */
    public void offButtonWasPushed(int solt){
        offCommands[solt].execute();
        undoCommand = offCommands[solt];
    }

    /**
     * 撤销按钮按下
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
