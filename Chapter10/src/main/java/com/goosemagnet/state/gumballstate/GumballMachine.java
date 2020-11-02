package com.goosemagnet.state.gumballstate;

import com.goosemagnet.state.gumballstate.state.*;

public class GumballMachine {

    State soldOutState;
    State hasQuarterState;
    State soldState;
    State noQuarterState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\nMighty Gumball, Inc.\n");
        stringBuilder.append("Java-enabled Standing Gumball Model #2004\n");
        stringBuilder.append("Inventory: ")
                .append(count)
                .append(" gumball");

        if (count != 1) {
            stringBuilder.append("s");
        }
        stringBuilder.append("\nMachine is ");

        if (state instanceof SoldOutState) {
            stringBuilder.append("sold out");
        } else if (state instanceof NoQuarterState) {
            stringBuilder.append("waiting for quarter");
        } else if (state instanceof HasQuarterState) {
            stringBuilder.append("waiting for turn of crank");
        } else if (state instanceof SoldState) {
            stringBuilder.append("delivering a gumball");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
