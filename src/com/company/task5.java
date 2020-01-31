package com.company;
/*
6*) Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это
 слово. Например, в данном случае для слова test метод должен вернуть true:*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class task5 {

    static final int x = 5;
    static final int y = 3;

    public static void main(String[] args) throws Exception {
        String s = readFileAsString(".\\src\\com\\company\\input.txt");
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
        char[][] arr = new char[y][x];
        for (int i = 0, ch = 0; i < y; i++) {
            if (i == arr[0].length) {
                i = 0;
            }
            for (int j = 0; j < x; j++, ch++) {
                if (i == arr[0].length && j == arr.length) {
                    break;
                }
                if (ch >= s.length()) {
                    break;
                }
                if (i >= arr.length) {
                    j = 0;
                }
                arr[i][j] = s.charAt(ch);
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(search("aa", arr));
    }


    static boolean search(String key, char[][] arr) {
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                sb1.append(arr[r][c]);
            }
        }
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = 0; r < arr.length; r++) {
                sb2.append(arr[r][c]);
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        if (sb1.toString().contains(key) || sb2.toString().contains(key)) {
            return true;
        } else {
            return false;
        }
    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

}
