package com.f_command;

import com.f_command.command.impl.LightOffCommand;
import com.f_command.command.impl.LightOnCommand;
import com.f_command.thirdparty.Light;

/**
 * @author ikuboo (ikuboo@126.com)
 *         2017/2/8
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
    }
}
