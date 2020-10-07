package com.goosemagnet.strategy.adventuregame.weapon;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shooting arrow with a bow");
    }
}
