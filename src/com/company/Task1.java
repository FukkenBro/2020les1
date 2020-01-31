package com.company;

//2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
//
//        - если число кратно 3 то вместо него вывести Hello
//
//        - если число кратно 5 то вместо него вывести World
//
//        - если число кратно и 3 и 5 то вместо него вывести HelloWorld

public class Task1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Hello");
            }
            if (i % 5 == 0) {
                sb.append("World");
            }
            if (sb.toString().equals("")) {
                sb.append(i);
            }
            sb.append(" ");
            System.out.print(sb.toString());
        }
    }
}


