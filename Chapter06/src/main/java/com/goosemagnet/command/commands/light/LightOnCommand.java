package com.goosemagnet.command.commands.light;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
