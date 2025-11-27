package lsg.characters;

import lsg.helper.Dice;
import lsg.weapons.Weapon;

//class Hero
public class Hero extends Character
{
    
    // 1.3 constructeurs 
    public Hero(String name)  { this.name = name;}
    public Hero() {name = "Gregooninator"; }

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



