import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the Temperature in Celsius");
        double C = in.nextDouble();
        String trash;
        double F = (C * 1.8) + 32;
        System.out.println("Your Value from Celsius to Fahrenheit is: " + F);

        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            C = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("The number you gave was: " + trash);
            System.out.println("Run the program again, and use a valid number please");
            System.exit(0);  // terminate the program
        }
        System.exit(0);
    }
}