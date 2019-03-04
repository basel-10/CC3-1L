
//package labactivity2;

import java.util.Scanner;


public class Exponent {
    
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to calculates : " );
    int num = sc.nextInt();
    System.out.println("The square resuilt  is  : " +squares(num) + "\nThe cube resuilt is : "+cubes(num) );
    
    }
    
    
    static int squares(int num){
    
    return num * num;
    }
    
     static int cubes(int num){
    
    return num * num * num;
    }
    
    
}
