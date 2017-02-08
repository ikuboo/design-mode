package com.f_command.command.impl;

import com.f_command.thirdparty.Light;
import com.f_command.command.Command;

/**
 * 关闭电灯的命令
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/7
 */

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
