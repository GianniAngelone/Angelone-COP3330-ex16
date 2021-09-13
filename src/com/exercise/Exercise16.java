/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Here we grab input from the user
        System.out.print("What is your age? ");
        int age = scan.nextInt();
        //Here we must check if the users age is greater than or equal to, or less than 16.
        String answer = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.print(answer);
    }
}