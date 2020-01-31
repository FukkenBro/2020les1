package com.company;

//5*) Написать метод который убирает лишние пробелы в строке и возвращает строку.
//
//        Убрать начальные, конечные и между словами должно быть не больше 1 пробела.

public class Task4 {
    public static void main(String[] args) {
        String s = "      /  /     /           / /   /             /   /      /                         /      ";
        System.out.println(format(s));
    }

    static String format(String s) {
        s = s.replaceAll(" {2,}", " ");
        return s.trim();
    }
}
