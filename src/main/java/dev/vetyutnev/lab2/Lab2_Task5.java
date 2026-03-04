package dev.vetyutnev.lab2;

import java.util.Scanner;

public class Lab2_Task5 {
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

        double e;
        if (x > y) {
            e = y * Math.sqrt(fx) + 3 * Math.sin(x);
        } else if (x < y) {
            e = x * Math.sqrt(Math.abs(fx));
        } else {
            e = Math.cbrt(Math.abs(fx)) + Math.pow(x, 3) / y;
        }

        System.out.print("Результат e = ");
        System.out.println(e);
    }
}