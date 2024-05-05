//console based app of odring food using java

import java.util.*;
import java.util.Scanner;

public class foodorder
{
    //declearin variable for price of food items

    int frenchfries=100;
    int burger=120;
    int pasta=100;
    int pizza=200;
    int coldcoffee=100;
    int coldrink=80;
    int icetea=80;
    int ch;
    int quantity;
    int total;
    String again;

    Scanner sc=new Scanner(System.in);
    //creating a method for displaying food menu
    public void displaymenu()
    {
        System.out.println();
        System.out.println("************************ WELCOME TO OUR CAFE **********************");
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************************");

        System.out.println("************************ OUR MENU ARE *****************************");
        System.out.println("          1. French Fries               100/-");
        System.out.println("          2. Burger                     120/-");
        System.out.println("          3. Pasta                      100/-");
        System.out.println("          4. Pizza                      200/-");
        System.out.println("          5. Cold Coffee                100/-");
        System.out.println("          6. Cold Drink                 80/-");
        System.out.println("          7. Ice Tea                    80/-");
        System.out.println("          8. Exit                           ");
        System.out.println();
        System.out.println("*******************************************************************");
    }


    //creating generate bill method
    public void generatebill()
    {
        System.out.println();
        System.out.println("********************** Thanks For Ordering *************************");
        System.out.println();
        System.out.println("**********************  Your Bill is :- "+total+"  *********************");
    }

    //creating a method to order a food item using switch case

    public void order()
    {
        while(true)
        {
           System.out.println("Enter your choice ");
           ch=sc.nextInt();
          switch(ch)
          {
            case 1:
                System.out.println("You have selected French Fries");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * frenchfries;
                break;

            case 2:
                System.out.println("You have selected Burger");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * burger;
                break;

            case 3:
                System.out.println("You have selected pasta");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * pasta;
                break;

            case 4:
                System.out.println("You have selected Pizza");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * pizza;
                break;

            case 5:
                System.out.println("You have selected Cold coffee");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * coldcoffee;
                break;

            case 6:
                System.out.println("You have selected Cold drink");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * coldrink;
                break;

            case 7:
                System.out.println("You have selected Ice Tea");
                System.out.println();
                System.out.println("Enter the desired Quantity");
                quantity = sc.nextInt();
                total = total + quantity * icetea;
                break;

            case 8://exit
                System.exit(1);
                break;

            default:
                break;
           }

            System.out.println();
            System.out.println("Do you wish to order anything else(Y/N) : ");
            again= sc.next();
            if(again.equalsIgnoreCase("Y"))
            {
                order();
            } else if (again.equalsIgnoreCase("N"))
            {
                generatebill();
                System.exit(1);
            }
            else
            {
                System.out.println("invalid choice");
            }
        }
    }
}


