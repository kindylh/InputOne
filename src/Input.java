//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - Kindyl Hogan
//DATE - 9/15/23
//PURPOSE -

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables of at least 2 different types
        double doubleOne;
        String stringOne;

        System.out.print("integer One :: ");
        intOne = keyboard.nextInt();


        System.out.print("integer Two ::  ");
        intTwo = keyboard.nextInt();

        System.out.print("double One :: ");
        doubleOne = keyboard.nextDouble();
        //add in input for all variables
        System.out.print("String One :: ");
        stringOne = keyboard.next();

        System.out.println();
        System.out.println("integer One = " + intOne );
        System.out.println("integer Two = " + intTwo );
        System.out.println("double One = " +  doubleOne );
        System.out.println("String One = " + stringOne );
        //add output for all variables


    }
}