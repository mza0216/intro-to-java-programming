/**
* This program 
*
* M2: Project 2
* @author Marc Atienza CPSC-1210-AO1
* @version 8/26/2021
*/

import java.util.Scanner;

public class SquareUnits {
  /** 
   * Prints Hello World one time. 
   * @param args Command line arguments – not used.
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int max = 1000000000;
      int area = 0;
      int acres = 0;
      int sqYards = 0;
      int sqFeet = 0;
      int sqInches = 0;
      
      System.out.print("Enter the area in square inches: ");
      area = userInput.nextInt();
      
      if (area >= max) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      else {
         acres = area / 6272640;
         sqYards = (area % 6272640) / 1296;
         sqFeet = ((area % 6272640) % 1296) / 144; 
         sqInches = (((area % 6272640) % 1296) % 144);  
         
         System.out.println("Number of Units: ");
      
         System.out.println("\tAcres: " + acres);
      
         System.out.println("\tSquare Yards: " + sqYards);
      
         System.out.println("\tSquare Feet: " + sqFeet);
         
         System.out.println("\tSquare Inches: " + sqInches);
      
      }
   }

} 


