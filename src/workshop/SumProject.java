package workshop;

import java.util.Scanner;

public class SumProject {
    //ป้อนตัวเลข 2 จำนวนทางแป้นพิมพ์
    public static void main(String[] args) {
        double n1, n2, sum;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number 1 : ");
            n1 = sc.nextDouble();
            System.out.print("Enter number 2 : ");
            n2 = sc.nextDouble();
            sum = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + sum);
            System.out.println("----------------------");
        }while(sum <= 500);
    }
}
