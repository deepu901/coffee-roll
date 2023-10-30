package coffeeandroll; 
/**
 *
 * Submitted By: Deepu Chaudhary (id: s4608481) and Taniya Gauchan ( id: s4602218)
 * Unit: NIT2112 OBJECT ORIENTED PROGRAMMING
 * Date : 12 Feburary, 2020
 */
import java.util.Scanner;
/**
     * taking the order from the customer and calculate:
     * the total amount he has to pay 
     * the change which is to be given by the shop owner to the customer
     * the currency denomination 
     * the total sale of each product of each day
     */
public class CoffeeAndRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("______________________________________");
        System.out.println("--------------------------------------\n");
        System.out.println("1.   Schnitzel Roll    $18.80");
        System.out.println("2.   Fish Roll         $17.25");
        System.out.println("3.   Lamb Roll         $14.60");
        System.out.println("4.   Ice Cream Roll    $6.75");
        System.out.println("5.   Coffee Latte      $3.40");
        System.out.println("6.   Done   ");
        System.out.println("______________________________________\n");
        Scanner sc = new Scanner(System.in);
        int ch;
        int quant, cSRoll = 0, cFRoll = 0, cLRoll = 0, cICRoll = 0, cCRoll = 0;
        double salesamt = 0, paid = 0, amt = 0;
        System.out.print("Enter the item you want to order:");
        ch = sc.nextInt();
        while (ch != 6) {
            System.out.print("Enter quantity ordered:");
            quant = sc.nextInt();

            switch (ch) {

                case 1:
                    salesamt = Math.round((quant * 18.80) * 100.0) / 100.0;
                    System.out.println("Sale price: "+salesamt);
                    System.out.print("Enter the amount paid in cents[0-100000]:");
                    paid = sc.nextDouble();
                    amt = Math.round(((paid/100) - salesamt) * 100.0) / 100.0;
                    if (amt < 0) {
                        System.out.print("Piad Amount is less");
                    } else {
                        cSRoll += quant;
                        System.out.println("The change is: " + amt);
                        String damt = String.valueOf(amt);
                        int indexOfDecimal = damt.indexOf(".");
                        int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                        int centPart = Integer.parseInt(damt.substring(indexOfDecimal+1));
                        System.out.println("\nThe change returned to the customer is: ");
                        System.out.println("----------------------------------------");
                        countCurrencyDollar(dollarPart);
                        if(centPart%5!=0){
                            centPart *= 10;
                        }
                        countCurrencyCent(centPart);
                        salesamt = 0;
                        paid = 0;
                        amt = 0;
                    }

                    break;
                case 2:
                    salesamt = Math.round((quant * 17.25) * 100.0) / 100.0;
                    System.out.println(salesamt);
                    System.out.print("Enter the amount paid in cents[0-100000]:");
                    paid = sc.nextDouble();
                    amt = Math.round(((paid/100) - salesamt) * 100.0) / 100.0;
                    if (amt < 0) {
                        System.out.print("Piad Amount is less");
                    } else {
                        cFRoll += quant;
                        System.out.println("The change is: " + amt);
                        String damt = String.valueOf(amt);
                        int indexOfDecimal = damt.indexOf(".");
                        int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                        int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                        System.out.println("\nThe change returned to the customer is: ");
                        countCurrencyDollar(dollarPart);
                        if(centPart%5!=0){
                            centPart *= 10;
                        }
                        countCurrencyCent(centPart);
                        salesamt = 0;
                        paid = 0;
                        amt = 0;
                    }
                    break;
                case 3:
                    salesamt = Math.round((quant * 14.60) * 100.0) / 100.0;
                    System.out.println(salesamt);
                    System.out.print("Enter the amount paid in cents[0-100000]:");
                    paid = sc.nextDouble();
                    amt = Math.round(((paid/100) - salesamt) * 100.0) / 100.0;
                    if (amt < 0) {
                        System.out.print("Piad Amount is less");
                    } else {
                        cLRoll += quant;
                        System.out.println("The change is: " + amt);
                        String damt = String.valueOf(amt);
                        int indexOfDecimal = damt.indexOf(".");
                        int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                        int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                        System.out.println("\nThe change returned to the customer is: ");
                        countCurrencyDollar(dollarPart);
                        if(centPart%5!=0){
                            centPart *= 10;
                        }
                        countCurrencyCent(centPart);
                        salesamt = 0;
                        paid = 0;
                        amt = 0;
                    }
                    break;
                case 4:
                    salesamt = Math.round((quant * 6.75) * 100.0) / 100.0;
                    System.out.println(salesamt);
                    System.out.print("Enter the amount paid in cents[0-100000]:");
                    paid = sc.nextDouble();
                    amt = Math.round(((paid/100) - salesamt) * 100.0) / 100.0;
                    if (amt < 0) {
                        System.out.print("Piad Amount is less");
                    } else {
                        cICRoll += quant;
                        System.out.println("The change is: " + amt);
                        String damt = String.valueOf(amt);
                        int indexOfDecimal = damt.indexOf(".");
                        int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                        int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                        System.out.println("\nThe change returned to the customer is: ");
                        countCurrencyDollar(dollarPart);
                        if(centPart%5!=0){
                            centPart *= 10;
                        }
                        countCurrencyCent(centPart);
                        salesamt = 0;
                        paid = 0;
                        amt = 0;
                    }
                    break;
                case 5:
                    salesamt = Math.round((quant * 3.40) * 100.0) / 100.0;
                    System.out.println(salesamt);
                    System.out.print("Enter the amount paid in cents[0-100000]:");
                    paid = sc.nextDouble();
                    amt = Math.round(((paid/100) - salesamt) * 100.0) / 100.0;
                    if (amt < 0) {
                        System.out.print("Piad Amount is less");
                    } else {
                        cSRoll += quant;
                        System.out.println("The change is: " + amt);
                        String damt = String.valueOf(amt);
                        int indexOfDecimal = damt.indexOf(".");
                        int dollarPart = Integer.parseInt(damt.substring(0, indexOfDecimal));
                        int centPart = Integer.parseInt(damt.substring(indexOfDecimal + 1));
                        System.out.println("\nThe change returned to the customer is: ");
                        countCurrencyDollar(dollarPart);
                        if(centPart%5!=0){
                            centPart *= 10;
                        }
                        countCurrencyCent(centPart);
                        salesamt = 0;
                        paid = 0;
                        amt = 0;
                    }
                    break;
            }

            System.out.println("______________________________________");
            System.out.println("--------------------------------------");

            System.out.println("1.   Schnitzel Roll    $18.80");
            System.out.println("2.   Fish Roll         $17.25");
            System.out.println("3.   Lamb Roll         $14.60");
            System.out.println("4.   Ice Cream Roll    $6.75");
            System.out.println("5.   Coffee Latte      $3.40");
            System.out.println("6.   Done   \n");
            System.out.println("----------------------------------------\n");
            System.out.print("\nEnter the item you want to order:");
            ch = sc.nextInt();

        }
        double tot = 0, total = 0;
        if (ch == 6) {
            tot = (double) ((cSRoll * 18.80) + (cFRoll * 17.25) + (cLRoll * 14.60) + (cICRoll * 6.75) + (cCRoll * 3.40));
            total = Math.round(tot * 100.0) / 100.0;
            System.out.print("Total Schnitzel Roll Sales:         $" + Math.round((cSRoll * 18.80) * 100.0) / 100.0);
            System.out.print("\nTotal Fish Roll Sales:            $" + Math.round((cFRoll * 17.25) * 100.0) / 100.0);
            System.out.print("\nTotal Lamb Roll Sales:            $" + Math.round((cLRoll * 14.60) * 100.0) / 100.0);
            System.out.print("\nTotal Ice Cream Roll Sales:       $" + Math.round((cICRoll * 6.75) * 100.0) / 100.0);
            System.out.print("\nTotal Coffee Roll Sales:          $" + Math.round((cCRoll * 3.40) * 100.0) / 100.0);
            System.out.print("\n                                ---------");
            System.out.print("\nTotal Daily Sales:                $" + total);
        }

    }
    /**
     * this method takes input from main in int data types and calculates the currency denomination for dollar
     */

    public static void countCurrencyDollar(int amount) {
        int[] notes = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[7];

        // count notes using Greedy approach 
        for (int i = 0; i < 7; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes 
        for (int i = 0; i < 7; i++) {
            if (noteCounter[i] != 0) {
                if (i <= 4) {
                    System.out.println("Number of " + notes[i] + " Dollar Notes : "
                            + noteCounter[i]);
                } else {
                    System.out.println("Number of " + notes[i] + " Dollar coins : "
                            + noteCounter[i]);
                }
            }
        }
    }

    /**
     * this method takes input from main in int data types and calculates the currency denomination for cents
     */
    public static void countCurrencyCent(int amount) {
        int[] notes = new int[]{50, 20, 10, 5};
        int[] noteCounter = new int[4];

        // count notes using Greedy approach 
        for (int i = 0; i < 4; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes 
        for (int i = 0; i < 4; i++) {
            if (noteCounter[i] != 0) {
                System.out.println("Number of " + notes[i] + " cents coinss : "
                        + noteCounter[i]);
            }
        }
    }

}
