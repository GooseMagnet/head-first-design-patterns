package com.goosemagnet.command.commands.stereo;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
