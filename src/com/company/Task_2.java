package com.company;

import java.util.Scanner;

public class Task_2 {
    static Scanner scanner =new Scanner(System.in);
     static public void getTask_2(){
            System.out.printf("your name is  %s \n"+
                    "your age is  %d \n" +
                    "your email is  %s \n"+
                    "your uni is  %s \n"+
                    "",getName(),getAge(),getEmail(),getUni());

            scanner.close();
    }
    static public String getName(){
        System.out.println("Enter your name");
        return scanner.nextLine();
    }
    static public String  getEmail(){
        System.out.println("Enter your Email");
        return scanner.nextLine();
    }
    static public String getUni(){
        System.out.println("Enter your Uni");
        return  scanner.nextLine();
    }
    static public int getAge(){
        System.out.println("Enter your Age");
        return Integer.parseInt(scanner.nextLine());

    }
}
