package com.goosemagnet.state.gumballstate.state;

import com.goosemagnet.state.gumballstate.GumballMachine;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Oops, out of gumballs!");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
