package com.goosemagnet.strategy.adventuregame.character;

public class Queen extends Character {
    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
