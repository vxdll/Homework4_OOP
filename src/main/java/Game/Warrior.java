package Game;

import java.util.Random;

public abstract class Warrior <W extends Weapon, S extends Shield> {
    private int health;
    private String name;
    protected W weapon;
    protected S shield;

    private boolean shielded;

    protected Warrior(int health, String name, W weapon, S shield) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.shielded = true;
    }

    public boolean isShielded() {
        return shielded;
    }

    public int damageFork() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public boolean hit(Warrior recepient) {
        int damage = damageFork();
        return !recepient.reduceHealth(damage);
    }

    public boolean reduceHealth(int damage) {
        health -= damage;
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        if (shielded) {
            return "Warrior{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    ", shield=" + shield +
                    '}';
        } else {
            return "Warrior{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    '}';
        }
    }
}