package com.goosemagnet.command.commands.Hottub;

import com.goosemagnet.command.commands.Command;
import com.goosemagnet.command.receiver.Hottub;

public class HottubOnCommand implements Command {

    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }


    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
