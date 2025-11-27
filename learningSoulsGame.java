package lsg;

import lsg.characters.*;
import lsg.weapons.*;
// class learningSoulsGame
class learningSoulsGame{
     public static void main(String args[])
    {
        // objets 
        // Hero / Monster
        //Monster m2 = new Monster();

        for(int i = 0; i < 10; i++)
        {
            Sword w = new Sword();
            Hero h = new Hero("Gregooninator");
            eh.setLife(100);
            h.setStamina(50);
            Monster m2 = new Monster();
           System.out.println(h.toAlive());
            //System.out.println(h);
            System.out.println(w);
           int val = h.attackWith(w);
           System.out.println(val);
           w.use();
           System.out.println();
           System.out.println(m2.toAlive());
           System.out.println(w);
           int val1 = m2.attackWith(w);
           System.out.println(val1);
           w.use();
        }

       
}
}