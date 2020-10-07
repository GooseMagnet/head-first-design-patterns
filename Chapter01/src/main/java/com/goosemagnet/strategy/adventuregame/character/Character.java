package com.goosemagnet.strategy.adventuregame.character;

import com.goosemagnet.strategy.adventuregame.weapon.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public void setWeapon(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public abstract void fight();
}
