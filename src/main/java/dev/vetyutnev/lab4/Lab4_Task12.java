package dev.vetyutnev.lab4;

import java.util.Scanner;
import java.util.Locale;
import java.io.*;

public class Lab4_Task12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        File file = new File("buses.txt");
        PrintWriter writer = new PrintWriter(file);

        System.out.print("Количество рейсов: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Номер рейса: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Пункт назначения: ");
            String dest = scanner.nextLine();
            System.out.print("Час прибытия: ");
            int hour = Integer.parseInt(scanner.nextLine());
            writer.println(id + ";" + dest + ";" + hour);
        }
        writer.close();

        System.out.print("Введите предельный час прибытия: ");
        int limit = Integer.parseInt(scanner.nextLine());

        System.out.println("Подходящие рейсы:");
        Scanner fileScanner = new Scanner(file).useLocale(Locale.US);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(";");

            int id = Integer.parseInt(parts[0]);
            String dest = parts[1];
            int hour = Integer.parseInt(parts[2]);

            if (hour < limit) {
                System.out.println("Рейс №" + id + " в " + dest);
            }
        }
        fileScanner.close();
    }
}
