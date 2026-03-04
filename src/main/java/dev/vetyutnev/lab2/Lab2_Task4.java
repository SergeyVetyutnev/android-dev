package dev.vetyutnev.lab2;

import java.util.Scanner;

public class Lab2_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите y: ");
        double y = scanner.nextDouble();

        System.out.println("Выберите f(x): 1 - sinh(x), 2 - x^2, 3 - exp(x)");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        double fx;
        switch (choice) {
            case 1:
                fx = Math.sinh(x);
                break;
            case 2:
                fx = Math.pow(x, 2);
                break;
            case 3:
                fx = Math.exp(x);
                break;
            default:
                fx = Math.sinh(x);
                break;
        }

        double d;
        if (x > y) {
            d = Math.cbrt(fx - y) + Math.tan(fx);
        } else if (x < y) {
            d = Math.pow(y - fx, 3) + Math.cos(fx);
        } else {
            d = Math.pow(y + fx, 2) + Math.pow(x, 3);
        }

        System.out.print("Результат d = ");
        System.out.println(d);
    }
}