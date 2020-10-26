package com.goosemagnet.command;

import com.goosemagnet.command.commands.ceilingfan.CeilingFanHighCommand;
import com.goosemagnet.command.commands.ceilingfan.CeilingFanMediumCommand;
import com.goosemagnet.command.commands.ceilingfan.CeilingFanOffCommand;
import com.goosemagnet.command.receiver.CeilingFan;
import com.goosemagnet.command.remotecontrol.RemoteControlWithUndo;

public class RemoteForCeilingFan {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
