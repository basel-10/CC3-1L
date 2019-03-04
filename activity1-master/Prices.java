//package labActivity;

import java.util.Scanner;
import java.lang.Math;
public class Prices {
 static double sum = 0.0;
 static double less = 5.33;
 static double aveage = 0.0;
 static double prices[] = new double[10];
 
 void sum(){
	 
	 int i = 0;
		do {
			this.sum += prices[i];
			i++;
		}while(i<prices.length);
		System.out.println("The sum of prices is $"+sum);	
 }
 
 void lessthan(){
		System.out.print("The prices less than $"+less + " are : ");
		for(int i =0; i<prices.length; i++) {
			if(prices[i] < less) {
				System.out.print("$" + prices[i] + " ");
			}
		}
		System.out.println();
 }
 
 void aveage() {
	 aveage = sum /prices.length; 
	 System.out.println("The aveage of prices is $"+aveage); 
 }
 
 void aveagehigher(){
		System.out.print("The prices higher than $"+aveage + " are : ");
		for(int i =0; i<prices.length; i++) {
			if(aveage < prices[i]) {
				System.out.print("$" + prices[i] + " ");
			}
		}
		System.out.println();
}
 Prices(){
	 Scanner sc = new Scanner(System.in);
		
		int i = 0;
	
		
		do {
			System.out.print("Enter price " +(i+1)+" : ");
			this.prices[i] = sc.nextDouble();
			i++;
		}while(i<this.prices.length);
 }
	public static void main(String[] args) {
	Prices price = new Prices();
	price.sum();
	price.lessthan();
	price.aveage();
	price.aveagehigher();
	
	
	}
	
	
	
	
	

}
