package com.goosemagnet.proxy.gumballmachine;

import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineRemote.getLocation());
            System.out.println("Current Inventory: " + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current State: " + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
