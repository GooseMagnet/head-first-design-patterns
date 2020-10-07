package com.goosemagnet.strategy.adventuregame.character;

public class King extends Character {
    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
