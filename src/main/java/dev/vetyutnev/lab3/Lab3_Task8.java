package dev.vetyutnev.lab3;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел k: ");
        int k = scanner.nextInt();

        double[] array = new double[k];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextDouble();
        }

        ArrayList<Double> negatives = new ArrayList<>();
        ArrayList<Double> positives = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (array[i] < 0) {
                negatives.add(array[i]);
            } else {
                positives.add(array[i]);
            }
        }

        System.out.print("Преобразованный массив: ");
        for (double val : negatives) {
            System.out.print(val + " ");
        }
        for (double val : positives) {
            System.out.print(val + " ");
        }
    }
}
