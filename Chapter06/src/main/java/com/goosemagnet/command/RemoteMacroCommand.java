package com.goosemagnet.command;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.commands.Hottub.HottubOffCommand;
import com.goosemagnet.command.commands.Hottub.HottubOnCommand;
import com.goosemagnet.command.commands.MacroCommand;
import com.goosemagnet.command.commands.TV.TVOffCommand;
import com.goosemagnet.command.commands.TV.TVOnCommand;
import com.goosemagnet.command.commands.light.LightOffCommand;
import com.goosemagnet.command.commands.light.LightOnCommand;
import com.goosemagnet.command.commands.stereo.StereoOffCommand;
import com.goosemagnet.command.commands.stereo.StereoOnCommand;
import com.goosemagnet.command.receiver.Hottub;
import com.goosemagnet.command.receiver.Light;
import com.goosemagnet.command.receiver.Stereo;
import com.goosemagnet.command.receiver.TV;
import com.goosemagnet.command.remotecontrol.RemoteControlWithUndo;

public class RemoteMacroCommand {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
