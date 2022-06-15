package com.company;

import java.util.Comparator;

public class CombSort {

    public static <T> void sort (T[] input, Comparator<T> comparator) {
        int gp = input.length;
        boolean swd = true;
        while (gp > 1 || swd) {
            if (gp > 1)
                gp = (int) (gp / 1.247330950103979);

            int i = 0;
            swd = false;
            while (i + gp < input.length) {
                if (comparator.compare(input[i], input[i + gp]) > 0) {
                    T p = input[i];
                    input[i] = input[i + gp];
                    input[i + gp] = p;
                    swd = true;
                }
                i++;
            }
        }
    }
}