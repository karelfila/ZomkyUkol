package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo:");
        float input = sc.nextInt();
        float a = input + 1;
        input = 1;
        float output = 0;
        while(input != a) {
            float divide = (1 / input);
            System.out.println("1/" + input + " => " + divide);
            input++;
            output += divide;
        }
        System.out.println(output);
    }
}
