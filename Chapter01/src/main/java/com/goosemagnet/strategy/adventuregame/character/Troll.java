package com.goosemagnet.strategy.adventuregame.character;

public class Troll extends Character {
    @Override
    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
