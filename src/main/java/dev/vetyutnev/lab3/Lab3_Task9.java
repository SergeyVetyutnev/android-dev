package dev.vetyutnev.lab3;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество символов k: ");
        int k = scanner.nextInt();

        char[] array = new char[k];
        System.out.println("Введите символы через пробел:");
        for (int i = 0; i < k; i++) {
            array[i] = scanner.next().charAt(0);
        }

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> others = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (Character.isDigit(array[i])) {
                digits.add(array[i]);
            } else {
                others.add(array[i]);
            }
        }

        System.out.print("Массив с цифрами: ");
        for (char c : digits) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.print("Массив с остальными символами: ");
        for (char c : others) {
            System.out.print(c + " ");
        }
    }
}
