/*  Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!  */

/*
Sample Input

12.00
20
8
Sample Output

The total meal cost is 15 dollars.  */

SOLUTION:

import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double tip,tax,totalcost;
        tip=mealCost*tipPercent/100;
        tax=mealCost*taxPercent/100;
        totalcost=mealCost+tip+tax;
        scan.close();
      
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalcost);
      System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}
