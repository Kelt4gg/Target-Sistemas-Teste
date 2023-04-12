package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int previusNumber = 0, currentNumber = 1;
        int inputNumber = 0;
        boolean isAFibonacciNumber = false;
        try {
            System.out.print("Enter a number: ");
            inputNumber = scan.nextInt();
        } catch(Exception e) {
            System.out.println("The number needs to be a integer");
            return;
        } finally {
            scan.close();
        }
        while(currentNumber < inputNumber) {
            int nextNumber = previusNumber + currentNumber;
            previusNumber = currentNumber;
            currentNumber = nextNumber;

            if(currentNumber == inputNumber) {
                isAFibonacciNumber = true;
            }
        }
        if (isAFibonacciNumber) {
            System.out.println("This numbers belongs to fibonacci sequence");
        } else {
            System.out.println("This number does not belong to the fibonacci sequence");
        }
    }
}
