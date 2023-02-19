

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        // Scanner UserInput = new Scanner(System.in);
        // System.out.println("Enter a Temperature");
        // double T = UserInput.nextDouble();
        // System.out.println("Enter a Wind Speed");
        // double V = UserInput.nextDouble();

        // double W = 35.74 + 0.6215*T + (0.4275*T - 35.75)*Math.pow(V, 0.16);

        // String w1 = String.format("%.2f", W);

        // System.out.println("The Temperature is " + T + " degrees, and the wind speed is " + V + ". \nThe windchill is " + w1);

        

        if (args.length !=2) {
            System.out.println("Program must have 2 commad line arguments");
            System.exit(0);
        }

        double T = Double.parseDouble(args[0]);
        double V = Double.parseDouble(args[1]); 

        double W = 35.74 + 0.6215*T + (0.4275*T - 35.75)*Math.pow(V, 0.16);
        String w1 = String.format("%.2f", W);

        System.out.println("The Temperature is " + T + " degrees, and the wind speed is " + V + ". \nThe windchill is " + w1);
    }
}
