package Game;

import Game.Weapons.Ranged;
import Game.Shields.WoodShield;
public class Archer extends Warrior<Ranged, WoodShield>{
    public Archer(int health, String name, Ranged ranged, WoodShield shield){
        super(health, name, ranged, shield);
    }

    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public int range(){
        return ((Ranged)weapon).getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }
}
