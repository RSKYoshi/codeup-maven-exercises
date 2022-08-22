package main;
//import com.google.common.collect.Lists;
//import java.util.List;
import org.apache.commons.lang3.StringUtils;
import util.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("hello world!");
//        List<String> names = Lists.newArrayList("John", "Adam", "Jane");
//        System.out.println(names);
//        List<String> reversed = Lists.reverse(names);
//        System.out.println(reversed);
        //for guava up top


//        Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//
//        System.out.println("");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
        System.out.println("Enter String: ");
        //Check for number
        String userInput=input.getString();
//        System.out.println(StringUtils.isNumeric(userInput));
        if(StringUtils.isNumeric(userInput)){
            System.out.printf("%n%s contains a number",userInput);
        } else {
            System.out.printf("%n%s does not contain a number%n",userInput);
        }
        //switch case
        System.out.printf("%nSwitched input case: ");
        System.out.println(StringUtils.swapCase(userInput));
        //reversed string
        System.out.printf("%nReversed string: ");
        System.out.println(StringUtils.reverse(userInput));
    }



}

