

import java.util.Scanner;


public class activity2 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Inputted number Zero");
        } else if (number % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
        sc.close();
    }
    
}
    

