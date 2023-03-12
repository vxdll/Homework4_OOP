package Game;

import Game.Weapons.Melee;
import Game.Shields.IronShield;

public class Footman extends Warrior <Melee, IronShield> {
    public Footman(int health, String name, Melee weapon, IronShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }
}
