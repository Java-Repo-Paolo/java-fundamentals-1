package org.lessons.java.fizzbuzz;

public class fizzbuzz {
    public static void main(String[] args) {
        int number = 100;
        System.out.print("Number from 1 - " + number + " are: ");
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i + " ");
            }
        }
    }
}
