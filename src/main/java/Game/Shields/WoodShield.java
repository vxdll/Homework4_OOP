package Game.Shields;

import Game.Shield;

public class WoodShield implements Shield {

    String shieldName;

    private int damageThreshold;

    public int getDamageThreshold() {
        return damageThreshold;
    }

    private boolean isStrapped;

    public WoodShield(String shieldName, int damageThreshold, boolean isStrapped) {
        this.shieldName = shieldName;
        this.damageThreshold = damageThreshold;
        this.isStrapped = isStrapped;
    }

    public boolean isStrapped() {
        return isStrapped;
    }

    @Override
    public int shieldHealth() {
        return damageThreshold;
    }

    @Override
    public String toString() {
        return "WoodShield{" +
                "shieldName='" + shieldName + '\'' +
                ", damageTreshold=" + damageThreshold +
                '}';
    }
}