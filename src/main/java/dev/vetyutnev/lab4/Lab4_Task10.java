package dev.vetyutnev.lab4;

import java.util.Scanner;
import java.util.Locale;
import java.io.*;

public class Lab4_Task10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        File file = new File("goods.txt");
        PrintWriter writer = new PrintWriter(file);

        System.out.print("Введите количество товаров: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("--- Товар №" + (i + 1) + " ---");
            System.out.print("Наименование: ");
            String name = scanner.nextLine();

            System.out.print("Количество: ");
            int count = Integer.parseInt(scanner.nextLine());

            System.out.print("Цена: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Сколько дней на складе: ");
            int days = Integer.parseInt(scanner.nextLine());

            writer.println(name + ";" + count + ";" + price + ";" + days);
        }
        writer.close();

        System.out.println("\nРезультаты фильтрации (хранятся более 30 дней и сумма > 1 000 000):");
        Scanner fileScanner = new Scanner(file).useLocale(Locale.US);

        boolean found = false;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(";");

            String name = parts[0];
            int count = Integer.parseInt(parts[1]);
            double price = Double.parseDouble(parts[2]);
            int days = Integer.parseInt(parts[3]);

            if (days > 30 && (count * price) > 1000000) {
                System.out.printf("Товар: %s | Общая стоимость: %.2f%n", name, (count * price));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Товары, подходящие под условия, не найдены.");
        }

        fileScanner.close();
    }
}
