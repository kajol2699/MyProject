package program.sample.main;
import java.util.Scanner;

import program.sample.controller.Calculator;

public class App {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        System.out.println();
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        cal.add(a, b);
        cal.mul(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        sc.close();
    }
}