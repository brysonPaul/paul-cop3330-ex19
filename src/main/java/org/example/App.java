/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
       Scanner sc= new Scanner(System.in);
       float height = 0 , weight = 0;
       while(true) {
           try{
               height = Float.parseFloat(strIO("Please enter your height in inches: ",sc));
               weight = Float.parseFloat(strIO("Please enter your weight in pounds: ",sc));
           }
           catch(Exception ex){
                System.out.println("Please only enter numeric values. Try again.");
                continue;
           }
           break;
       }
       float bmi= (weight / (height * height)) * 703;
       System.out.println("Your BMI is "+bmi);
       String overOrUnderWeight=" ";
       if(bmi >= 18.5 && bmi <= 25){
           System.out.println("You are within the ideal weight range.");
           return;
       }
       else if (bmi < 18.5){
           overOrUnderWeight = "underweight";
       }
       else{
           overOrUnderWeight = "overweight";
       }
       System.out.println("You are "+overOrUnderWeight+". You should see your doctor.");

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
