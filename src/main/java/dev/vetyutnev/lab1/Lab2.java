package dev.vetyutnev.lab1;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лабораторная работа №2. Вариант 1.");

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите y: ");
        double y = scanner.nextDouble();

        System.out.println("Выберите функцию f(x):");
        System.out.println("1 - sh(x)");
        System.out.println("2 - x^2");
        System.out.println("3 - e^x");
        int choice = scanner.nextInt();

        double fx = 0;
        switch (choice) {
            case 1:
                fx = Math.sinh(x);
                System.out.println("Выбрана функция sh(x)");
                break;
            case 2:
                fx = Math.pow(x, 2);
                System.out.println("Выбрана функция x^2");
                break;
            case 3:
                fx = Math.exp(x);
                System.out.println("Выбрана функция e^x");
                break;
            default:
                System.out.println("Неверный выбор функции. Используется sh(x).");
                fx = Math.sinh(x);
        }

        double a;
        double prod = x * y;

        if (prod > 0) {
            a = Math.pow(fx + y, 2) - Math.cbrt(Math.abs(fx));
            System.out.println("Сработала ветвь: xy > 0");
        } else if (prod < 0) {
            a = Math.pow(fx + y, 2) + Math.sin(x);
            System.out.println("Сработала ветвь: xy < 0");
        } else {
            a = Math.pow(fx + y, 2) + Math.pow(y, 3);
            System.out.println("Сработала ветвь: xy = 0");
        }

        System.out.printf("Результат a = %.6f%n", a);
    }
}