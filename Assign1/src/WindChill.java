import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter a Temperature");
        double T = UserInput.nextDouble();
        System.out.println("Enter a Wind Speed");
        double V = UserInput.nextDouble();

        double W = 35.74 + 0.6215*T + (0.4275*T - 35.75)*Math.pow(V, 0.16);

        String w1 = String.format("%.2f", W);

        System.out.println("The Temperature is " + T + " degrees, and the wind speed is " + V + ". \nThe windchill is " + w1);

    }
}
