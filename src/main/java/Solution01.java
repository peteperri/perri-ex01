/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Exercise:
Create a program that prompts for your name and
prints a greeting using your name.

Pseudocode:
create a new scanner called 'input'
create an empty string variable 'name'
prompt the user with a string asking their name
assign the value of the user's input to 'name'
print 'name' with a greeting message
 */
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.printf("Hello, %s! Nice to meet you!", name);
        }
    }
