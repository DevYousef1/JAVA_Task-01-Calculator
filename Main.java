package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("This is a simple calculator\n" +
                "Enter 1st number: ");
        Scanner userInput = new Scanner(System.in);
        int firstNum = userInput.nextInt();
        System.out.println("Enter 2nd number: ");
        int secondNum = userInput.nextInt();
        System.out.println("You want to: + or - or * or / \n" +
                "Enter a simple");
        String simple = userInput.next();

        switch (simple){
            case "+":
                System.out.print(firstNum + " + " + secondNum + " = ");
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.print(firstNum + " - " + secondNum + " = ");
                System.out.println(firstNum - secondNum);
                break;
            case "/":
                System.out.print(firstNum + " / " + secondNum + " = ");
                System.out.println(firstNum / secondNum);
                break;
            case "*":
                System.out.print(firstNum + " * " + secondNum + " = ");
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Default");
        }

    }
}
