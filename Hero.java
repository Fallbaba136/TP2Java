package TP2Java;

public class Hero 
{
    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    // getters methode qui permet de lire la valeur d'un attribut prive
    // setters methode qui permemt de modifier la valeur d'un attribut prive 
    public String getName()
    {
        return name;
    }
    public void setName(String name){  this.name = name;}

    public int getLife() {return life;} 
    public void setLife(int life){this.life = life; }
    public int getMAxLife(){  return maxLife;}
    public void setMaxLife(int maxLife){ this.maxLife = maxLife; }
    public int getStamina(){ return stamina;}
    public int getMaxStamina(){  return maxStamina;}
    public void setMaxStamina(int maxStamina){  this.maxStamina = maxStamina;}
    public Hero(String name, int life, int stamina) 
    {   this.name = name;
        this.life = life;
        this.stamina = stamina;
    }
    public Hero()
    {
        this.name = "Gregooninator";
        this.life = 100;
        this. stamina = 50;
        
    }
    public void printStats(){
      System.out.println("[Hero]\t" + name + "\tLIFE: " + life + "\tSTAMINA: " + stamina);
    }
    public String toString() {
        return "[Hero] " + name + " | Vie: " + life + " | Stamina: " + stamina;
    }
}
class LeatningSoulsGame{
    public static void main()
    {
        
    }

}

class Main
{
    public static void main(String args[])
    {
        Hero h = new Hero("Gregooninator", 100, 50);
       // h.printStats();
        System.out.println(h);

    }
}