//package student;

import java.util.Scanner;
public class Student {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Please input your ID Number: ");
        int ID_NUM = sc.nextInt();
        
        System.out.print("Please input number of credit hours earned: ");
        double CREDIT_HOURS =  sc.nextDouble();
        
        System.out.print("Please input number of points earned: ");
        double POINTS = sc.nextDouble();
        
        display(ID_NUM, CREDIT_HOURS, POINTS, gradePointAverage(CREDIT_HOURS, POINTS));
        
    }
    
    public static double gradePointAverage(double x, double y) {
        
        double GPA = y / x;
        
        return GPA;
        
    }
    
    public static double display(int w, double x, double y, double z) {
        
        System.out.println("\n\n" + "ID number: " + w
                                        + "\nCredit hours: " + x
                                        + "\nPoints earned: " + y
                                        + "\nGrade Point Average(GPA): " + z);
        
        return 0;
        
    }
    
}
