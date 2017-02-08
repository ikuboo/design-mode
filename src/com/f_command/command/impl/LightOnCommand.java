package com.f_command.command.impl;

import com.f_command.thirdparty.Light;
import com.f_command.command.Command;

/**
 * 打开电灯的命令
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
