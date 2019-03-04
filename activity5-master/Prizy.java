public class Prizy extends Wizard{
    
    static Dice dice = new Dice();
    protected int maxSkill;
    protected int currentSkill;
    
    public Prizy(String n, int s, int d, int i){
        super(n,s,d,i);
        this.maxSkill = 100;      
        this.currentSkill = maxSkill;
    }
    public int useBbqStick(){
        if(currentSkill >= 5){
            currentSkill -= 5;
            return dice.roll()+dexterity;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public int castHeal(int heal){
        if(currentSkill >= 8){
            super.heal(dice.roll() + dexterity);
            currentSkill-= 8;
        }
        return 8;
    }
    
    public int getMaxSkill(){
        return maxSkill;
    }
   
    public void setMaxSkill(int mx){
        this.maxSkill = mx;
    }
   
    public int getCurrentSkill(){
        return currentSkill;
    }
    public void setCurrentSkill(int cx){
        this.currentSkill = cx;
    }
}
