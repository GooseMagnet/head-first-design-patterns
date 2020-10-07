package com.goosemagnet.strategy.adventuregame.weapon;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
