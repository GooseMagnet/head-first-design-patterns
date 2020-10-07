package com.goosemagnet.strategy.adventuregame.character;

public class Knight extends Character {
    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
