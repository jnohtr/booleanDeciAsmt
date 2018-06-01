package com.company;

import java.util.Scanner;

public class booleanDeciAsmt {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score >89)
            grade ='A';
        else if (score > 79)
            grade = 'B';
        else if (score >69)
            grade = 'C';
        else if (score > 59)
            grade = 'D';
        else
            grade = 'F';

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");

        if (score % 10 > 6)
            System.out.print(grade + "+");
        /*else if (score % 10 >6 && score % 10 < 3)
            System.out.print(grade);
        else //(score % 10 < 4)
            System.out.print(grade + '-');*/
        else if (score % 10 <4)
            System.out.print(grade + "-");
        else
            System.out.print(grade);

    }
}
