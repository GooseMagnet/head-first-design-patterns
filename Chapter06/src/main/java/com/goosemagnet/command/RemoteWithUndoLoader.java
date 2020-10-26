package com.goosemagnet.command;

import com.goosemagnet.command.commands.light.LightOffCommand;
import com.goosemagnet.command.commands.light.LightOnCommand;
import com.goosemagnet.command.receiver.Light;
import com.goosemagnet.command.remotecontrol.RemoteControlWithUndo;

public class RemoteWithUndoLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
