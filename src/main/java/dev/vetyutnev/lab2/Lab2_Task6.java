package dev.vetyutnev.lab2;

import java.util.Scanner;

public class Lab2_Task6 {
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

        double g;
        double product = x * y;

        if (product > 0.5 && product < 10) {
            g = Math.exp(fx - Math.abs(y));
        } else if (product > 0.1 && product <= 0.5) {
            g = Math.cbrt(Math.abs(fx + y));
        } else {
            g = 2 * Math.pow(fx, 2);
        }

        System.out.print("Результат g = ");
        System.out.println(g);
    }
}