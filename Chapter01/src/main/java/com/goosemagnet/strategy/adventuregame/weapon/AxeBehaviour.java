package com.goosemagnet.strategy.adventuregame.weapon;

public class AxeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
