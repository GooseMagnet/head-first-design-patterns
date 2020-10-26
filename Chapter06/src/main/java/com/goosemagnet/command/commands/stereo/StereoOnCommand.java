package com.goosemagnet.command.commands.stereo;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Stereo;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
