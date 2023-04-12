package org.example;

import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("String to be inverted: ");
        String sentence = scan.nextLine();

        System.out.println(inverter(sentence));

        scan.close();
    }

    public static String inverter(String sentence) {
        char[] line = sentence.toCharArray();

        for(int k = 0; k < line.length / 2; k++) {
            char aux = line[k];
            line[k] = line[line.length - (k + 1)];
            line[line.length - (k + 1)] = aux;
        }
        sentence = String.valueOf(line);
        return sentence;
    }
}