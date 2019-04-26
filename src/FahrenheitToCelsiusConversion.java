import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

    public static void main(String [] args){
        int Fahrenheit1;
        int Fahrenheit2;
        int Fahrenheit3;
        double Celsius1;
        double Celsius2;
        double Celsius3;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit at 8:00am >>");
        Fahrenheit1 = input.nextInt();
        System.out.println("Please enter the temperature in Fahrenheit at 12:00pm >>");
        Fahrenheit2 = input.nextInt();
        System.out.println("Please enter the temperature in Fahrenheit at 5:00pm >>");
        Fahrenheit3 = input.nextInt();

        Celsius1 = convert(Fahrenheit1);
        Celsius2 = convert(Fahrenheit2);
        Celsius3 = convert(Fahrenheit3);

        System.out.println("At 8:00 am the temperature was " + Fahrenheit1 + " Fahrenheit and " + Celsius1 + " Celsius.");
        if (Fahrenheit1 < 32)
            System.out.println(". It is freezing, put on more clothes");
        if (Fahrenheit1 > 100)
            System.out.println("It is Hot outside! Take off some clothes and stay inside.");
        System.out.println("At 12:00 pm the temperature was " + Fahrenheit2 + " Fahrenheit and " + Celsius2 + " Celsius.");
        if (Fahrenheit2 < 32)
            System.out.println(". It is freezing, put on more clothes");
        if (Fahrenheit2 > 100)
            System.out.println("It is Hot outside! Take off some clothes and stay inside.");
        System.out.println("At 5:00 pm the temperature was " + Fahrenheit3 + " Fahrenheit and " + Celsius3 + " Celsius.");
        if (Fahrenheit3 < 32)
            System.out.println(". It is freezing, put on more clothes");
        if (Fahrenheit3 > 100)
            System.out.println("It is Hot outside! Take off some clothes and stay inside.");

    }
    public static double convert(int f){
        double c;
        c = (f-32)*.55555;
        return c;
    }
}