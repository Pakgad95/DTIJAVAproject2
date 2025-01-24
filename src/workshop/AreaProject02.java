package workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        int choice;
        double base, widths, high, longs, radius, square, triangle, circle;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++");
        System.out.println("Shape Area Program");
        System.out.println("++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("1.Circle Area");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Select menu : ");
        choice = Integer.parseInt(reader.readLine());
        System.out.println("++++++++++++++++++++++");

        switch (choice) {
            case 1:
                System.out.println("++++++++++++++++++++++++++++++++++++++++");
                System.out.print("Input widths: ");
                widths = Double.parseDouble(reader.readLine());
                System.out.print("Input longs: ");
                longs = Double.parseDouble(reader.readLine());
                square = widths * longs;
                System.out.println("Area of Square is : " + df.format(square));
                break;
            case 2:
                System.out.println("++++++++++++++++++++++++++++++++++++++++");
                System.out.print("Input bases: ");
                base = Double.parseDouble(reader.readLine());
                System.out.print("Input highs: ");
                high = Double.parseDouble(reader.readLine());
                triangle = base * high / 2;
                System.out.println("Area of Triangle is : " + df.format(triangle));
                break;
            case 3:
                System.out.println("++++++++++++++++++++++++++++++++++++++++");
                System.out.print("Input radius : ");
                radius = Double.parseDouble(reader.readLine());
                circle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle is : " + df.format(circle));
                break;
            default:
                System.out.println("Thank you bye bye");


        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
