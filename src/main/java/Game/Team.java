package Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <E extends Warrior> implements Iterable<E>{
    List<E> topTeam = new ArrayList<>();
    public void add(E e){
        topTeam.add(e);
    }


    @Override
    public Iterator<E> iterator() {
        return topTeam.iterator();
    }

    public int getTeamHealth(){
        int teamHealth = 0;
        for (E hero: topTeam){
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange(){
        int maxRange = 0;
        for (E hero: topTeam){
            if(hero instanceof Archer){
                Archer archer = (Archer) hero;
                if(maxRange < archer.range()){
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage(){
        int sumDamage = 0;
        for (E hero: topTeam) {
            sumDamage += hero.getWeapon().damage();
        }
        return sumDamage;
    }

    public E minArmor(){
        E element = null;
        for (E hero : topTeam) {
            if (hero.isShielded()) {
                if (element == null) {
                    element = hero;
                }
                Warrior shielded = (Warrior) hero;
                if ( element.shield.shieldHealth() > shielded.shield.shieldHealth()) {
                    element = hero;
                }
            }

        }
        return element;
    }

    public String minArmorToString(E e){
        if (e == null){
            return "there is no one with a shield";
        }
        return e + " is the weakest shield";

    }





}
