package com.company;

/*4) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()*/

public class task3 {

    static String s() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= 30; i++) {
            sb.append("(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(s());
    }
}
