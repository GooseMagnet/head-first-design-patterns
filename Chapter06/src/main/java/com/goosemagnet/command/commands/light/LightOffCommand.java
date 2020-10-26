package com.goosemagnet.command.commands.light;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
