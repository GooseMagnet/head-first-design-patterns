package com.goosemagnet.command.remotecontrol;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "\t" + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuffer.toString();
    }
}
