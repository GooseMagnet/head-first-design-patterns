package com.goosemagnet.strategy.adventuregame.weapon;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
