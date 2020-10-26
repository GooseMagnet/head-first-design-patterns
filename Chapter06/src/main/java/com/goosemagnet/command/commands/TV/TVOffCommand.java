package com.goosemagnet.command.commands.TV;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.TV;

public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
