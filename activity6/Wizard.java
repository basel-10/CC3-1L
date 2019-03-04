package character;

public class Wizard extends Character 
implements Weapon, Armor

{
    protected int maxMagic;
    protected int currentMagic;
    static Dice dice = new Dice();

    @Override
    int attack() { 
        return dice.roll() + getStrength();   
    }
    
    public Wizard(String n, int s, int d, int i){
        super(n,s,d,i);
        this.maxMagic = 100;
        this.currentMagic = maxMagic;
    }
    public int castLightningBolt(){
        if(currentMagic >= 5){
            currentMagic -= 5;
            return dice.roll()+intelligence;
        }
        else{
            return 0;
        } 
    }
    public int castHeal(int heal){
        if(currentMagic >= 8){
            super.heal(dice.roll() + intelligence);
            currentMagic-= 8;
        }
        return 8;
    }
    public int getMaxMagic(){
        return maxMagic;
    }
    public void setMaxMagic(int mm){
        this.maxMagic = mm;
    }
    public int getCurrentMagic(){
        return currentMagic;
    }
    public void setCurrentMagic(int cm){
        this.currentMagic = cm;
    }

    @Override
    public int useWeapon() {
        return dice.roll() + getStrength();
                }

    @Override
    public int useArmor() {
        return dice.roll() + getStrength()+castHeal();
    }

 
    
}
