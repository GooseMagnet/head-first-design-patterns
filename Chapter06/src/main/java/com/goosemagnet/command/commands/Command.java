package com.goosemagnet.command.commands;

public interface Command {
    public void execute();
    public void undo();
}
