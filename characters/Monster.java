package lsg.characters;

import lsg.helper.Dice;
import lsg.weapons.Weapon;

public class Monster extends Character{

    public static int INSTANCES_COUNT = 0;
  // 1.3 constructeur 
    public Monster(String name)  
    { 
    INSTANCES_COUNT++;
    this.name = name;
}

public Monster()
{
    INSTANCES_COUNT++;
    name = "Monster_" + INSTANCES_COUNT; // nom du hero 
    life = 10; // nombre de point de vie 
    maxLife = 10; // nombre maximal de point de vie 
    stamina = 10; // la force restante
    maxStamina = 10; // force maximal
}

public int attackWith(Weapon weapon)
    {
        if(weapon.isBroken()) return 0;
        else
        {
            Dice d = new Dice(101);
           float precision = (float)d.roll() / 100;
            int amplitude = weapon.getMaxDamage() - weapon.getMinDamage();
            int bonus = Math.round(amplitude * precision);
            int degat = weapon.getMinDamage() + bonus;
            return degat;
        }

    }
   
}
