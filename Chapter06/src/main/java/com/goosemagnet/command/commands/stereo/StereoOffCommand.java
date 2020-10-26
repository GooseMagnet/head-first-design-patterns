package com.goosemagnet.command.commands.stereo;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Stereo;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }
}
