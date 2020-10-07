package com.goosemagnet.strategy.adventuregame;

import com.goosemagnet.strategy.adventuregame.character.*;
import com.goosemagnet.strategy.adventuregame.character.Character;
import com.goosemagnet.strategy.adventuregame.weapon.AxeBehaviour;
import com.goosemagnet.strategy.adventuregame.weapon.BowAndArrowBehaviour;
import com.goosemagnet.strategy.adventuregame.weapon.KnifeBehaviour;
import com.goosemagnet.strategy.adventuregame.weapon.SwordBehaviour;

public class ActionAdventureGame {

    public static void main(String[] args) {
        Character king = new King();
        Character troll = new Troll();
        Character queen = new Queen();
        Character knight = new Knight();

        king.setWeapon(new KnifeBehaviour());
        king.fight();

        troll.setWeapon(new AxeBehaviour());
        troll.fight();

        knight.setWeapon(new SwordBehaviour());
        knight.fight();

        queen.setWeapon(new BowAndArrowBehaviour());
        queen.fight();
    }
}
