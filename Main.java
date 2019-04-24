package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
import java.util.Random;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //Add two numbers given by the user.
        Scanner user = new Scanner(System.in);
        System.out.println("Enter 2 number: ");
        /*int num1 = user.nextInt();*/
        /*int num2 = user.nextInt();*/
       /* ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(num1);
        numList.add(num2);
        System.out.println(numList);*/

        //Write an application to divide 2 numbers.
        // Prompt the user to enter two numbers.
/*
        // Take the first number and divide it by the second number and print that result to the screen. If the second number is a zero, print "Undefined" to the screen, otherwise just print the result.
        int num3;
        if (num2==0){
            System.out.println("Undefinded");
        }else if (num2!=0){
            num3 = num1/num2;
            System.out.println(num3);
        }

        //Get 5 letters from the user, output them sorted
        ArrayList<String> letter = new ArrayList<String>();
        System.out.println("Typing a letter: ");
        String getLetter = user.nextLine();
        String L1 = user.nextLine();
        String L2 = user.nextLine();
        String L3 = user.nextLine();
        String L4 = user.nextLine();
        String L5 = user.nextLine();
        letter.add(L1);
        letter.add(L2);
        letter.add(L3);
        letter.add(L4);
        letter.add(L5);
        Collections.sort(letter);
        System.out.println(letter);

        //Get the length of a string
        String nameLength = "HelloWorld";
        int count = nameLength.Length;
        System.out.println("length of name: "+count);
*/

        //Get the average of 3 numbers.
       /* double num4 = user.nextDouble();
        double num5 = user.nextDouble();
        double num6 = user.nextDouble();
        double num7 = (num4+num5+num6)/3;
        System.out.println("An Average: " + num7 );*/

        //Check if a year is a leap year
        /*System.out.println("Enter year: ");
        int year = user.nextInt();
        boolean flag = false;
        if (year%4==0){
            flag = true;
            System.out.println("A leap year!");
        }else{
            flag = false;
            System.out.println("Not a leap year");
        }*/

        //Count all words in the sentence: The dog jumped over the fence
       /* String strName = "The dog jumped over the fence";
        String[] parts = strName.split("");
        int count = parts.length;
        System.out.println("The number of items is: " + count);*/

        //Calculate the area of a rectangle with length and width input from the user. (using num1,num2)
        /*System.out.println(num1*num2);*/

        //Print a 5 random numbers given a bound
       /* ArrayList<Integer> numList = new ArrayList<Integer>();
        Random score = new Random();
        int ranNumber;
        for (int i= 0; i<5;i++){
            ranNumber = score.nextInt(50);
            numList.add(ranNumber);
        }
        System.out.println(numList);
*/

       //Given the array list, print a random word from the list: (module, class, implement).
      /*  ArrayList<String> nameRandom = new ArrayList<>(Arrays.asList("module", "class", "implement"));
        Random list = new Random();
        String listName = nameRandom.get(list.nextInt(nameRandom.size()));
        System.out.println("Suggestion! "+listName);*/

      //Take integer input from the user, output whether it's odd or even.
       /* int num1 = user.nextInt();
        if (num1%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/

        //The letter grade is determined as follows:
        //A = 90–100%
        //B = 80–89%
        //C = 70–79%
        //D = 60–69%
        //F = 0–59%
        //Write a program that will print the letter grade based on the percentage entered.
        int score = user.nextInt();
        if(score<60) {
            System.out.println("F");

        }else if ( 60<= score && score <70) {
            System.out.println("D");

        }else if (70<=score && score<80) {
            System.out.println("C");

        }else if(80<=score && score<90) {
            System.out.println("B");

        }else  {
            System.out.println("A");

        }
        }

        }


