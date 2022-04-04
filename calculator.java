package com.me.alculator;

import java.util.Scanner;
import static java.lang.System.out;

public class calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner myScanner1 = new Scanner (System.in);
        @SuppressWarnings("resource")
		Scanner myScanner2 = new Scanner (System.in);
        @SuppressWarnings("resource")
		Scanner myScanner3 = new Scanner (System.in);
        int digittwo;       
        int digitone;
        String symbols1;
        String symbols2;
        String symbols3;
        String symbols4;
        String inputOne;
        symbols1 = ("*");
        symbols2 = ("/");
        symbols3 = ("+");
        symbols4 = ("-");
        out.println("welcome to calculator(whole numbers only :D)");
        out.println("first digit please");
        digitone = myScanner1.nextInt();
        out.println("digit 2 please");
        digittwo = myScanner2.nextInt();
        out.println("what formula (e.g. + - * /)");
        inputOne = (myScanner3.nextLine());
        if (inputOne.equals(symbols1)){
            out.print(digitone);
            out.print("*");
            out.print(digittwo);
            out.print("="); 
            out.println(digitone * digittwo);
        }
        if (inputOne.equals(symbols2)){
            out.print(digitone);
            out.print("/");
            out.print(digittwo);
            out.print("=");
            out.println(digitone / digittwo);

        }
        if (inputOne.equals(symbols3)){
            out.print(digitone);
            out.print("+");
            out.print(digittwo);
            out.print("=");
            out.println(digitone + digittwo);

        }
        if (inputOne.equals(symbols4)){
            out.print(digitone);
            out.print("-");
            out.print(digittwo);
            out.print("=");
            out.println(digitone - digittwo);
        }
        }


    }


