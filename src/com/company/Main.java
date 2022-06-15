package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);

        ComparatorS mc = new ComparatorS();

        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt();
        String org[] = new String[size];
        System.out.println("Введите слова через пробел:");
        for (int i = 0; i < size; i++) {
            org [i] = scanner.next();
        }
        int j = 0;

        CombSort.sort(org, mc);
        for (int i = 0; i < size; i++){
            System.out.println(org[i]);
        }




    }
}
