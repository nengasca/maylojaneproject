
package janeproject;

import java.util.Scanner;


public class Janeproject {

   
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int history = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

        int totalMarks = science + history + math + soc + arts;
        double percentage = totalMarks / 5.0;
        String remarks;
        
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 70 && percentage < 76) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage < 81) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage < 86) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage < 91) {
            remarks = "Very Good";
        } else if (percentage >= 91 && percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid Percentage";
        }
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage < 70) {
            System.out.println("Try Again " + name);
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }
        sc.close();    
      
    }
    
}
        
    
    

