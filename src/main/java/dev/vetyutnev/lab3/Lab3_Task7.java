package dev.vetyutnev.lab3;

import java.util.Scanner;

public class Lab3_Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива k: ");
        int k = scanner.nextInt();

        int[] array = new int[k];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите число позиций для сдвига n: ");
        int n = scanner.nextInt();

        n = n % k;
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int newPos = (i + n) % k;
            result[newPos] = array[i];
        }

        System.out.print("Результат сдвига вправо: ");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
