package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("This is a simple calculator\n" +
                "Enter 1st number: ");
        Scanner firstInput = new Scanner(System.in);
        int firstNum = firstInput.nextInt();
        System.out.println("Enter 2nd number: ");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();
        System.out.println("You want to: + or - or * or / \n" +
                "Enter a simple");
        Scanner userSimple = new Scanner(System.in);
        String simple = userSimple.next();

        switch (simple){
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Default");
        }

    }
}
