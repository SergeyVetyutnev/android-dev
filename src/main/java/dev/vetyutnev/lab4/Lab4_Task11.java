package dev.vetyutnev.lab4;

import java.util.Scanner;
import java.util.Locale;
import java.io.*;

public class Lab4_Task11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        File file = new File("students.txt");
        PrintWriter writer = new PrintWriter(file);

        System.out.print("Количество студентов: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Фамилия: ");
            String fio = scanner.nextLine();
            System.out.print("Группа: ");
            String group = scanner.nextLine();
            System.out.print("Доход: ");
            double income = Double.parseDouble(scanner.nextLine());
            writer.println(fio + ";" + group + ";" + income);
        }
        writer.close();

        double minWage2 = 1000.0;
        System.out.println("Студенты с низким доходом:");
        Scanner fileScanner = new Scanner(file).useLocale(Locale.US);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(";");

            String fio = parts[0];
            String group = parts[1];
            double income = Double.parseDouble(parts[2]);

            if (income < minWage2) {
                System.out.println(fio + " из группы " + group);
            }
        }
        fileScanner.close();
    }
}
