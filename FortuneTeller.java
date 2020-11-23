
import java.util.Scanner;
//fortune teller program 
public class FortuneTeller {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to FORTUNE TELLER, type quit to abort");
        
       
        System.out.println("What is your first name?");
        String entry1 = input.nextLine().toLowerCase();
        
        System.out.println("What is your last name?");
        String entry2 = input.nextLine().toLowerCase();
        
        System.out.println("How old are you?");
        int entry3 = input.nextInt();
        
        System.out.println("What is your birth month, please enter 1 for jan, 2 for feb etc?");
        int entry4 = input.nextInt();
    
       
        System.out.println("What is your favorite ROYGBIV Color?");
        String entry5 = input.nextLine().toLowerCase();
            
        System.out.println("Type help for a list of colors?");
        String entry6 = input.nextLine().toLowerCase();
       
            if ("help".equals (entry6)) {
                System.out.println("red, orange, yellow, green, blue, indigo, violet");
                
            } 
            //fix this code need second input if is true//
        
        System.out.println("How many siblings do you have?");
        int entry8= input.nextInt();
        
        System.out.print(entry1 + " ");
        System.out.print(entry2 + " ");
        
        
            if (entry3 %2 == 0) {
                System.out.print("will retire in 50 years");
            } else {
                System.out.print("will retire in 5 years");
            }
        
            if (entry4 == 1) {
                System.out.println(" with $1,000,000,000 in the bank,");
            } else if (entry4 == 2) {
                System.out.println(" with $2,000,000,000 in the bank,");
            } else if (entry4 == 3) {
                System.out.println(" with $3,000,000,000 in the bank,");
            } else if (entry4 == 4) {
                System.out.println(" with $4,000,000,000 in the bank,");
            } else if (entry4 == 5) {
                System.out.println(" with $12,000 in the bank,"); 
            } else if (entry4 == 6) {
                System.out.println(" with $15,000 in the bank,");
            } else if (entry4 == 7) {
                System.out.println(" with $20,000 in the bank,");
            } else if (entry4 == 8) {
                System.out.println(" with $25,000 in the bank,");
            } else if (entry4 == 9) {
                System.out.println(" with $1,000 in the bank,"); 
            } else if (entry4 == 10) {
                System.out.println(" with $500 in the bank,");   
            } else if (entry4 == 11) {
                System.out.println(" with $100 in the bank,"); 
            } else if (entry4 == 12) {
                System.out.println(" with $10 in the bank,");
            } else {
                System.out.println(" with $0.00 in the bank,");
            }   
            
            if (entry8 == 0) {
                System.out.print("a vacation home in Tampa, Florida,");
            } else if (entry8 == 1) {
                System.out.print("a vacation home in Las Vegas, Nevada,");
            } else if (entry8 == 2) {
                System.out.print("a vacation home in New York City, New York,");
            } else if (entry8 > 3) {
                System.out.print("a vacation home in Los Angeles, California,");
            } else if (entry8 < 0) {
                System.out.print("a vacation home in Detroit, Michigan,");
            }
                   
           if ("red".equals (entry6)) {
               System.out.print("and travel by a sports car");
           } else if ("orange".equals (entry6)) {
               System.out.print("and travel by horseback");
           } else if ("yellow".equals (entry6)) {
               System.out.print("and travel by a bike");
           } else if ("green".equals (entry6)) {
               System.out.print("and travel by foot");
           } else if ("blue".equals (entry6)) {
               System.out.print("and travel by camel");
           } else if ("indigo".equals (entry6)) {
               System.out.print("and travel by a semi truck");
           } else if ("violet".equals (entry6)) {
               System.out.print("and travel by a your mom's sedan");
           }
           
           
           
 }
}