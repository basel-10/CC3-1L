import java.util.Scanner;
public class CharacterDuel {
    
    public static void main(String[] rakrakan){
        Wizard teri = new Wizard("Yahki" , 40, 40, 50);
        teri.setMaxLife(200);
        Prizy rite = new Prizy("Dope", 40, 40, 50);
        rite.setMaxLife(200);
        
         int life1 = teri.maxlife;
         int life2 = rite.maxlife;
         int round = 1;
         
          do {
                int atk1 = teri.castLightningBolt();
                int atk2 = rite.useBbqStick();
                Scanner sc = new Scanner(System.in);
                
                life2 = life2 - atk1;
                System.out.println("\t****ROUND"+round+"****");
                System.out.println("Press [Enter] to continue!");
                sc.nextLine();
                System.out.println( teri.getName() + " attacked " + rite.getName()+"!\n"
                        + "for "+atk1+" hp!");
                System.out.println(teri.getName()+" casted Lightning bolt!");
                System.out.println(teri.getName() +"'s magic level is: " + teri.getCurrentMagic());
                System.out.println(rite.getName() +"'s LIFE METER: "
                        + "" +life2 +"/100");
                System.out.println("[wow magic***]\n" + teri.getName() + " is healed by: " + teri.castHeal(15) + "%");
                System.out.println(teri.getName()+"'s life is now: " + teri.getMaxLife());
                life1 = life1 - atk2;
                System.out.println( rite.getName() + " attacked " + teri.getName()+"!\n"
                        + "for "+atk2+" hp!");
                System.out.println(rite.getName() + " used Bbq Stick to slay!");
                System.out.println(rite.getName()+ "'s skill is lessen by "+ rite.getCurrentSkill());
                System.out.println(teri.getName()+"'s LIFE METER: "
                        + "" +life1 + "/100");
                System.out.println("[wow magic***]\n" + rite.getName() + " is healed by: " + rite.castHeal(15)+ "%");
                System.out.println(rite.getName()+ "'s life is now: " + rite.getMaxLife());
                System.out.println("");
                round++;
                
            }
          while (life1 >= 0 || life2 >= 0);
            
            System.out.println("\t---------WINNER!------");
            if(life1 <= 0){
                System.out.println( "\t"+rite.getName() + " Won!\n"
                        + "\t"+teri.getName() + " died!");
            }
            else if(life2 <= 0){
                System.out.println( "\t"+teri.getName() + " Won!\n"
                        + "\t"+rite.getName()+ " died!");
            }
            else{
                System.out.println("/t[Draw.....]");
                
            }
          
          
    }
}
