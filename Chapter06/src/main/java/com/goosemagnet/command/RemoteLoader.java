package com.goosemagnet.command;

import com.goosemagnet.command.commands.ceilingfan.CeilingFanOffCommand;
import com.goosemagnet.command.commands.ceilingfan.CeilingFanOnCommand;
import com.goosemagnet.command.commands.garage.GarageDoorCloseCommand;
import com.goosemagnet.command.commands.garage.GarageDoorOpenCommand;
import com.goosemagnet.command.commands.light.LightOffCommand;
import com.goosemagnet.command.commands.light.LightOnCommand;
import com.goosemagnet.command.commands.stereo.StereoOffCommand;
import com.goosemagnet.command.commands.stereo.StereoOnWithCDCommand;
import com.goosemagnet.command.receiver.CeilingFan;
import com.goosemagnet.command.receiver.GarageDoor;
import com.goosemagnet.command.receiver.Light;
import com.goosemagnet.command.receiver.Stereo;
import com.goosemagnet.command.remotecontrol.RemoteControl;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
