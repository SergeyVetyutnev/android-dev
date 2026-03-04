package dev.vetyutnev.lab1;

public class Lab1 {
    public static void main(String[] args) {
        double x = 14.26;
        double y = -1.22;
        double z = 3.5e-2;

        System.out.println("Лабораторная работа №1. Вариант 1.");
        System.out.printf("Входные данные: x = %.4f, y = %.4f, z = %.4f%n", x, y, z);


        double numerator = 2 * Math.cos(x - 2.0 / 3.0);

        double denominator = 0.5 + Math.pow(Math.sin(y), 2);

        double fraction2 = (z * z) / (3 - (z * z) / 5.0);

        double s = (numerator / denominator) * (1 + fraction2);

        System.out.printf("Результат s = %.6f%n", s);
        System.out.println("Ожидаемый результат: 0.749155");
    }
}
