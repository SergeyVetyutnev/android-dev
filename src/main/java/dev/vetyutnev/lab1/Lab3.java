package dev.vetyutnev.lab1;

public class Lab3 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 1.0;
        int n = 160;

        double h = (b - a) / 10.0;

        System.out.println("Лабораторная работа №3. Вариант 1.");
        System.out.printf("Интервал [%.1f; %.1f], шаг h=%.4f, n=%d%n", a, b, h, n);
        System.out.printf("%-10s | %-20s | %-20s%n", "x", "S(x) (Ряд)", "Y(x) (Math)");

        for (double x = a; x <= b + h / 2; x += h) {
            double s = 0;
            double term = x;
            s += term;

            for (int k = 1; k <= n; k++) {
                term *= -1.0 * x * x / (2 * k * (2 * k + 1));
                s += term;
            }

            double y = Math.sin(x);
            System.out.printf("%-10.4f | %-20.15f | %-20.15f%n", x, s, y);
        }
    }
}
