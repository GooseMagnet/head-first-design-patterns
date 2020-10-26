package com.goosemagnet.command.commands.TV;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.TV;

public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
