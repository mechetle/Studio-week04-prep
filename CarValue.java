import java.io.Console;
import java.util.Scanner;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean programON = true;

      while(programON){
         Car myCar = new Car();
         
         System.out.println("Model year:");
         int userYear = scnr.nextInt();
         System.out.println("Purchase price:");
         int userPrice = scnr.nextInt();
         System.out.println("Selling year:");
         int userCurrentYear = scnr.nextInt();
         
         myCar.setModelYear(userYear);
         myCar.setPurchasePrice(userPrice);
         myCar.calcCurrentValue(userCurrentYear);
         
         myCar.printInfo();

         System.out.println();
         System.out.println("Find out another car's price? (Y/N)");

         String continueQ = scnr.next();
         if (continueQ.equals("Y") || continueQ.equals("y")) {
            System.out.println();

         } else if (continueQ.equals("N") || continueQ.equals("n")) {
            System.out.println("Okay, see you then!");
            programON = false;
         }
      }
      /* testting:
      2011
      18000
      2018
      */
   }
}