package character;

 abstract class Swordsman extends Character implements Weapon, Armor {

	 protected int maxMagic;
	 protected int currentMagic;
	 static Dice dice = new Dice();
    int mindTransfer;

    String s ="Swordsman";
    public Swordsman(String n, int s, int d, int i) {
      super (n, s, d, i);
      maxMagic = 10;
      currentMagic = maxMagic;  
    }

      public int swordSlash() {

        if(currentMagic >=5 ){

        currentMagic = (currentMagic - 5) ;   

        return dice.roll()+getStrength();
        }

        return 0;

    }

   public int mindTransfer() {

        mindTransfer = dice.roll()+getStrength();

        if(currentMagic >=8 ){

            currentMagic = (currentMagic - 8)+dice.roll()+currentlife;   

             

        }

        return mindTransfer;

    }
 int getMaxMagic() {

        maxMagic = dice.roll()+10;

        return maxMagic;

    }

     

     

    public int getCurrentMagic() {

        currentMagic = maxMagic;

        return currentMagic;

    }
    @Override
    public int useWeapon() {
        return dice.roll() + strength;
    }

    @Override
    public int useArmor() {
        return dice.roll() + strength;
    }
    
    
    @Override
    int attack() {
    	return dice.roll()+strength;
    }

}
