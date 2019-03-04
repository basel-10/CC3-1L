//package labActivity;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PizzaChoice {

	public static void main(String[] args) {

		JOptionPane j = new JOptionPane();	
		Scanner sc = new Scanner(System.in);
		String Char[] = {"S","M","L","X","s", "m", "l", "x"};
		String size[] = {"a small", "a mediam", "a large", "an extra large"};
		double cost[] = {6.99, 8.99, 12.50, 15.00};
		String input = j.showInputDialog(null, "Enter Pizza Size [ S , M , L or X]: ");
		int index = 4;
		for(int i=0; i<Char.length / 2; i++) {
			if(input.equals(Char[i]) || input.equals(Char[4+i])) {
				index = i;
			}
			  }
		if(index < 4) {
			j.showMessageDialog(null, "The pizza of "+size[index] +" pizza is $"+ cost[index]);	
		}else {
			j.showMessageDialog(null, "invalid.");
		}
		
		String tryagain = j.showInputDialog(null, "Do you want to try again ?");
		if(tryagain.equals("Y") || tryagain.equals("y")) {
			main(args);
		}else {
			j.showMessageDialog(null, "Have a nice day!");
			  }
		
	}
}  
		

