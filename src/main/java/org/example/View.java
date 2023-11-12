package org.example;

import java.util.Scanner;

class View{


    public static int inputNum(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        int n = scan.nextInt();
        return n;
    }
    public static String inputStr(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        String text = scan.nextLine();
        return text;
    }
}