package Game;

import Game.Weapons.Melee;
import Game.Weapons.Ranged;
import Game.Shields.WoodShield;
import Game.Shields.IronShield;

public class Main {
    public static void main(String[] args) {
        /*Team<Footman> squadF = new Team<>();
        squadF.add(new Footman(55, "Jack", new Melee("Swod", 20)));
        squadF.add(new Footman(55, "Bim", new Melee("Axe", 35)));
        squadF.add(new Footman(55, "Lion", new Melee("Knife", 15)));

        for (Footman item: squadF) {
            System.out.println(item);
            
        }
        System.out.println(squadF.getTeamHealth());
        System.out.println(squadF.getMaxRange());
        System.out.println(squadF.getSumDamage());

        System.out.println("---------------------------------------------------------");

        Team<Warrior> squadA = new Team<>();
        squadA.add(new Archer(35, "Jams", new Ranged("Bow", 5, 50)));
        squadA.add(new Archer(35, "Nick", new Ranged("Crossbow", 15, 25)));
        squadA.add(new Footman(55, "Genry", new Melee("Axe", 35)));
        squadA.add(new Footman(55, "Carl", new Melee("Swod", 23)));

        for (Warrior item: squadA) {
            System.out.println(item);

        }
        System.out.println(squadA.getTeamHealth());
        System.out.println(squadA.getMaxRange());
        System.out.println(squadA.getSumDamage());

        Footman footman1 = new Footman(90, "Kion", new Melee("Sword", 30));
        Footman footman2 = new Footman(70, "Tor", new Melee("Hammer", 50));
        while (footman1.getHealth()>0 && footman2.getHealth()>0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("--------------");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("--------------");
        }
        if (footman1.getHealth() > 0){
            System.out.println(footman1 + " Is Winner!");
        } else{
            System.out.println(footman2 + " Is Winner!");
        }*/

        Team<Warrior> squadS = new Team<>();
        squadS.add(new Archer(86, "Arnor", new Ranged("bow", 20, 55), new WoodShield("BlackWood",25,false)));
        squadS.add(new Archer(15, "Lego", new Ranged("crossbow", 33, 45),new WoodShield("Ariel" , 30, false)));
        squadS.add(new Footman(55, "Henry", new Melee("sword", 20), new IronShield("Trent" , 80, true)));
        squadS.add(new Footman(55, "Riki", new Melee("axe", 35), new IronShield("IronMan" , 70, true)));

        for (Warrior item : squadS) {
            System.out.println(item);
        }


        System.out.println(squadS.minArmorToString(squadS.minArmor()));
    }

}
