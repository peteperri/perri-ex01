/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Challenge:
Create a program that prompts for your name and
prints a greeting using your name.
Challenge: Write a version of the program
that displays different greetings for different people.

Pseudocode:
create a new scanner called 'input'
create an empty string variable 'name'
prompt the user with a string asking their name
assign the value of the user's input to 'name'
if the name is john:
    print "hey, my main man john! what's good?"
if the name is jane:
    print "hi, so good to see you jane!"
if the name is anakin:
    print "don't try it, i have the high ground!"
else:
    print "i dont believe we've met, nice to meet you!"

 */
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What's your name?");
        name = input.nextLine();
        if (name.equals("John")){
            System.out.println("hey, my main man John! what's good?");
        }
        else if (name.equals("Jane")){
            System.out.println("hi, so good to see you Jane!");
        }
        else if (name.equals("Anakin")){
            System.out.println("Don't try it! I have the high ground!");
        }
        else {
            System.out.println("I don't believe we've met, nice to meet you!");
        }
    }
}
