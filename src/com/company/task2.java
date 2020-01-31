package com.company;

import java.util.Arrays;
import java.util.Random;

/*3) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.*/
public class task2 {

    static final Random RANDOM = new java.util.Random();

    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = RANDOM.nextInt(11) + 10;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int result = sum / arr.length;
        System.out.println("avg = " + result);
    }

}
