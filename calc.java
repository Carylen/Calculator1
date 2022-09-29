import java.util.Scanner;

/*
 * Namae : Irham Zharfan
 * Student ID : 2502007880
 * Class : LA75
 */

public class calc {
    public class number
    {
        public static int first, second, choice;
        public static int total = 0;
    }

    public static void cls() // For Clear Screen
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

                                    /*  function for the operation   */

    public static void addition()
    {
        if (number.total == 0) 
        {
            number.total = number.first;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print(number.total + " + ");
        number.second = scan.nextInt();
        number.total += number.second;
    }

    public static void substraction()
    {
        if (number.total == 0) 
        {
            number.total = number.first;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print(number.total + " - ");
        number.second = scan.nextInt();
        number.total -= number.second;
    }

    public static void multiPly() 
    {
        if (number.total == 0) 
        {
            number.total = number.first;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print(number.total + " * ");
        number.second = scan.nextInt();
        number.total *= number.second;
    }

    public static void divide() 
    {
        if (number.total == 0) 
        {
            number.total = number.first;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print(number.total + " / ");
        number.second = scan.nextInt();
        number.total /= number.second;
    }

    public static void module() 
    {
        if (number.total == 0) 
        {
            number.total = number.first;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print(number.total + " % ");
        number.second = scan.nextInt();
        number.total %= number.second;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        do
        {
            cls();
            System.out.println("----- Calculator Online -----\n");
            System.out.println("=>Total : " + number.total + "\n\n");
            if (number.total == 0) 
            {
                System.out.print("Input First Number : ");
                number.first = scan.nextInt();
            }
            System.out.println("1. Addition       [+]");
            System.out.println("2. Subtraction    [-]");
            System.out.println("3. Multiplication [*]");
            System.out.println("4. Division       [/]");
            System.out.println("5. Modulus        [%]");
            System.out.println("6. Clear Total    [CE]");
            System.out.println("7. EXIT");
            System.out.println("-----------------------------");
            System.out.print("Choose Menu (1 - 7) : ");
            number.choice = scan.nextInt();
            
            switch (number.choice) {
                case 1:
                    addition();
                    break;
                    
                case 2:
                    substraction();
                    break;
                    
                case 3:
                    multiPly();
                    break;
                    
                case 4:
                    divide();
                    break;
                    
                case 5:
                    module();
                    break;
                    
                case 6:
                    number.total = 0;
                    System.out.println("Total has been reset");
                    break;

                default:
                    break;
            }
        }while (number.choice != 7);
        System.out.println("\nThank U for using this Calculator!!!!");
    }
}