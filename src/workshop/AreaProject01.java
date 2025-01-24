package workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int choice;
        double base, widths, high, longs, radius, square, triangle, circle;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("++++++++++++++++++++++");
        System.out.println("Shape Area Program");
        System.out.println("++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("1.Circle Area");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Select menu : ");
        choice = sc.nextInt();
        System.out.println("++++++++++++++++++++++");

        if (choice == 1) {
            System.out.println("++++++++++++++++++++++");
            System.out.println("Shape Area Program");
            System.out.println("++++++++++++++++++++++");
            System.out.println("1.Square Area");
            System.out.println("2.Triangle Area");
            System.out.println("3.Circle Area");
            System.out.println("++++++++++++++++++++++");
            System.out.println("Select menu : " + choice);
            System.out.println("++++++++++++++++++++++");
            System.out.print("Input widths : " );
            widths = sc.nextDouble();
            System.out.print("Input longs : ");
            longs = sc.nextLong();
            System.out.println("Area of Square is : " + widths*longs);
            System.out.println("+++++++++++++++++++++++++");

        } else if ( choice == 2) {
            System.out.println("++++++++++++++++++++++");
            System.out.println("Shape Area Program");
            System.out.println("++++++++++++++++++++++");
            System.out.println("1.Square Area");
            System.out.println("2.Triangle Area");
            System.out.println("1.Circle Area");
            System.out.println("++++++++++++++++++++++");
            System.out.println("Select menu : " + choice);
            System.out.println("++++++++++++++++++++++");
            System.out.print("Input bases : " );
            base = sc.nextDouble();
            System.out.print("Input highs : ");
            high = sc.nextDouble();
            System.out.println("Area of Triangle is : " + (base * high / 2));
            System.out.println("+++++++++++++++++++++++++");


        } else if (choice == 3) {
            System.out.println("++++++++++++++++++++++");
            System.out.println("Shape Area Program");
            System.out.println("++++++++++++++++++++++");
            System.out.println("1.Square Area");
            System.out.println("2.Triangle Area");
            System.out.println("1.Circle Area");
            System.out.println("++++++++++++++++++++++");
            System.out.println("Select menu : " + choice);
            System.out.println("++++++++++++++++++++++");
            System.out.print("Input radius : " );
            radius = sc.nextDouble();
            System.out.println("Area of Triangle is : " + Math.PI * radius * radius);
            System.out.println("+++++++++++++++++++++++++");

        }else {
            System.out.println("Thank you...bye...bye >_<");
        }
        System.out.println("+++++++++++++++++++++++++");
        }
    }






