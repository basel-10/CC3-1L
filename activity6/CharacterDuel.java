package character;

public class CharacterDuel implements Weapon, Armor {

	CharacterDuel(){
		System.out.println("Weapon : " + useWeapon() + "\nArmor : "+ useArmor() );
	}
	
	
	static Wizard wizard = new Wizard("Nami",3,4,5);
	static Wizard swordsman = new Wizard("Zoro",6,5,4);
	static Dice dice = new Dice();
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(wizard.getCurrentMagic() <= 10) {
				swordsman.wound(wizard.castLightningBolt());
				System.out.println(wizard.getName() + " casts a lightning bolt to " + swordsman.getName() + " for " + wizard.castLightningBolt());
			}else if (wizard.getCurrentMagic() >= 10) {
				swordsman.wound(wizard.castLightningBolt());
				System.out.println(wizard.getName() + " uses sword to attack " + swordsman.getName() + " for " + wizard.castLightningBolt());
			}	
		}
		
		new CharacterDuel();
	}

	@Override
	public int useArmor() {
		return dice.roll() + wizard.strength;
	}

	@Override
	public int useWeapon() {
		return dice.roll() + wizard.strength;
	}
	
	
	

}
