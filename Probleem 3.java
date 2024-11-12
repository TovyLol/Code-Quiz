/*
 * Wij krijgen te veel errors!!!

 * Kijk op de site https://www.w3schools.com voor tips en tricks

    Dit kan op meerdere manieren worden opgelost!
 
 */
import java.util.Scanner;

public class Probleem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your name: ");
        int naam = scanner.nextLine();

       
        System.out.print("Enter your age: ");
        String age = scanner.nextInt();

        
        if (jaar >= 18) {
            System.out.println("Hello, " + naam + "! Welcome to the adult world!");
        } else {
            System.out.println("Hello, " + naam + "! Enjoy your youth!");
        }

        scanner.uitdoen();
    }
}
